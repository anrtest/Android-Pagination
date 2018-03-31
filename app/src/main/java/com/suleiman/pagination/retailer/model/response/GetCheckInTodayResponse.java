package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

/**
 * Created by mchauhan on 2/21/2018.
 */

public class GetCheckInTodayResponse extends ResponseBase {

    public String getIsCheckin() {
        return isCheckin;
    }

    public void setIsCheckin(String isCheckin) {
        this.isCheckin = isCheckin;
    }

    @SerializedName("ISCheckin")
    @Expose
    private String isCheckin;
}
