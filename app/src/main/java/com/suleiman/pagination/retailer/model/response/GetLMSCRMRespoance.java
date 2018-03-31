package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sksharma1 on 22-01-2018.
 */
public class GetLMSCRMRespoance {

    @SerializedName("res")
    @Expose
    private Res res;
    @SerializedName("CustomerName")
    @Expose
    private String customerName;
    @SerializedName("MobileNo")
    @Expose
    private String mobileNo;

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    @SerializedName("appointmentdate")
    @Expose
    private String appointmentdate;

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    @SerializedName("LeadStatus")
    @Expose
    private String leadStatus;

    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


}
