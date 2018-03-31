package com.suleiman.pagination.retailer.model.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by mchauhan on 1/19/2018.
 */

public class CategorySales implements Parcelable {


    protected CategorySales(Parcel in) {
        header = in.readString();
        Sale = in.createTypedArrayList(CategorySales.SalesModel.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(header);
        dest.writeTypedList(Sale);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CategorySales> CREATOR = new Creator<CategorySales>() {
        @Override
        public CategorySales createFromParcel(Parcel in) {
            return new CategorySales(in);
        }

        @Override
        public CategorySales[] newArray(int size) {
            return new CategorySales[size];
        }
    };

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public ArrayList<SalesModel> getSale() {
        return Sale;
    }

    public void setSale(ArrayList<SalesModel> sale) {
        this.Sale = sale;
    }

    String header = "";
    ArrayList<SalesModel> Sale = new ArrayList<>();

    public static class SalesModel implements Parcelable {

        protected SalesModel(Parcel in) {
            totalSale = in.readString();
            productcategory = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(totalSale);
            dest.writeString(productcategory);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<SalesModel> CREATOR = new Creator<SalesModel>() {
            @Override
            public SalesModel createFromParcel(Parcel in) {
                return new SalesModel(in);
            }

            @Override
            public SalesModel[] newArray(int size) {
                return new SalesModel[size];
            }
        };

        public String getTotalSale() {
            return totalSale;
        }

        public void setTotalSale(String totalSale) {
            this.totalSale = totalSale;
        }

        public String getProductcategory() {
            return productcategory;
        }

        public void setProductcategory(String productcategory) {
            this.productcategory = productcategory;
        }

        @SerializedName("TotalSale")
        @Expose
        private String totalSale;

        @SerializedName("ProductCategory")
        @Expose
        private String productcategory;


    }
}

