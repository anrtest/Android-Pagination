package com.suleiman.pagination.retailer.model.service.base;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.response.Res;

/**
 * Created by mchauhan on 12/22/2017.
 */

public class ResponseBase {

    @SerializedName("res")
    @Expose
    private Res res;

    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }




}
