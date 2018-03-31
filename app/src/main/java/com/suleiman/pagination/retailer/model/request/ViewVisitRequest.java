package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.ActivityDoneModel;
import com.suleiman.pagination.retailer.model.Authentication;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.ReportStockModel;
import com.suleiman.pagination.retailer.model.RetailerReport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sksharma1 on 23-11-2017.
 */

public class ViewVisitRequest {


    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    transient
    private String base64;


    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }


    public int getRow_id() {
        return row_id;
    }

    public void setRow_id(int row_id) {
        this.row_id = row_id;
    }

    transient
    int row_id = -1;
    transient
    Dealer dealer;


    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;

    public ArrayList<ActivityDoneModel> getActivityProducts() {
        return activityProducts;
    }

    public void setActivityProducts(ArrayList<ActivityDoneModel> activityProducts) {
        this.activityProducts = activityProducts;
    }

    @SerializedName("ActivityProducts")
    @Expose
    private ArrayList<ActivityDoneModel> activityProducts;
    @SerializedName("DealerId")
    @Expose
    private String dealerId;
    @SerializedName("RetailerReport")
    @Expose
    private List<RetailerReport> retailerReport = null;


    @SerializedName("RetailerReportNew")
    @Expose
    private List<ReportStockModel> reportStockModels = null;

    @SerializedName("POP")
    @Expose
    private String isPop;

    @SerializedName("POPDetail")
    @Expose
    private String popDetail;


    @SerializedName("QualityDisplay")
    @Expose
    private String qualityDisplay;
    @SerializedName("KnowledgeOfSP")
    @Expose
    private String knowledgeOfSP;
    @SerializedName("KnowledgeOfISP")
    @Expose
    private String knowledgeOfISP;
    @SerializedName("Remarks")
    @Expose
    private String remarks;
    @SerializedName("ActivityDone")
    @Expose
    private String activityDone;
    @SerializedName("EnqGenerated")
    @Expose
    private String enqGenerated;
    @SerializedName("SoldQty")
    @Expose
    private String soldQty;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Lat")
    @Expose
    private String lat;
    @SerializedName("Long")
    @Expose
    private String _long;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("Month")
    @Expose
    private String month;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Editable")
    @Expose
    private String editable;
    @SerializedName("VisitStatus")
    @Expose
    private String visitstatus;

    @SerializedName("VisitDate")
    @Expose
    private String visitdate;

    public String getVisitstatus() {
        return visitstatus;
    }

    public void setVisitstatus(String visitstatus) {
        this.visitstatus = visitstatus;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public List<RetailerReport> getRetailerReport() {
        return retailerReport;
    }

    public void setRetailerReport(List<RetailerReport> retailerReport) {
        this.retailerReport = retailerReport;
    }

    public String getQualityDisplay() {
        return qualityDisplay;
    }

    public void setQualityDisplay(String qualityDisplay) {
        this.qualityDisplay = qualityDisplay;
    }

    public String getKnowledgeOfSP() {
        return knowledgeOfSP;
    }

    public void setKnowledgeOfSP(String knowledgeOfSP) {
        this.knowledgeOfSP = knowledgeOfSP;
    }

    public String getKnowledgeOfISP() {
        return knowledgeOfISP;
    }

    public void setKnowledgeOfISP(String knowledgeOfISP) {
        this.knowledgeOfISP = knowledgeOfISP;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getActivityDone() {
        return activityDone;
    }

    public void setActivityDone(String activityDone) {
        this.activityDone = activityDone;
    }

    public String getEnqGenerated() {
        return enqGenerated;
    }

    public void setEnqGenerated(String enqGenerated) {
        this.enqGenerated = enqGenerated;
    }

    public String getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(String soldQty) {
        this.soldQty = soldQty;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
    }

    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    }


    public List<ReportStockModel> getReportStockModels() {
        return reportStockModels;
    }

    public void setReportStockModels(List<ReportStockModel> reportStockModels) {
        this.reportStockModels = reportStockModels;
    }


    public String getIsPop() {
        return isPop;
    }

    public void setIsPop(String isPop) {
        this.isPop = isPop;
    }

    public String getPopDetail() {
        return popDetail;
    }

    public void setPopDetail(String popDetail) {
        this.popDetail = popDetail;
    }


}

