package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.request.ProspectRetailerRequest;

import java.util.List;

/**
 * Created by jalam on 24-01-2018.
 */

public class ProspectListResponse {

    @SerializedName("ProspectsList")
    @Expose
    private List<ProspectRetailerRequest> prospectsList = null;
    @SerializedName("res")
    @Expose
    private Res res;

    public List<ProspectRetailerRequest> getProspectsList() {
        return prospectsList;
    }

    public void setProspectsList(List<ProspectRetailerRequest> prospectsList) {
        this.prospectsList = prospectsList;
    }

    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }

}
