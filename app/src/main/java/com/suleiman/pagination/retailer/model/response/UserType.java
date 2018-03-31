package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserType {

    @SerializedName("DSD")
    @Expose
    private Integer dSD;
    @SerializedName("Distributor")
    @Expose
    private Integer distributor;
    @SerializedName("SF")
    @Expose
    private Integer sF;
    @SerializedName("Office")
    @Expose
    private Integer office;
    @SerializedName("Retailer")
    @Expose
    private Integer retailer;
    @SerializedName("Prospect")
    @Expose
    private Integer prospect;

    public Integer getDSD() {
        return dSD;
    }

    public void setDSD(Integer dSD) {
        this.dSD = dSD;
    }

    public Integer getDistributor() {
        return distributor;
    }

    public void setDistributor(Integer distributor) {
        this.distributor = distributor;
    }

    public Integer getSF() {
        return sF;
    }

    public void setSF(Integer sF) {
        this.sF = sF;
    }

    public Integer getOffice() {
        return office;
    }

    public void setOffice(Integer office) {
        this.office = office;
    }

    public Integer getRetailer() {
        return retailer;
    }

    public void setRetailer(Integer retailer) {
        this.retailer = retailer;
    }

    public Integer getProspect() {
        return prospect;
    }

    public void setProspect(Integer prospect) {
        this.prospect = prospect;
    }

}

