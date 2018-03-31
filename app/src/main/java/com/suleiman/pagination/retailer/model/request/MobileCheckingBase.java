package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by jalam on 21-12-2017.
 */

public class MobileCheckingBase extends RequestAuthUserIdBase {


    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("Type")
    @Expose
    private String type;


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
