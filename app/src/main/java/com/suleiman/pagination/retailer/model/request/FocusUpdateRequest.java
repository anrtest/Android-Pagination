package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;

/**
 * Created by mchauhan on 11/26/2017.
 */

public class FocusUpdateRequest {


//    public Authentication getAuthentication() {
//        return Authentication;
//    }
//
//    public String getDealerId() {
//        return DealerId;
//    }
//
//    private Authentication Authentication;
//    private String DealerId;
//    private String Focus;
//
//    public String getUserId() {
//
//        return UserId;
//    }
//
//    public void setUserId(String userId) {
//        UserId = userId;
//    }
//
//    private String UserId;
//
//    public void setAuthentication(Authentication authentication) {
//        this.Authentication = authentication;
//    }
//
//
//    public void setDealerId(String dealerId) {
//        this.DealerId = dealerId;
//    }
//
//    public String getFocus() {
//        return Focus;
//    }
//
//    public void setFocus(String focus) {
//        this.Focus = focus;
//    }

    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;


    @SerializedName("Focus")
    @Expose
    private String focus;


    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    @SerializedName("DealerId")
    @Expose
    private String dealerId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }




    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

}
