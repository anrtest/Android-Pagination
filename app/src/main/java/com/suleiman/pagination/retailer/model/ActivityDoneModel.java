package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mchauhan on 2/12/2018.
 */

public class ActivityDoneModel implements Parcelable{

    public ActivityDoneModel() {

    }

    protected ActivityDoneModel(Parcel in) {
        category = in.readString();
        enquiry = in.readString();
        qty = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(category);
        dest.writeString(enquiry);
        dest.writeString(qty);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ActivityDoneModel> CREATOR = new Creator<ActivityDoneModel>() {
        @Override
        public ActivityDoneModel createFromParcel(Parcel in) {
            return new ActivityDoneModel(in);
        }

        @Override
        public ActivityDoneModel[] newArray(int size) {
            return new ActivityDoneModel[size];
        }
    };

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getLabelQty() {
        return labelQty;
    }

    public void setLabelQty(String labelQty) {
        this.labelQty = labelQty;
    }

    public String getLabelEnquiry() {
        return labelEnquiry;
    }

    public void setLabelEnquiry(String labelEnquiry) {
        this.labelEnquiry = labelEnquiry;
    }

    @SerializedName("Category")
    @Expose
    String category;

    @SerializedName("enquiry")
    @Expose
    String enquiry;

    @SerializedName("qty")
    @Expose
    String qty;

    transient
    String labelQty = "Sales";
    transient
    String labelEnquiry = "No. Of Enquiries Generated";

    public String getLabelCategory() {
        return labelCategory;
    }

    public void setLabelCategory(String labelCategory) {
        this.labelCategory = labelCategory;
    }

    transient
    String labelCategory;

    public boolean isSetErrorQty() {
        return setErrorQty;
    }

    public void setSetErrorQty(boolean setErrorQty) {
        this.setErrorQty = setErrorQty;
    }

    public boolean isSetErrorEnquiry() {
        return setErrorEnquiry;
    }

    public void setSetErrorEnquiry(boolean setErrorEnquiry) {
        this.setErrorEnquiry = setErrorEnquiry;
    }

    transient
    boolean setErrorQty = false;
    transient
    boolean setErrorEnquiry = false;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ActivityDoneModel) {
            return !TextUtils.isEmpty(((ActivityDoneModel) obj).getCategory()) && !TextUtils.isEmpty(category) && category.equalsIgnoreCase(((ActivityDoneModel) obj).getCategory());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return category.hashCode();
    }

}
