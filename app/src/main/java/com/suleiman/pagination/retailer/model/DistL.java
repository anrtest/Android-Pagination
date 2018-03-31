package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DistL extends DistributorBase {




//    @SerializedName("Authentication")
//    @Expose
//    private String authentication;
    @SerializedName("Pincode")
    @Expose
    private String pincode;
    @SerializedName("DistributorState")
    @Expose
    private String distributorState;
    @SerializedName("DistributorCity")
    @Expose
    private String distributorCity;
    @SerializedName("DistributorCatg")
    @Expose
    private String distributorCatg;

//        private ArrayList<String> distCategoryList;

//    public String getAuthentication() {
//        return authentication;
//    }
//
//    public void setAuthentication(String authentication) {
//        this.authentication = authentication;
//    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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


}

