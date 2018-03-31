package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

public class DistributorRequest extends RequestAuthUserIdBase {

    //    @SerializedName("Authentication")
//    @Expose
//    private Authentication authentication;
    @SerializedName("Pincode")
    @Expose
    private String pincode = "";
    @SerializedName("DistributorName")
    @Expose
    private String distributorName = "";
    @SerializedName("DistributorId")
    @Expose
    private String distributorId = "";
    @SerializedName("DistributorState")
    @Expose
    private String distributorState = "";
    @SerializedName("DistributorCity")
    @Expose
    private String distributorCity = "";
    @SerializedName("DistributorCatg")
    @Expose
    private String distributorCatg = "";

    @SerializedName("Search")
    @Expose
    private String search = "";


    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public String getDistributorState() {
        return distributorState;
    }

    public void setDistributorState(String distributorState) {
        this.distributorState = distributorState;
    }

    public String getDistributorCity() {
        return distributorCity;
    }

    public void setDistributorCity(String distributorCity) {
        this.distributorCity = distributorCity;
    }

    public String getDistributorCatg() {
        return distributorCatg;
    }

    public void setDistributorCatg(String distributorCatg) {
        this.distributorCatg = distributorCatg;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}

