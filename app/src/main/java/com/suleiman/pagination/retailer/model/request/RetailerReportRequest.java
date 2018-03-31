package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

/**
 * Created by mchauhan on 11/23/2017.
 */

public class RetailerReportRequest {


    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("Month")
    @Expose
    String Month = "";
    @SerializedName("Year")
    @Expose
    String Year = "";

    @SerializedName("Dealer")
    @Expose
    String Dealer = "";

    @SerializedName("User_Id")
    @Expose
    String userId = "";

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        this.Month = month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getDealer() {
        return Dealer;
    }

    public void setDealer(String dealer) {
        this.Dealer = dealer;
    }

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
