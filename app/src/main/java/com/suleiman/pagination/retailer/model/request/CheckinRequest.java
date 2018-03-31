package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

import java.util.List;

public class CheckinRequest extends RequestAuthUserIdBase {

    @SerializedName("AddAttendence")
    @Expose
    private List<AddAttendence> addAttendence = null;


    public List<AddAttendence> getAddAttendence() {
        return addAttendence;
    }

    public void setAddAttendence(List<AddAttendence> addAttendence) {
        this.addAttendence = addAttendence;
    }

    public static class AddAttendence
    {
        @SerializedName("DealerId")
        @Expose
        private String dealerId;
        @SerializedName("UserId")
        @Expose
        private String userId;
        @SerializedName("Status")
        @Expose
        private String status;
        @SerializedName("CheckIn")
        @Expose
        private String checkIn;
        @SerializedName("CheckOut")
        @Expose
        private String checkOut;
        @SerializedName("LatIn")
        @Expose
        private Double latIn;
        @SerializedName("LongIn")
        @Expose
        private Double longIn;
        @SerializedName("LatOut")
        @Expose
        private Double latOut;

        public String getBpType() {
            return bpType;
        }

        public void setBpType(String bpType) {
            this.bpType = bpType;
        }

        @SerializedName("bpType")
        @Expose
        private String bpType;

        @SerializedName("LongOut")
        @Expose
        private Double longOut;

        public String getDealerId() {
            return dealerId;
        }

        public void setDealerId(String dealerId) {
            this.dealerId = dealerId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCheckIn() {
            return checkIn;
        }

        public void setCheckIn(String checkIn) {
            this.checkIn = checkIn;
        }

        public String getCheckOut() {
            return checkOut;
        }

        public void setCheckOut(String checkOut) {
            this.checkOut = checkOut;
        }

        public Double getLatIn() {
            return latIn;
        }

        public void setLatIn(Double latIn) {
            this.latIn = latIn;
        }

        public Double getLongIn() {
            return longIn;
        }

        public void setLongIn(Double longIn) {
            this.longIn = longIn;
        }

        public Double getLatOut() {
            return latOut;
        }

        public void setLatOut(Double latOut) {
            this.latOut = latOut;
        }

        public Double getLongOut() {
            return longOut;
        }

        public void setLongOut(Double longOut) {
            this.longOut = longOut;
        }

    }

}

