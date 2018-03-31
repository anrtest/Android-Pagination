package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailerReport {

    public RetailerReport(){

    }

    public RetailerReport(String categoryName, String category, String purchase, String sales, String compSales) {
        this.CategoryName = categoryName;
        this.Category = category;
        this.Purchase = purchase;
        this.Sales = sales;
        this.CompSales = compSales;

    }

    transient
    private String CategoryName;

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

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}

