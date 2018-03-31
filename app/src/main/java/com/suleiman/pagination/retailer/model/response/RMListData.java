package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sksharma1 on 13-02-2018.
 */

public class RMListData {
    @SerializedName("List")
    @Expose
    private List<RMList> rMList = null;
    @SerializedName("res")
    @Expose
    private Res res;

    public List<RMList> getRMList() {
        return rMList;
    }

    public void setRMList(List<RMList> rMList) {
        this.rMList = rMList;
    }

    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }

}
