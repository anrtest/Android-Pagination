package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.response.UserType;

/**
 * Created by sksharma1 on 17-10-2017.
 */

public class Data
{
    private Employeedata Employeedata;

    public void setEmployeedata(Employeedata Employeedata){
        this.Employeedata = Employeedata;
    }
    public Employeedata getEmployeedata(){
        return this.Employeedata;
    }


    @SerializedName("UserType")
    @Expose
    private UserType userType;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}
