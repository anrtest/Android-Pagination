package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CheckinRequestRespoance {


    @SerializedName("AttnList")
    @Expose
    private List<Res> attnList = null;

    public List<Res> getAttnList() {
        return attnList;
    }

    public void setAttnList(List<Res> attnList) {
        this.attnList = attnList;
    }

}

