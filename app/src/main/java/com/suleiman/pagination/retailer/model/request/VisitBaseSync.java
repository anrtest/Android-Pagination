package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthenticationBase;

/**
 * Created by mchauhan on 1/17/2018.
 */

public class VisitBaseSync extends RequestAuthenticationBase {


    @SerializedName("UserId")
    @Expose
    private String userId;

    private Dealer dealer;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @SerializedName("DealerId")
    @Expose
    private String dealerId;

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @SerializedName("image")
    @Expose
    private String image;


    transient
    private String base64;

    transient
    int row_id = -1;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    transient
    int type = -1;

    public int getRow_id() {
        return row_id;
    }

    public void setRow_id(int row_id) {
        this.row_id = row_id;
    }


    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }


    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return dealer;
    }
}

