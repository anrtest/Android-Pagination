package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

/**
 * Created by jalam on 28-11-2017.
 */

public class VisitDetailResponseNew extends ResponseBase {




    @SerializedName("Dealer")
    @Expose
    private List<Dealer> dealer = null;
    @SerializedName("ValidateCheckInResponse")
    @Expose
    private ValidateCheckInResponse validateCheckInResponse;
    @SerializedName("isCheckIn")
    @Expose
    private String isCheckIn;

    public List<Dealer> getDealer() {
        return dealer;
    }

    public void setDealer(List<Dealer> dealer) {
        this.dealer = dealer;
    }

    public ValidateCheckInResponse getValidateCheckInResponse() {
        return validateCheckInResponse;
    }

    public void setValidateCheckInResponse(ValidateCheckInResponse validateCheckInResponse) {
        this.validateCheckInResponse = validateCheckInResponse;
    }

    public String getIsCheckIn() {
        return isCheckIn;
    }

    public void setIsCheckIn(String isCheckIn) {
        this.isCheckIn = isCheckIn;
    }

}
