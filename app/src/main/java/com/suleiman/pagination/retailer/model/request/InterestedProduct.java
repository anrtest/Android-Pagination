package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.CustomerProduct;
import com.suleiman.pagination.retailer.model.DistributorBase;
import com.suleiman.pagination.retailer.model.ProductsModel;

import java.util.ArrayList;

/**
 * Created by mchauhan on 1/22/2018.
 */

public class InterestedProduct implements Parcelable {

    @SerializedName("ProductCode")
    @Expose
    private String productCode;

    @SerializedName("Itemcode")
    @Expose
    private String itemcode;


    protected InterestedProduct(Parcel in) {
        productCode = in.readString();
        itemcode = in.readString();
        productName = in.readString();
        productQuantity = in.readString();
        totalSale = in.readString();
        distributorsList = in.createTypedArrayList(DistributorBase.CREATOR);
        kentSale = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(productCode);
        dest.writeString(itemcode);
        dest.writeString(productName);
        dest.writeString(productQuantity);
        dest.writeString(totalSale);
        dest.writeTypedList(distributorsList);
        dest.writeString(kentSale);
    }

    public static final Creator<InterestedProduct> CREATOR = new Creator<InterestedProduct>() {
        @Override
        public InterestedProduct createFromParcel(Parcel in) {
            return new InterestedProduct(in);
        }

        @Override
        public InterestedProduct[] newArray(int size) {
            return new InterestedProduct[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    public String getItemCode() {
        return itemcode;
    }

    public void setItemCode(String itemCode) {
        this.itemcode = itemCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @SerializedName("ProductName")
    @Expose
    private String productName;

    @SerializedName("ProductQuantity")
    @Expose
    private String productQuantity;

    @SerializedName("TotalSale")
    @Expose
    private String totalSale;

    @SerializedName("distributorsList")
    @Expose
    ArrayList<DistributorBase> distributorsList = new ArrayList<>();

    public ArrayList<DistributorBase> getDistributorsList() {
        return distributorsList;
    }

    public void setDistributorsList(ArrayList<DistributorBase> distributorsList) {
        this.distributorsList = distributorsList;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    transient
    int position = -1;

    public InterestedProduct(ProductsModel model) {
        productCode = model.getProductId();
        kentSale = model.getQty();
        totalSale = model.getQtyTotal();
        distributorsList = model.getDistributorsList();

    }

    public InterestedProduct(CustomerProduct model) {
        itemcode = model.getProductCode();
        productName = model.getProductName();
        productQuantity = model.getProductQty();

    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(String totalSale) {
        this.totalSale = totalSale;
    }

    public String getKentSale() {
        return kentSale;
    }

    public void setKentSale(String kentSale) {
        this.kentSale = kentSale;
    }

    @SerializedName("KentSale")
    @Expose
    private String kentSale;

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }


}


