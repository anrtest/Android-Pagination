package com.suleiman.pagination.retailer.model.request;


import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

public class UpdateDistributorRequest extends RequestAuthUserIdBase {

    public String getBPCode() {
        return BPCode;
    }

    public void setBPCode(String BPCode) {
        this.BPCode = BPCode;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    String BPCode;
    String Lat;
    String Lng;

}

