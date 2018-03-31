package com.suleiman.pagination.retailer.model.service.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mchauhan on 12/22/2017.
 */

public class RequestAuthUserIdBase extends RequestAuthenticationBase{
    @SerializedName("UserId")
    @Expose
    private String userId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
