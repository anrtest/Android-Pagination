package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attendence {

    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("CheckIn")
    @Expose
    private String checkIn;
    @SerializedName("CheckOut")
    @Expose
    private String checkOut;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("LatIn")
    @Expose
    private String latIn;
    @SerializedName("LongIn")
    @Expose
    private String longIn;
    @SerializedName("LatOut")
    @Expose
    private String latOut;
    @SerializedName("LongOut")
    @Expose
    private String longOut;

    @SerializedName("Remarks")
    @Expose
    private String remarks;


    @SerializedName("ActivityDone")
    @Expose
    String ActivityDone;

    @SerializedName("dayVisitNumber")
    @Expose
    String dayVisitNumber;

    public String getOrdercollected() {
        return ordercollected;
    }

    public void setOrdercollected(String ordercollected) {
        this.ordercollected = ordercollected;
    }

    @SerializedName("ordercollected")
    @Expose
    String ordercollected;


    public String getActivityDone() {
        return ActivityDone;
    }

    public void setActivityDone(String activityDone) {
        ActivityDone = activityDone;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLatIn() {
        return latIn;
    }

    public void setLatIn(String latIn) {
        this.latIn = latIn;
    }

    public String getLongIn() {
        return longIn;
    }

    public void setLongIn(String longIn) {
        this.longIn = longIn;
    }

    public String getLatOut() {
        return latOut;
    }

    public void setLatOut(String latOut) {
        this.latOut = latOut;
    }

    public String getLongOut() {
        return longOut;
    }

    public void setLongOut(String longOut) {
        this.longOut = longOut;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public String getDayVisitNumber() {
        return dayVisitNumber;
    }

    public void setDayVisitNumber(String dayVisitNumber) {
        this.dayVisitNumber = dayVisitNumber;
    }
}