package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchDMD extends SearchBaseRequest{

    @SerializedName("DMDName")
    @Expose
    private String dealerName;

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }



}