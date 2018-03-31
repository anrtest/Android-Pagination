package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KnldgSPL {

    @SerializedName("knldgCode")
    @Expose
    private String knldgCode;
    @SerializedName("knldgName")
    @Expose
    private String knldgName;

    public String getKnldgCode() {
        return knldgCode;
    }

    public void setKnldgCode(String knldgCode) {
        this.knldgCode = knldgCode;
    }

    public String getKnldgName() {
        return knldgName;
    }

    public void setKnldgName(String knldgName) {
        this.knldgName = knldgName;
    }

    @Override
    public String toString() {
        return knldgName;
    }
}

