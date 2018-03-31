package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

/**
 * Created by mchauhan on 11/23/2017.
 */

public class MonthlyReportRequest {

    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;
    @SerializedName("Month")
    @Expose
    String Month = "";
    @SerializedName("Year")
    @Expose
    String Year = "";
    @SerializedName("Category")
    @Expose
    String Category = "";

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    @SerializedName("UserId")
    @Expose
    String UserId = "";

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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }


}
