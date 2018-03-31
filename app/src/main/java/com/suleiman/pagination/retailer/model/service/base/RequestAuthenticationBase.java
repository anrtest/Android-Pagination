package com.suleiman.pagination.retailer.model.service.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

/**
 * Created by jalam on 29-12-2017.
 */

public class RequestAuthenticationBase {
    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;


    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }
}
