package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mchauhan on 1/22/2018.
 */

public class AddressModel implements Parcelable {
    public AddressModel() {

    }

    protected AddressModel(Parcel in) {
        address1 = in.readString();
        address2 = in.readString();
        state = in.readString();
        city = in.readString();
        pincode = in.readString();
        distance = in.readString();
        latitude = in.readString();
        longitude = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(address1);
        dest.writeString(address2);
        dest.writeString(state);
        dest.writeString(city);
        dest.writeString(pincode);
        dest.writeString(distance);
        dest.writeString(latitude);
        dest.writeString(longitude);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AddressModel> CREATOR = new Creator<AddressModel>() {
        @Override
        public AddressModel createFromParcel(Parcel in) {
            return new AddressModel(in);
        }

        @Override
        public AddressModel[] newArray(int size) {
            return new AddressModel[size];
        }
    };

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @SerializedName("address1")
    @Expose

    String address1;

    @SerializedName("address2")
    @Expose

    String address2;

    @SerializedName("state")
    @Expose
    String state;
    @SerializedName("city")
    @Expose
    String city;

    @SerializedName("pincode")
    @Expose
    String pincode;

    @SerializedName("distance")
    @Expose
    protected String distance;

    @SerializedName("latitude")
    @Expose
    String latitude = "0.0";

    @SerializedName("longitude")
    @Expose
    String longitude = "0.0";
}

