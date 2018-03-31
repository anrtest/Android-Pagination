package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by jalam on 06-02-2018.
 */

public class OutOfRangeRequest extends RequestAuthUserIdBase {

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getUserDistance() {
        return userDistance;
    }

    public void setUserDistance(String userDistance) {
        this.userDistance = userDistance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDealerLat() {
        return dealerLat;
    }

    public void setDealerLat(String dealerLat) {
        this.dealerLat = dealerLat;
    }

    public String getDealerLng() {
        return dealerLng;
    }

    public void setDealerLng(String dealerLng) {
        this.dealerLng = dealerLng;
    }


    public int getLocationMode() {
        return locationMode;
    }

    public void setLocationMode(int locationMode) {
        this.locationMode = locationMode;
    }

    @SerializedName("locationMode")
    @Expose
    private int locationMode;

    @SerializedName("lat")
    @Expose
    private String lat;

    public String getIsFromHyperTrack() {
        return isFromHyperTrack;
    }

    public void setIsFromHyperTrack(String isFromHyperTrack) {
        this.isFromHyperTrack = isFromHyperTrack;
    }

    @SerializedName("isFromHyperTrack")
    @Expose
    private String isFromHyperTrack;


    @SerializedName("lng")
    @Expose
    private String lng;


    @SerializedName("dealerLat")
    @Expose
    private String dealerLat;


    @SerializedName("dealerLng")
    @Expose
    private String dealerLng;



    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("user_distance")
    @Expose
    private String userDistance;


}
