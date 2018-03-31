package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.response.BPList;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

import java.util.ArrayList;

/**
 * Created by jalam on 01-01-2018.
 */

public class DistributorCheckoutRequest extends RequestAuthUserIdBase {

    public String getGlDetail1() {
        return glDetail1;
    }

    public void setGlDetail1(String glDetail1) {
        this.glDetail1 = glDetail1;
    }

    public String getGlDetail2() {
        return glDetail2;
    }

    public void setGlDetail2(String glDetail2) {
        this.glDetail2 = glDetail2;
    }

    public String getNumberOfExecutives() {
        return numberOfExecutives;
    }

    public void setNumberOfExecutives(String numberOfExecutives) {
        this.numberOfExecutives = numberOfExecutives;
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }

    public String getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(String isPromote) {
        this.isPromote = isPromote;
    }

    public ArrayList<BPList.BpSaleList> getDisplaySales() {
        return displaySales;
    }

    public void setDisplaySales(ArrayList<BPList.BpSaleList> displaySales) {
        this.displaySales = displaySales;
    }

    public ArrayList<BPList.BpSaleList> getSalesMonthPlan() {
        return salesMonthPlan;
    }

    public void setSalesMonthPlan(ArrayList<BPList.BpSaleList> salesMonthPlan) {
        this.salesMonthPlan = salesMonthPlan;
    }

    String glDetail1;
    String glDetail2;

    String numberOfExecutives;
    String isTrained;
    String isPromote;

    ArrayList<BPList.BpSaleList> displaySales;
    ArrayList<BPList.BpSaleList> salesMonthPlan;


    @SerializedName("Dealer_Id")
    @Expose
    private String Dealer_Id;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @SerializedName("Remarks")
    @Expose
    private String remarks;

    @SerializedName("slat")
    @Expose
    private String slat;

    @SerializedName("slong")
    @Expose
    private String slong;

    String CheckIn = "";



    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String checkIn) {
        CheckIn = checkIn;
    }

    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }



    public String getSlong() {
        return slong;
    }

    public void setSlong(String slong) {
        this.slong = slong;
    }

    public String getDealer_Id() {
        return Dealer_Id;
    }

    public void setDealer_Id(String dealer_Id) {
        Dealer_Id = dealer_Id;
    }

}
