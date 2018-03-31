package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.request.ProspectRetailerRequest;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

/**
 * Created by mchauhan on 2/21/2018.
 */

public class AddProspectResponse extends ResponseBase {


    public ProspectRetailerRequest getData() {
        return data;
    }

    public void setData(ProspectRetailerRequest data) {
        this.data = data;
    }

    @SerializedName("Prospectsdata")
    @Expose
    private ProspectRetailerRequest data;
}
