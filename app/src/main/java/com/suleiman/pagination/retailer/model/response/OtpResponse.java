package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by shankitk on 2/7/2018.
 */

public class OtpResponse {
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    @SerializedName("ResponseStatus")
    @Expose
    private String ResponseStatus;

    @SerializedName("SuccessMsg")
    @Expose
    private String SuccessMsg;

    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;


    public OtpResponse() {
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        ResponseStatus = responseStatus;
    }

    public String getSuccessMsg() {
        return SuccessMsg;
    }

    public void setSuccessMsg(String successMsg) {
        SuccessMsg = successMsg;
    }

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        ErrorMsg = errorMsg;
    }
}
