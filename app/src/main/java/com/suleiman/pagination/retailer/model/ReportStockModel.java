package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReportStockModel implements Parcelable{

    public ReportStockModel(String stocks, String orderCollection, String tertiaryDate, String secondaryDate, String category) {
        // this.CategoryName=categoryName;
        this.stocks = stocks;
        this.orderCollection = orderCollection;
        this.secondaryDate = secondaryDate;
        this.tertiaryDate = tertiaryDate;
        this.category = category;

    }

    @SerializedName("Stocks")
    @Expose
    private String stocks;

    @SerializedName("OrderCollection")
    @Expose
    private String orderCollection;

    @SerializedName("TertiaryDate")
    @Expose
    private String tertiaryDate;

    @SerializedName("SecondaryDate")
    @Expose
    private String secondaryDate;

    @SerializedName("Category")
    @Expose
    private String category;


    String Status;
    protected ReportStockModel(Parcel in) {
        stocks = in.readString();
        orderCollection = in.readString();
        tertiaryDate = in.readString();
        secondaryDate = in.readString();
        category = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(stocks);
        dest.writeString(orderCollection);
        dest.writeString(tertiaryDate);
        dest.writeString(secondaryDate);
        dest.writeString(category);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ReportStockModel> CREATOR = new Creator<ReportStockModel>() {
        @Override
        public ReportStockModel createFromParcel(Parcel in) {
            return new ReportStockModel(in);
        }

        @Override
        public ReportStockModel[] newArray(int size) {
            return new ReportStockModel[size];
        }
    };

    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getOrderCollection() {
        return orderCollection;
    }

    public void setOrderCollection(String orderCollection) {
        this.orderCollection = orderCollection;
    }

    public String getTertiaryDate() {
        return tertiaryDate;
    }

    public void setTertiaryDate(String tertiaryDate) {
        this.tertiaryDate = tertiaryDate;
    }

    public String getSecondaryDate() {
        return secondaryDate;
    }

    public void setSecondaryDate(String secondaryDate) {
        this.secondaryDate = secondaryDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

