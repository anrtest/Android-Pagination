package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

public class CheckinStatusRequest2
{
    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("UserId")
    @Expose
    private String userId;


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @SerializedName("Month")
    @Expose
    private String month;

    @SerializedName("Year")
    @Expose
    private String year;

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate;
    }

    @SerializedName("ReportDate")
    @Expose
    private String reportdate;

    @SerializedName("dayVisitNumber")
    @Expose
    private String dayVisitNumber;

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDayVisitNumber() {
        return dayVisitNumber;
    }

    public void setDayVisitNumber(String dayVisitNumber) {
        this.dayVisitNumber = dayVisitNumber;
    }

}

