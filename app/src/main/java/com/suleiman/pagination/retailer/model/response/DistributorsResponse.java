package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.DistL;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

public class DistributorsResponse extends ResponseBase {

    @SerializedName("data")
    @Expose
    private Data data;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public class Data {

        @SerializedName("DistL")
        @Expose
        private List<DistL> distL = null;

        public List<DistL> getDistL() {
            return distL;
        }

        public void setDistL(List<DistL> distL) {
            this.distL = distL;
        }

    }


}