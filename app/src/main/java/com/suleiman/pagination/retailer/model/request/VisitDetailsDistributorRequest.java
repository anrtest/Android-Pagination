package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jalam on 02-01-2018.
 */

public class VisitDetailsDistributorRequest extends ExistingCheckInDistributorRequest {


    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    @SerializedName("Date")
    @Expose
    private String dateString;

    public String getDayVisitNumber() {
        return dayVisitNumber;
    }

    public void setDayVisitNumber(String dayVisitNumber) {
        this.dayVisitNumber = dayVisitNumber;
    }

    @SerializedName("dayVisitNumber")
    @Expose
    private String dayVisitNumber;



}
