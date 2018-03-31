package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

public class ExistringDistributorCheckInResponse extends ResponseBase {

    @SerializedName("Distributordata")
    @Expose
    private BPList distributordata;
    @SerializedName("Gldata")
    @Expose
    private Gldata gldata;
    @SerializedName("displaySales")
    @Expose
    private List<BPList.BpSaleList> displaySales = null;
    @SerializedName("salesMonthPlan")
    @Expose
    private List<BPList.BpSaleList> salesMonthPlan = null;

    @SerializedName("createdOn")
    @Expose
    private String createdOn;

    @SerializedName("isPromote")
    @Expose
    private String isPromote;
    @SerializedName("isTrained")
    @Expose
    private String isTrained;

    @SerializedName("isCheckIn")
    @Expose
    private String isCheckIn;
    @SerializedName("numberOfExecutives")
    @Expose
    private String numberOfExecutives;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @SerializedName("Remarks")
    @Expose
    private String remarks;

    public BPList getDistributordata() {
        return distributordata;
    }

    public void setDistributordata(BPList distributordata) {
        this.distributordata = distributordata;
    }

    public Gldata getGldata() {
        return gldata;
    }

    public void setGldata(Gldata gldata) {
        this.gldata = gldata;
    }

    public List<BPList.BpSaleList> getDisplaySales() {
        return displaySales;
    }

    public void setDisplaySales(List<BPList.BpSaleList> displaySales) {
        this.displaySales = displaySales;
    }

    public List<BPList.BpSaleList> getSalesMonthPlan() {
        return salesMonthPlan;
    }

    public void setSalesMonthPlan(List<BPList.BpSaleList> salesMonthPlan) {
        this.salesMonthPlan = salesMonthPlan;
    }

    public String getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(String isPromote) {
        this.isPromote = isPromote;
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }

    public String getNumberOfExecutives() {
        return numberOfExecutives;
    }

    public void setNumberOfExecutives(String numberOfExecutives) {
        this.numberOfExecutives = numberOfExecutives;
    }

    public String getIsCheckIn() {
        return isCheckIn;
    }

    public void setIsCheckIn(String isCheckIn) {
        this.isCheckIn = isCheckIn;
    }


    public class Gldata {

        @SerializedName("GlName")
        @Expose
        private String glName;
        @SerializedName("GLCode")
        @Expose
        private String gLCode;
        @SerializedName("GLMobileNo")
        @Expose
        private String gLMobileNo;

        public String getGlName() {
            return glName;
        }

        public void setGlName(String glName) {
            this.glName = glName;
        }

        public String getGLCode() {
            return gLCode;
        }

        public void setGLCode(String gLCode) {
            this.gLCode = gLCode;
        }

        public String getGLMobileNo() {
            return gLMobileNo;
        }

        public void setGLMobileNo(String gLMobileNo) {
            this.gLMobileNo = gLMobileNo;
        }

    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

}