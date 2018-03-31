package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

/**
 * Created by sksharma1 on 18-10-2017.
 */
public class AddDealerResponse extends ResponseBase {

    @SerializedName("DealerList")
    @Expose
    private ViewRetailerResponse.DealerList dealerList;


    public ViewRetailerResponse.DealerList getDealerList() {
        return dealerList;
    }

    public void setDealerList(ViewRetailerResponse.DealerList dealerList) {
        this.dealerList = dealerList;
    }

}
