package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by mchauhan on 12/28/2017.
 */

public class ViewDistributorListRequest extends RequestAuthUserIdBase {

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    String Type = "";

    public String getFilter() {
        return Filter;
    }

    public void setFilter(String filter) {
        Filter = filter;
    }

    String Filter = "";


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

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }

    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;

    @SerializedName("sortBy")
    @Expose
    private int sortBy;
}
