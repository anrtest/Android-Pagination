package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by shankitk on 2/7/2018.
 */

public class SendOtpRequest extends RequestAuthUserIdBase implements Parcelable {

    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;


    public SendOtpRequest() {

    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    protected SendOtpRequest(Parcel in) {

        mobileNumber = in.readString();
    }

    public static final Creator<SendOtpRequest> CREATOR = new Creator<SendOtpRequest>() {
        @Override
        public SendOtpRequest createFromParcel(Parcel in) {
            return new SendOtpRequest(in);
        }

        @Override
        public SendOtpRequest[] newArray(int size) {
            return new SendOtpRequest[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mobileNumber);
    }
}
