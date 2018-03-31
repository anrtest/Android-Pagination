package com.suleiman.pagination;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.suleiman.pagination.retailer.model.Authentication;
import com.suleiman.pagination.retailer.model.request.ViewRetail_Request;
import com.suleiman.pagination.retailer.model.response.ViewRetailerResponse;
import com.suleiman.pagination.utils.PaginationScrollListener;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    PaginationAdapter adapter;
    LinearLayoutManager linearLayoutManager;

    RecyclerView rv;
    ProgressBar progressBar;

    private static final int PAGE_START = 0;
    private boolean isLoading = false;
    private boolean isLastPage = false;
    //    private int TOTAL_PAGES = 3;
    private int currentPage = PAGE_START;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.main_recycler);
        progressBar = (ProgressBar) findViewById(R.id.main_progress);

        adapter = new PaginationAdapter(this);

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(linearLayoutManager);

        rv.setItemAnimator(new DefaultItemAnimator());

        rv.setAdapter(adapter);

        rv.addOnScrollListener(new PaginationScrollListener(linearLayoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                currentPage += 1;

                // mocking network delay for API call
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getRetailersList(++count);
                    }
                }, 1000);
            }

//            @Override
//            public int getTotalPageCount() {
//                return TOTAL_PAGES;
//            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });
//
//        getRetailersList(0);


        // mocking network delay for API call
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getRetailersList(count);
            }
        }, 1000);

    }

    int count = 0;


    public String readTextFileFromRaw(Activity activity, int rawFileId) {
        BufferedReader reader;
        //ArrayList<String> stateList = new ArrayList<>();
        String str = "";

        try {

            final InputStream file = activity.getResources().openRawResource(rawFileId);
            reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            str = line;
//            while (line != null) {
////                Log.d("StackOverflow", line);
//                line = reader.readLine();
//                if (line != null && !TextUtils.isEmpty(line)) {
//                    //stateList.add(line);
//                    str = line;
//                }
//
//            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        //return stateList;
        return str;
    }

    // TODO: 31-03-2018
    private String s = "0289089023190";

    public void getRetailersList(/*ProgressDialog progressDialog, */final int pageIndex) {

        String str = readTextFileFromRaw(this, R.raw.state_file) + ",\"page\":\"" + pageIndex + "\"}";

        if (pageIndex > 0) {
            str = str + s;
        }

        if (!retry.equals(Retry.RETRY3))
            asyncService(false, false, MainActivity.this, str, new HitResponseLisner() {
                @Override
                public void onSuccess(String response, ProgressDialog loaderDialog) {
                    System.out.println("Response is: " + response);
                    if (pageIndex == 0) {
                        progressBar.setVisibility(View.GONE);
                    }
                    shouldRetry = true;

                    Gson gson = new Gson();

                    Type baseType = new TypeToken<ViewRetailerResponse>() {
                    }.getType();

                    ViewRetailerResponse viewRetailerResponse = gson.fromJson(response, baseType);

                    adapter.removeLoadingFooter();
                    isLoading = false;

                    adapter.addAll(viewRetailerResponse.getDealerList().getDealers());

                    if (/*currentPage != TOTAL_PAGES*/viewRetailerResponse.getDealerList().getDealers().size() == 20)
                        adapter.addLoadingFooter();
                    else isLastPage = true;
                }

                @Override
                public void onError(String response) {
                    adapter.removeLoadingFooter();
                    if (retry.equals(Retry.RETRY1)) {
                        retry = Retry.RETRY2;
                        getRetailersList(pageIndex);
                    } else if (retry.equals(Retry.RETRY2)) {
                        retry = Retry.RETRY3;
                    }


                    Toast.makeText(MainActivity.this, "onError"+(++x), Toast.LENGTH_SHORT).show();
                }
            });


    }

    private int x = 0;
    private Retry retry = Retry.RETRY1;

    enum Retry {
        RETRY1, RETRY2, RETRY3
    }

    boolean shouldRetry = true;


    public interface HitResponseLisner {
        void onSuccess(String response, ProgressDialog loaderDialog);

        void onError(String response);
    }

    public synchronized static void asyncService(final boolean cancellableProgress, final boolean showProgress, final Context context, final String requestJSon, final HitResponseLisner hitResponseLisner) {
        if (context == null) {
            return;
        }

        @SuppressLint("StaticFieldLeak") AsyncTask task = new AsyncTask() {

            ProgressDialog loaderDialog = null;
            String mResponse = "";

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                if (showProgress) {
                    loaderDialog = new ProgressDialog(context);
                    if (loaderDialog == null) {
                        loaderDialog = new ProgressDialog(context);
                    }
                    loaderDialog.setCancelable(cancellableProgress);
                    loaderDialog.show();
                }
            }

            @Override
            protected Object doInBackground(Object[] params) {
                mResponse = hitServiceBackground(context, requestJSon);
                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);

                if (loaderDialog != null) {
                    loaderDialog.dismiss();
                }

//                if (showProgress && loaderDialog != null && loaderDialog.isShowing()) {
//                    if (!((Activity) context).isDestroyed()) {
//                        loaderDialog.dismiss();
//                    }
//                }

                if (!TextUtils.isEmpty(mResponse)) {
                    hitResponseLisner.onSuccess(mResponse, loaderDialog);
                } else {
                    if (showProgress) {
                        //UtilityFunctions.showErrorToast(context, context.getString(R.string.some_thing_went_wrong));
                        Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }

                    if (hitResponseLisner != null) {
                        hitResponseLisner.onError(mResponse);
                    }

                }

            }
        };
        task.execute();

    }


    private static String hitServiceBackground(Context context, String requestJSon) {
        String mResponse = "";
        //Log.i("Request - ", requestJSon);

        try {
            HttpClient client = new DefaultHttpClient();

            String url = "http://ddmsapp.kent.co.in:8094/KentRiseService.asmx/perform_action";

            HttpPost post = new HttpPost(url);
            if (requestJSon != null) {
                List<NameValuePair> postRequestParams = new ArrayList<>();
                postRequestParams.add(new BasicNameValuePair("request", requestJSon));

                post.setEntity(new UrlEncodedFormEntity(postRequestParams));
            }

            HttpConnectionParams.setConnectionTimeout(client.getParams(), 20000);
            HttpConnectionParams.setSoTimeout(client.getParams(), 45000);
            HttpResponse response = client.execute(post);

            /* ************************ */

            mResponse = stringifyResponse(response);
            Log.i("Response - ", mResponse);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return mResponse;

    }

    public static String stringifyResponse(HttpResponse response) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer buffer = new StringBuffer("");
            String line = "";
            //Loops the reader
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();

            return buffer.toString();

        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
