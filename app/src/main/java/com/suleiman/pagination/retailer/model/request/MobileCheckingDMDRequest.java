package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jalam on 07-12-2017.
 */

public class MobileCheckingDMDRequest extends MobileCheckingBase {

    @SerializedName("DMDID")
    @Expose
    private String dealerId;


    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }
}

