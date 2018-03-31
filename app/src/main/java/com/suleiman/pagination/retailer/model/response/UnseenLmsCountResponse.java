package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sagrawal on 1/31/2018.
 */

public class UnseenLmsCountResponse {
    @SerializedName("Recordcount")
    @Expose

    private String recordcount;

    @SerializedName("IsTeamviewer")
    @Expose
    private String isTeamviewer;


    @SerializedName("currentDate")
    @Expose
    private String currentDate;


    public String getRecordcount() {
        return recordcount;
    }

    public void setRecordcount(String recordcount) {
        this.recordcount = recordcount;
    }

    public String getIsTeamviewer() {
        return isTeamviewer;
    }

    public void setIsTeamviewer(String isTeamviewer) {
        this.isTeamviewer = isTeamviewer;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
}
