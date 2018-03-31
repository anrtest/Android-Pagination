package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jalam on 01-03-2018.
 */

public class VisitDetailParcel implements Parcelable {

    protected VisitDetailParcel(Parcel in) {
        checkInTime = in.readString();
        checkOutTime = in.readString();
        dayVisitNumber = in.readString();
    }

    public VisitDetailParcel(String checkInTime,
                             String checkOutTime,
                             String dayVisitNumber) {
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.dayVisitNumber = dayVisitNumber;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(checkInTime);
        dest.writeString(checkOutTime);
        dest.writeString(dayVisitNumber);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<VisitDetailParcel> CREATOR = new Creator<VisitDetailParcel>() {
        @Override
        public VisitDetailParcel createFromParcel(Parcel in) {
            return new VisitDetailParcel(in);
        }

        @Override
        public VisitDetailParcel[] newArray(int size) {
            return new VisitDetailParcel[size];
        }
    };

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getDayVisitNumber() {
        return dayVisitNumber;
    }

    public void setDayVisitNumber(String dayVisitNumber) {
        this.dayVisitNumber = dayVisitNumber;
    }

    String checkInTime;
    String checkOutTime;
    String dayVisitNumber;
}
