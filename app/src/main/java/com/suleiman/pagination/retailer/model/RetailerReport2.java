package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailerReport2 {
    public RetailerReport2(String category, String category_code, String purchase, String sales, String compSales) {
        this.category = category;
        this.purchase = purchase;
        this.sales = sales;
        this.compSales = compSales;
        this.category_code = category_code;

    }

    @SerializedName("Category")
    @Expose
    private String category;

    @SerializedName("Purchase")
    @Expose
    private String purchase;
    @SerializedName("Sales")
    @Expose
    private String sales;
    @SerializedName("CompSales")
    @Expose
    private String compSales;

    @SerializedName("category_code")
    @Expose
    private String category_code;

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }


    public String getCompSales() {
        return compSales;
    }

    public void setCompSales(String compSales) {
        this.compSales = compSales;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return purchase;
    }
}