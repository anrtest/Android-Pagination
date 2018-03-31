package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
* Created by sksharma1 on 29-11-2017.
*/

public class DiscardCheckinRequest extends RequestAuthUserIdBase
{
    @SerializedName("DealerId")
    @Expose
    private String dealerId;
//    @SerializedName("UserId")
//    @Expose
//    private String userId;

//    public Authentication getAuthentication() {
//        return authentication;
//    }
//
//    public void setAuthentication(Authentication authentication) {
//        this.authentication = authentication;
//    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }

}

