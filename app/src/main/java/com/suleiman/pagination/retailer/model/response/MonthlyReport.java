package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class MonthlyReport {
    public MonthlyReport(String dealer, String purchase, String sales, String compSales) {
        this.dealer = dealer;
        this.purchase = purchase;
        this.sales = sales;
        this.compSales = compSales;

    }

    @SerializedName("Dealer_Id")
    @Expose
    private String dealer;

    @SerializedName("Purchase")
    @Expose
    private String purchase;
    @SerializedName("Sales")
    @Expose
    private String sales;
    @SerializedName("CompSales")
    @Expose
    private String compSales;

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


    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
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