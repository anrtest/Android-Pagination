package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by jalam on 02-01-2018.
 */

public class ExistingCheckInDistributorRequest extends RequestAuthUserIdBase {


    public String getBpCode() {
        return bpCode;
    }

    public void setBpCode(String bpCode) {
        this.bpCode = bpCode;
    }

    @SerializedName("BpCode")
    @Expose
    private String bpCode;


    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;


    @SerializedName("bpType")
    @Expose
    private String bpType;


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


    public String getBpType() {
        return bpType;
    }

    public void setBpType(String bpType) {
        this.bpType = bpType;
    }

}
