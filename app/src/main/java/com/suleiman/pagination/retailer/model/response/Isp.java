package com.suleiman.pagination.retailer.model.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Isp implements Parcelable {

    @SerializedName("ISPCode")
    @Expose
    private String iSPCode;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Zone")
    @Expose
    private String zone;
    @SerializedName("DOJ")
    @Expose
    private String dOJ;
    @SerializedName("DOL")
    @Expose
    private String dOL;
    @SerializedName("CreatedOn")
    @Expose
    private String createdOn;
    @SerializedName("Status")
    @Expose
    private String status;


    @SerializedName("SaleHeader")
    @Expose
    private String saleHeader;

    public String getSaleHeader() {
        return saleHeader;
    }

    public void setSaleHeader(String saleHeader) {
        this.saleHeader = saleHeader;
    }

    public String getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(String saleValue) {
        this.saleValue = saleValue;
    }

    @SerializedName("SaleValue")
    @Expose
    private String saleValue;


    public Isp() {
        iSPCode = " ";
        name = " ";
        mobile = " ";
        email = " ";
        city = " ";
        state = " ";
        zone = " ";
        dOJ = " ";
        dOL = " ";
        createdOn = " ";
        status = " ";
        saleHeader = " ";
        saleValue = " ";
    }


    protected Isp(Parcel in) {
        iSPCode = in.readString();
        name = in.readString();
        mobile = in.readString();
        email = in.readString();
        city = in.readString();
        state = in.readString();
        zone = in.readString();
        dOJ = in.readString();
        dOL = in.readString();
        createdOn = in.readString();
        status = in.readString();
        saleHeader = in.readString();
        saleValue = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(iSPCode);
        dest.writeString(name);
        dest.writeString(mobile);
        dest.writeString(email);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeString(zone);
        dest.writeString(dOJ);
        dest.writeString(dOL);
        dest.writeString(createdOn);
        dest.writeString(status);
        dest.writeString(saleHeader);
        dest.writeString(saleValue);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Isp> CREATOR = new Creator<Isp>() {
        @Override
        public Isp createFromParcel(Parcel in) {
            return new Isp(in);
        }

        @Override
        public Isp[] newArray(int size) {
            return new Isp[size];
        }
    };

    public String getISPCode() {
        return iSPCode;
    }

    public void setISPCode(String iSPCode) {
        this.iSPCode = iSPCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDOJ() {
        return dOJ;
    }

    public void setDOJ(String dOJ) {
        this.dOJ = dOJ;
    }

    public String getDOL() {
        return dOL;
    }

    public void setDOL(String dOL) {
        this.dOL = dOL;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

