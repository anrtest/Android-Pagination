package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by mchauhan on 2/21/2018.
 */

public class GetCheckinRequest extends RequestAuthUserIdBase {

    public String getBpId() {
        return bpId;
    }

    public void setBpId(String bpId) {
        this.bpId = bpId;
    }

    @SerializedName("DealerId")
    @Expose
    private String bpId;

}
