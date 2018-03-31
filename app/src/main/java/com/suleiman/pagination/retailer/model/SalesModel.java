package com.suleiman.pagination.retailer.model;

/**
 * Created by jalam on 08-01-2018.
 */

public class SalesModel {

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(String monthSales) {
        this.monthSales = monthSales;
    }

    public String getAsOnDateSales() {
        return asOnDateSales;
    }

    public void setAsOnDateSales(String asOnDateSales) {
        this.asOnDateSales = asOnDateSales;
    }

    String category;
    String monthSales;
    String asOnDateSales;

}
