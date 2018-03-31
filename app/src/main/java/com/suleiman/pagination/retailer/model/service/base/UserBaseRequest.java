package com.suleiman.pagination.retailer.model.service.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jalam on 21-12-2017.
 */

public class UserBaseRequest {

    @SerializedName("IsISP")
    @Expose
    protected String isISP;

    @SerializedName("distance")
    @Expose
    protected String distance;

    @SerializedName("CreatedOn")
    @Expose
    protected String CreatedOn;


    @SerializedName("Dealer_Id")
    @Expose
    protected String refId;

    @SerializedName("RetailOutletName")
    @Expose
    protected String retailOutletName;

    @SerializedName("FocusStatus")
    @Expose
    protected String focusStatus;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @SerializedName("City")
    @Expose
    protected String city;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFocusStatus() {
        return focusStatus;
    }

    public void setFocusStatus(String focusStatus) {
        this.focusStatus = focusStatus;
    }


    public String getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(String createdOn) {
        this.CreatedOn = createdOn;
    }


    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRetailOutletName() {
        return retailOutletName;
    }

    public void setRetailOutletName(String retailOutletName) {
        this.retailOutletName = retailOutletName;
    }

    public String getIsISP() {
        return isISP;
    }

    public void setIsISP(String isISP) {
        this.isISP = isISP;
    }





}
