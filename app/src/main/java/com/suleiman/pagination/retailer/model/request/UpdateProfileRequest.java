package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by shankitk on 2/7/2018.
 */

public class UpdateProfileRequest extends RequestAuthUserIdBase implements Parcelable {
    @SerializedName("userMob")
    @Expose
    private String userMob;

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;

    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("userId")
    @Expose
    private String userId ;

    @SerializedName("slat")
    @Expose
    private double latitude;

    @SerializedName("slong")
    @Expose
    private double longitude ;


    public UpdateProfileRequest() {

    }

    public String getUserMob() {
        return userMob;
    }

    public void setUserMob(String userMob) {
        this.userMob = userMob;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    protected UpdateProfileRequest(Parcel in) {

        userMob = in.readString();
        imageUrl = in.readString();
        address = in.readString();
        userId = in.readString();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }


    public static final Creator<UpdateProfileRequest> CREATOR = new Creator<UpdateProfileRequest>() {
        @Override
        public UpdateProfileRequest createFromParcel(Parcel in) {
            return new UpdateProfileRequest(in);
        }

        @Override
        public UpdateProfileRequest[] newArray(int size) {
            return new UpdateProfileRequest[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userMob);
        dest.writeString(imageUrl);
        dest.writeString(address);
        dest.writeString(userId);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }
}
