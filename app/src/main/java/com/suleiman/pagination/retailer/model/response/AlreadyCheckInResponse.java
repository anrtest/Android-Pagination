package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.request.ProspectRetailerRequest;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

/**
 * Created by jalam on 22-12-2017.
 */

public class AlreadyCheckInResponse extends ResponseBase {

//    @SerializedName("res")
//    @Expose
//    private Res res;

    public ProspectRetailerRequest getProspectData() {
        return prospectData;
    }

    public void setProspectData(ProspectRetailerRequest prospectData) {
        this.prospectData = prospectData;
    }

    @SerializedName("Prospects")
    @Expose
    private ProspectRetailerRequest prospectData;

    @SerializedName("ExistingDealer")
    @Expose
    private Dealer existingDealer;
    @SerializedName("isCheckIn")
    @Expose
    private String isCheckIn;
    @SerializedName("isCheckInWhere")
    @Expose
    private String isOfficeVisit;

//    public Res getRes() {
//        return res;
//    }
//
//    public void setRes(Res res) {
//        this.res = res;
//    }


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

    public String getCheckInWher() {
        return isOfficeVisit;
    }

    public void setIsOfficeVisit(String isOfficeVisit) {
        this.isOfficeVisit = isOfficeVisit;
    }



}
