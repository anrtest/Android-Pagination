package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by mchauhan on 12/22/2017.
 */

public class OfficeListRequest extends RequestAuthUserIdBase {

    public String getSearch() {
        return Search;
    }

    public void setSearch(String search) {
        Search = search;
    }

    String Search = "";




    @SerializedName("slat")
    @Expose
    private String slat;


    @SerializedName("slong")
    @Expose
    private String slong;


    @SerializedName("sortBy")
    @Expose
    private int sortBy;



    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }



    public String getSlong() {
        return slong;
    }

    public void setSlong(String slong) {
        this.slong = slong;
    }

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    }
}
