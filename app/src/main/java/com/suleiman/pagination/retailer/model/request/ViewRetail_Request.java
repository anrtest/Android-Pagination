package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

public class ViewRetail_Request {

    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;

    @SerializedName("Pincode")
    @Expose
    private String pinCode;

    @SerializedName("UserId")
    @Expose
    private String UserId;

    @SerializedName("slat")
    @Expose
    private String slat;

    @SerializedName("slong")
    @Expose
    private String slong;

    @SerializedName("sortBy")
    @Expose
    private int sortBy;

    @SerializedName("page")
    @Expose
    private int pageIndex;

    @SerializedName("itemsPerPage")
    @Expose
    private int itemsPerPage = 20;

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

//    public String getUserid() {
//        return userid;
//    }
//
//    public void setUserid(String userid) {
//        this.userid = userid;
//    }

    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }

    public String getSlong() {
        return slong;
    }

    public void setSlong(String slong) {
        this.slong = slong;
    }

//    public String getIndex() {
//        return index;
//    }
//
//    public void setIndex(String index) {
//        this.index = index;
//    }

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }
}