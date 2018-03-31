package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.RetailerReport;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

public class CheckinStatusRespoance extends ResponseBase
{

    @SerializedName("RetailerReport")
    @Expose
    private List<RetailerReport> retailerReport = null;
    @SerializedName("DealerId")
    @Expose
    private String dealerId;
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
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("Editable")
    @Expose
    private String editable;
    @SerializedName("Month")
    @Expose
    private String month;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("SyncInsertAttendence")
    @Expose
    private SyncInsertAttendence syncInsertAttendence;


    public List<RetailerReport> getRetailerReport() {
        return retailerReport;
    }

    public void setRetailerReport(List<RetailerReport> retailerReport) {
        this.retailerReport = retailerReport;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
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

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SyncInsertAttendence getSyncInsertAttendence() {
        return syncInsertAttendence;
    }

    public void setSyncInsertAttendence(SyncInsertAttendence syncInsertAttendence) {
        this.syncInsertAttendence = syncInsertAttendence;
    }

}

