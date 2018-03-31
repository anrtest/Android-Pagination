package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jalam on 11-11-2017.
 */

public class LoginRequest {

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;

    @SerializedName("Data")
    @Expose
    private Data data;


    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    @SerializedName("appversion")
    @Expose
    private String appversion;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }




    public static class Data {
        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        @SerializedName("uid")
        @Expose
        private String uid;

        @SerializedName("pass")
        @Expose
        private String pass;

        @SerializedName("deviceId")
        @Expose
        private String deviceId;



    }


}
