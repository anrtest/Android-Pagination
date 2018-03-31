package com.suleiman.pagination.retailer.model.request;


import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by mchauhan on 1/8/2018.
 */

public class SelfReportRequest extends RequestAuthUserIdBase {
    String slat = "";
    String Search = "";
    String slong = "";
    String date = "";

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

    public String getSearch() {
        return Search;
    }

    public void setSearch(String search) {
        Search = search;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}

