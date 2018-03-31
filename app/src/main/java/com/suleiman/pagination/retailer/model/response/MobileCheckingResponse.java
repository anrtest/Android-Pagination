package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;

/**
 * Created by jalam on 09-01-2018.
 */

public class MobileCheckingResponse extends ResponseBase {

    @SerializedName("DealerList")
    @Expose
    private ArrayList<Dealer> dealerList;

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return dealer;
    }

    @SerializedName("Dealer")
    @Expose
    private Dealer dealer;


    public ArrayList<Dealer> getDealerList() {
        return dealerList;
    }

    public void setDealerList(ArrayList<Dealer> dealerList) {
        this.dealerList = dealerList;
    }


}


