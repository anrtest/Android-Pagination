package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.request.ProspectRetailerRequest;

public class ViewVisitDealerList {

    @SerializedName("Dealer")
    @Expose
    private Dealer dealer;

    public ProspectRetailerRequest getProspectRetailerRequest() {
        return prospectRetailerRequest;
    }

    public void setProspectRetailerRequest(ProspectRetailerRequest prospectRetailerRequest) {
        this.prospectRetailerRequest = prospectRetailerRequest;
    }

    @SerializedName("Prospects")
    @Expose
    private ProspectRetailerRequest prospectRetailerRequest;

    @SerializedName("Attendence")
    @Expose
    private Attendence attendence;



    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Attendence getAttendence() {
        return attendence;
    }

    public void setAttendence(Attendence attendence) {
        this.attendence = attendence;
    }

}