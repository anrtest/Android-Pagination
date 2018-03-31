package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserListDatum {

    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("Empname")
    @Expose
    private String empname;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("Designation")
    @Expose
    private String designation;


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return empname + ", " + designation;
    }
}