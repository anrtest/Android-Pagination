package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
* Created by mchauhan on 1/5/2018.
*/
public class VisitReport implements Parcelable {

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


    protected VisitReport(Parcel in) {
        Category = in.readString();
        Purchase = in.readString();
        Sales = in.readString();
        CompSales = in.readString();
        IsEditable = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Category);
        dest.writeString(Purchase);
        dest.writeString(Sales);
        dest.writeString(CompSales);
        dest.writeInt(IsEditable);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<VisitReport> CREATOR = new Creator<VisitReport>() {
        @Override
        public VisitReport createFromParcel(Parcel in) {
            return new VisitReport(in);
        }

        @Override
        public VisitReport[] newArray(int size) {
            return new VisitReport[size];
        }
    };

    public int getIsEditable() {
        return IsEditable;
    }

    public void setIsEditable(int isEditable) {
        IsEditable = isEditable;
    }

    @SerializedName("IsEditable")
    @Expose
    private int IsEditable;

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
}
