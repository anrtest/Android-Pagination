package com.suleiman.pagination.retailer.model.response;


/**
 * Created by mchauhan on 9/27/2017.
 */

public class LoginResponse extends Result {

    private String employee_id;

    public String getEmployeeId() {
        return this.employee_id;
    }

    public void setEmployeeId(String employee_id) {
        this.employee_id = employee_id;
    }

    private String employee_name;

    public String getEmployeeName() {
        return this.employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    private String mobile;

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String designation;

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private String department;

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String doj;

    public String getDoj() {
        return this.doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    private String location;

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String reporting_emp_id;

    public String getReportingEmpId() {
        return this.reporting_emp_id;
    }

    public void setReportingEmpId(String reporting_emp_id) {
        this.reporting_emp_id = reporting_emp_id;
    }

    private String reporting_name;

    public String getReportingName() {
        return this.reporting_name;
    }

    public void setReportingName(String reporting_name) {
        this.reporting_name = reporting_name;
    }

    private String reporting_mobile_no;

    public String getReportingMobileNo() {
        return this.reporting_mobile_no;
    }

    public void setReportingMobileNo(String reporting_mobile_no) {
        this.reporting_mobile_no = reporting_mobile_no;
    }
}
