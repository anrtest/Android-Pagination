package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.ActivityDoneModel;
import com.suleiman.pagination.retailer.model.response.ExistringDist_DSD_CheckInResponse;

import java.util.ArrayList;

/**
 * Created by jalam on 01-01-2018.
 */

public class DSD_DistributorCheckoutRequest extends VisitBaseSync {

    String glDetail1;
    String glDetail2;

    String numberOfExecutives;
    String isTrained;
    String isPromote;

    @SerializedName("ActivityProducts")
    @Expose
    private ArrayList<ActivityDoneModel> activityProducts;

    public ArrayList<ActivityDoneModel> getActivityProducts() {
        return activityProducts;
    }

    public void setActivityProducts(ArrayList<ActivityDoneModel> activityProducts) {
        this.activityProducts = activityProducts;
    }


    @SerializedName("executiveTrained")
    @Expose
    private String numberOfExecutiveTrained;

    @SerializedName("topics")
    @Expose
    private String topicsCovered;

    @SerializedName("currentMonthSaleArrayList")
    @Expose
    private ArrayList<ExistringDist_DSD_CheckInResponse.CurrentMonthSale> currentMonthSaleArrayList;

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

    @SerializedName("Dealer_Id")
    @Expose
    private String Dealer_Id;


    public String getNumberOfExecutiveTrained() {
        return numberOfExecutiveTrained;
    }

    public void setNumberOfExecutiveTrained(String numberOfExecutiveTrained) {
        this.numberOfExecutiveTrained = numberOfExecutiveTrained;
    }

    public String getTopicsCovered() {
        return topicsCovered;
    }

    public void setTopicsCovered(String topicsCovered) {
        this.topicsCovered = topicsCovered;
    }

    public String getEnqGenerated() {
        return enqGenerated;
    }

    public void setEnqGenerated(String enqGenerated) {
        this.enqGenerated = enqGenerated;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    @SerializedName("enqGenerated")
    @Expose
    private String enqGenerated;
    @SerializedName("sales")
    @Expose
    private String sales;


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

    public ArrayList<ExistringDist_DSD_CheckInResponse.CurrentMonthSale> getCurrentMonthSaleArrayList() {
        return currentMonthSaleArrayList;
    }

    public void setCurrentMonthSaleArrayList(ArrayList<ExistringDist_DSD_CheckInResponse.CurrentMonthSale> currentMonthSaleArrayList) {
        this.currentMonthSaleArrayList = currentMonthSaleArrayList;
    }


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


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
