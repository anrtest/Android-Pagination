package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jalam on 07-12-2017.
 */

public class MobileCheckingRetailerRequest extends MobileCheckingBase {


    @SerializedName("DealerId")
    @Expose
    private String dealerId;


    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

}

