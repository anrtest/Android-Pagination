package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

/**
 * Created by jalam on 27-11-2017.
 */

public class ViewVisitRequest2 {


    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("VisitDate")
    @Expose
    private String visitDate;

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

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}
