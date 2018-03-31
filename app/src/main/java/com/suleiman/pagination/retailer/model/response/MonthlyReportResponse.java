package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;

/**
 * Created by mchauhan on 11/23/2017.
 */

public class MonthlyReportResponse extends ResponseBase {

    public Report getDealerList() {
        return DealerList;
    }

    public void setDealerList(Report dealerList) {
        this.DealerList = dealerList;
    }

    @SerializedName("DealerList")
    @Expose
    public Report DealerList;


    public static class Report {
        public ArrayList<MonthlyReport> getDealersReportBlank() {
            return DealersReportBlank;
        }

        public void setDealersReportBlank(ArrayList<MonthlyReport> dealersReportBlank) {
            this.DealersReportBlank = dealersReportBlank;
        }

        public ArrayList<MonthlyReport> getDealers() {
            return Dealers;
        }

        public void setDealers(ArrayList<MonthlyReport> dealers) {
            Dealers = dealers;
        }

        @SerializedName("Dealers")
        @Expose
        ArrayList<MonthlyReport> Dealers = new ArrayList<>();
        @SerializedName("DealersReportBlank")
        @Expose
        ArrayList<MonthlyReport> DealersReportBlank = new ArrayList<>();
    }


}

