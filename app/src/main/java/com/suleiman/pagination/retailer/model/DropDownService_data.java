package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sksharma1 on 18-10-2017.
 */
public class DropDownService_data {


    @SerializedName("Distance")
    @Expose
    private String distance;

    @SerializedName("PotiantialL")
    @Expose
    private List<PotiantialL> potiantialL = null;
    @SerializedName("ProductL")
    @Expose
    private List<ProductL> productL = null;
    @SerializedName("OutletL")
    @Expose
    private List<OutletL> outletL = null;
    @SerializedName("QualityL")
    @Expose
    private List<QualityL> qualityL = null;
    @SerializedName("knldgISPL")
    @Expose
    private List<KnldgISPL> knldgISPL = null;
    @SerializedName("knldgSPL")
    @Expose
    private List<KnldgSPL> knldgSPL = null;
    @SerializedName("RetailTypeL")
    @Expose
    private List<RetailTypeL> retailTypeL = null;

    @SerializedName("ProductLNew")
    @Expose
    private List<ProductLNew> productLNew = null;

    public List<ProductLNew> getProductLNew() {
        return productLNew;
    }

    public void setProductLNew(List<ProductLNew> productLNew) {
        this.productLNew = productLNew;
    }

    public List<PotiantialL> getPotiantialL() {
        return potiantialL;
    }

    public void setPotiantialL(List<PotiantialL> potiantialL) {
        this.potiantialL = potiantialL;
    }

    public List<ProductL> getProductL() {
        return productL;
    }

    public void setProductL(List<ProductL> productL) {
        this.productL = productL;
    }

    public List<OutletL> getOutletL() {
        return outletL;
    }

    public void setOutletL(List<OutletL> outletL) {
        this.outletL = outletL;
    }

    public List<QualityL> getQualityL() {
        return qualityL;
    }

    public void setQualityL(List<QualityL> qualityL) {
        this.qualityL = qualityL;
    }

    public List<KnldgISPL> getKnldgISPL() {
        return knldgISPL;
    }

    public void setKnldgISPL(List<KnldgISPL> knldgISPL) {
        this.knldgISPL = knldgISPL;
    }

    public List<KnldgSPL> getKnldgSPL() {
        return knldgSPL;
    }

    public void setKnldgSPL(List<KnldgSPL> knldgSPL) {
        this.knldgSPL = knldgSPL;
    }

    public List<RetailTypeL> getRetailTypeL() {
        return retailTypeL;
    }

    public void setRetailTypeL(List<RetailTypeL> retailTypeL) {
        this.retailTypeL = retailTypeL;
    }


    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

}

