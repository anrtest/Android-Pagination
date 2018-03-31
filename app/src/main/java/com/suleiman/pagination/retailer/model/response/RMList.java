package com.suleiman.pagination.retailer.model.response;

/**
 * Created by sksharma1 on 13-02-2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RMList {

    @SerializedName("EmployeeCode")
    @Expose
    private String employeeCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("Location")
    @Expose
    private String location;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @SerializedName("Department")
    @Expose
    private String Department;

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getName() + ", " + getLocation();
    }
}