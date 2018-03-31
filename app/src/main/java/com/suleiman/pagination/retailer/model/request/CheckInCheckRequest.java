package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

public class CheckInCheckRequest {

    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("UserId")
    @Expose
    private String userId;

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

    @SerializedName("slat")
    @Expose
    private String slat;

    @SerializedName("slong")
    @Expose
    private String slong;

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}