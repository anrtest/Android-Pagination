package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mchauhan on 1/8/2018.
 */

public class DistributorBase implements Parcelable {
    @SerializedName("DistributorName")
    @Expose
    private String DistributorName;

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    boolean isCheck = false;

    protected DistributorBase(Parcel in) {
        DistributorName = in.readString();
        DistributorId = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(DistributorName);
        dest.writeString(DistributorId);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DistributorBase> CREATOR = new Creator<DistributorBase>() {
        @Override
        public DistributorBase createFromParcel(Parcel in) {
            return new DistributorBase(in);
        }

        @Override
        public DistributorBase[] newArray(int size) {
            return new DistributorBase[size];
        }
    };

    public String getDistributorName() {
        return DistributorName;
    }

    public void setDistributorName(String distributorName) {
        DistributorName = distributorName;
    }

    public String getDistributorId() {
        return DistributorId;
    }

    public void setDistributorId(String distributorId) {
        DistributorId = distributorId;
    }

    @SerializedName("DistributorId")
    @Expose
    private String DistributorId;


    public String getIsMyId() {
        return IsMyId;
    }

    public void setIsMyId(String isMyId) {
        IsMyId = isMyId;
    }

    @SerializedName("IsMyId")
    @Expose
    private String IsMyId;

    public DistributorBase() {

    }


}
