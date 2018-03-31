package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompetitorDealingIn implements Parcelable {

    @SerializedName("Competitor")
    @Expose
    private String competitor;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    transient
    boolean isSelected;


    public String getCompetitor() {
        return competitor;
    }

    public void setCompetitor(String competitor) {
        this.competitor = competitor;
    }


    public CompetitorDealingIn() {

    }

    protected CompetitorDealingIn(Parcel in) {
        competitor = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(competitor);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CompetitorDealingIn> CREATOR = new Creator<CompetitorDealingIn>() {
        @Override
        public CompetitorDealingIn createFromParcel(Parcel in) {
            return new CompetitorDealingIn(in);
        }

        @Override
        public CompetitorDealingIn[] newArray(int size) {
            return new CompetitorDealingIn[size];
        }
    };


}