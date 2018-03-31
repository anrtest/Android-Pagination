package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sksharma1 on 23-01-2018.
 */
public class ProductLNew {

    @SerializedName("ProductCode")
    @Expose
    private String productCode;

    @SerializedName("ProductName")
    @Expose
    private String productName;

    @SerializedName("price")
    @Expose
    private String price;


    @SerializedName("BasePrice")
    @Expose
    private String basePrice;

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }


    @SerializedName("Seri")
    @Expose
    private String seri;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }


    public ProductLNew(final String productName, final String productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }

}
