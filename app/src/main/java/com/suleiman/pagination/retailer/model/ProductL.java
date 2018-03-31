package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductL {

    @SerializedName("ProductType")
    @Expose
    private String productType;

    @SerializedName("ProductName")
    @Expose
    private String productName;
    @SerializedName("ProductDesc")
    @Expose
    private String productDesc;

    @SerializedName("ProductUnit")
    @Expose
    private String productunit;

    @Override
    public String toString() {
//        return super.toString();
        return productName;
    }

    @SerializedName("KentSalesText")
    @Expose
    private String kentSalesText;
    @SerializedName("TotalSalesText")
    @Expose
    private String totalSalesText;

    @SerializedName("BrandList")
    @Expose
    private List<BrandList> brandList = null;


    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }


    public String getKentSalesText() {
        return kentSalesText;
    }

    public void setKentSalesText(String kentSalesText) {
        this.kentSalesText = kentSalesText;
    }

    public String getTotalSalesText() {
        return totalSalesText;
    }

    public void setTotalSalesText(String totalSalesText) {
        this.totalSalesText = totalSalesText;
    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<BrandList> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<BrandList> brandList) {
        this.brandList = brandList;
    }

    public String getProductunit() {
        return productunit;
    }

    public void setProductunit(String productunit) {
        this.productunit = productunit;
    }
}

