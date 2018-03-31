package com.suleiman.pagination.retailer.model;

import android.text.TextUtils;

/**
 * Created by mchauhan on 11/8/2017.
 */

public class MonthYearModel {

    public MonthYearModel() {

    }

    public MonthYearModel(String month, String monthTitle, String year) {
        this.monthTitle = monthTitle;
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }


    public String getMonthTitle() {
        return monthTitle;
    }


    public String getYear() {
        return year;
    }


    private String month = "";

    public void setMonthTitle(String monthTitle) {
        this.monthTitle = monthTitle;
    }

    private String monthTitle = "";
    private String year = "";

    @Override
    public String toString() {
        return TextUtils.isEmpty(monthTitle) ? "Please Select Month" : monthTitle + " " + year;
    }
}
