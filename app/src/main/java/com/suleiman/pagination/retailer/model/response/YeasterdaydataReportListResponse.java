package com.suleiman.pagination.retailer.model.response;

import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;


/**
 * Created by mchauhan on 1/9/2018.
 */

public class YeasterdaydataReportListResponse extends ResponseBase {

    public ArrayList<YeasterdaydataReport> getYeasterdaydataReportList() {
        return YeasterdaydataReportList;
    }

    public void setYeasterdaydataReportList(ArrayList<YeasterdaydataReport> yeasterdaydataReportList) {
        YeasterdaydataReportList = yeasterdaydataReportList;
    }

    ArrayList<YeasterdaydataReport> YeasterdaydataReportList = new ArrayList<>();
    String Title = "";
    String Dealer = "";
    String DSD = "";
    String Distributor = "";

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDealer() {
        return Dealer;
    }

    public void setDealer(String dealer) {
        Dealer = dealer;
    }

    public String getDSD() {
        return DSD;
    }

    public void setDSD(String DSD) {
        this.DSD = DSD;
    }

    public String getDistributor() {
        return Distributor;
    }

    public void setDistributor(String distributor) {
        Distributor = distributor;
    }

    public String getSF() {
        return SF;
    }

    public void setSF(String SF) {
        this.SF = SF;
    }

    String SF = "";

}

