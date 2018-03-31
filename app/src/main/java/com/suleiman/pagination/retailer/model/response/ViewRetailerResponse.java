package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;
import java.util.List;

public class ViewRetailerResponse extends ResponseBase {

    @SerializedName("DealerList")
    @Expose
    private DealerList dealerList;
    @SerializedName("ExistingDealer")
    @Expose
    private Dealer existingDealer;
    @SerializedName("isCheckIn")
    @Expose
    private String isCheckIn;

    public DealerList getDealerList() {
        return dealerList;
    }

    public void setDealerList(DealerList dealerList) {
        this.dealerList = dealerList;
    }

    public Dealer getExistingDealer() {
        return existingDealer;
    }

    public void setExistingDealer(Dealer existingDealer) {
        this.existingDealer = existingDealer;
    }

    public String getIsCheckIn() {
        return isCheckIn;
    }

    public void setIsCheckIn(String isCheckIn) {
        this.isCheckIn = isCheckIn;
    }


    public class DealerList {

        @SerializedName("Dealers")
        @Expose
        private List<Dealer> dealers = new ArrayList<>();

        public List<Dealer> getDealers() {
            return dealers;
        }

        public void setDealers(List<Dealer> dealers) {
            this.dealers = dealers;//.addAll(dealers);
        }

    }


}