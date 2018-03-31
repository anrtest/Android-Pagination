package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.ActivityDoneModel;
import com.suleiman.pagination.retailer.model.ReportStockModel;

import java.util.ArrayList;
import java.util.List;

public class ValidateCheckInResponse {

    @SerializedName("RetailerReport")
    @Expose
    private List<VisitReport> retailerReport = null;


    @SerializedName("RetailerReportNew")
    @Expose
    private List<ReportStockModel> reportStockModels = null;

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

    public void setActivityProducts(ArrayList<ActivityDoneModel> activityProducts) {
        this.activityProducts = activityProducts;
    }

    @SerializedName("ActivityProducts")
    @Expose
    private ArrayList<ActivityDoneModel> activityProducts;

    public ArrayList<ActivityDoneModel> getActivityProducts() {
        return activityProducts;
    }


    @SerializedName("POP")
    @Expose
    private String isPop;

    @SerializedName("POPDetail")
    @Expose
    private String popDetail;

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
    @SerializedName("VisitStatus")
    @Expose
    private String visitStatus;


    @SerializedName("SyncInsertAttendence")
    @Expose
    private String syncInsertAttendence;

    public List<VisitReport> getRetailerReport() {
        return retailerReport;
    }

    public void setRetailerReport(List<VisitReport> retailerReport) {
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

    public String getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    public String getSyncInsertAttendence() {
        return syncInsertAttendence;
    }

    public void setSyncInsertAttendence(String syncInsertAttendence) {
        this.syncInsertAttendence = syncInsertAttendence;
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


    public class VisitReport {

        @SerializedName("Category")
        @Expose
        private String Category;

        @SerializedName("Purchase")
        @Expose
        private String Purchase;
        @SerializedName("Sales")
        @Expose
        private String Sales;
        @SerializedName("CompSales")
        @Expose
        private String CompSales;


        public int getIsEditable() {
            return IsEditable;
        }

        public void setIsEditable(int isEditable) {
            IsEditable = isEditable;
        }

        @SerializedName("IsEditable")
        @Expose
        private int IsEditable;

        public String getSales() {
            return Sales;
        }

        public void setSales(String sales) {
            this.Sales = sales;
        }


        public String getCompSales() {
            return CompSales;
        }

        public void setCompSales(String compSales) {
            this.CompSales = compSales;
        }


        public String getCategory() {
            return Category;
        }

        public void setCategory(String category) {
            this.Category = category;
        }

        public String getPurchase() {
            return Purchase;
        }

        public void setPurchase(String purchase) {
            this.Purchase = purchase;
        }

        @Override
        public String toString() {
            return Purchase;
        }
    }
}