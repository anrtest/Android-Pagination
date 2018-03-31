package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HyperTrackLocation {

    @SerializedName("responseObject")
    @Expose
    private ResponseObject responseObject;

    public ResponseObject getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }


    public class ResponseObject {

        @SerializedName("mResults")
        @Expose
        private List<Double> mResults = null;
        @SerializedName("mDistance")
        @Expose
        private Double mDistance;
        @SerializedName("mElapsedRealtimeNanos")
        @Expose
        private Integer mElapsedRealtimeNanos;
        @SerializedName("mTime")
        @Expose
        private Integer mTime;
        @SerializedName("mAltitude")
        @Expose
        private Double mAltitude;
        @SerializedName("mLongitude")
        @Expose
        private Double mLongitude;
        @SerializedName("mLon2")
        @Expose
        private Double mLon2;
        @SerializedName("mLon1")
        @Expose
        private Double mLon1;
        @SerializedName("mLatitude")
        @Expose
        private Double mLatitude;
        @SerializedName("mLat2")
        @Expose
        private Double mLat2;
        @SerializedName("mLat1")
        @Expose
        private Double mLat1;
        @SerializedName("mIsFromMockProvider")
        @Expose
        private Boolean mIsFromMockProvider;
        @SerializedName("mInitialBearing")
        @Expose
        private Double mInitialBearing;
        @SerializedName("mHasSpeed")
        @Expose
        private Boolean mHasSpeed;
        @SerializedName("mHasBearing")
        @Expose
        private Boolean mHasBearing;
        @SerializedName("mHasAltitude")
        @Expose
        private Boolean mHasAltitude;
        @SerializedName("mHasAccuracy")
        @Expose
        private Boolean mHasAccuracy;
        @SerializedName("mAccuracy")
        @Expose
        private Double mAccuracy;
        @SerializedName("mSpeed")
        @Expose
        private Double mSpeed;
        @SerializedName("mBearing")
        @Expose
        private Double mBearing;

        public List<Double> getMResults() {
            return mResults;
        }

        public void setMResults(List<Double> mResults) {
            this.mResults = mResults;
        }

        public Double getMDistance() {
            return mDistance;
        }

        public void setMDistance(Double mDistance) {
            this.mDistance = mDistance;
        }

        public Integer getMElapsedRealtimeNanos() {
            return mElapsedRealtimeNanos;
        }

        public void setMElapsedRealtimeNanos(Integer mElapsedRealtimeNanos) {
            this.mElapsedRealtimeNanos = mElapsedRealtimeNanos;
        }

        public Integer getMTime() {
            return mTime;
        }

        public void setMTime(Integer mTime) {
            this.mTime = mTime;
        }

        public Double getMAltitude() {
            return mAltitude;
        }

        public void setMAltitude(Double mAltitude) {
            this.mAltitude = mAltitude;
        }

        public Double getMLongitude() {
            return mLongitude;
        }

        public void setMLongitude(Double mLongitude) {
            this.mLongitude = mLongitude;
        }

        public Double getMLon2() {
            return mLon2;
        }

        public void setMLon2(Double mLon2) {
            this.mLon2 = mLon2;
        }

        public Double getMLon1() {
            return mLon1;
        }

        public void setMLon1(Double mLon1) {
            this.mLon1 = mLon1;
        }

        public Double getMLatitude() {
            return mLatitude;
        }

        public void setMLatitude(Double mLatitude) {
            this.mLatitude = mLatitude;
        }

        public Double getMLat2() {
            return mLat2;
        }

        public void setMLat2(Double mLat2) {
            this.mLat2 = mLat2;
        }

        public Double getMLat1() {
            return mLat1;
        }

        public void setMLat1(Double mLat1) {
            this.mLat1 = mLat1;
        }

        public Boolean getMIsFromMockProvider() {
            return mIsFromMockProvider;
        }

        public void setMIsFromMockProvider(Boolean mIsFromMockProvider) {
            this.mIsFromMockProvider = mIsFromMockProvider;
        }

        public Double getMInitialBearing() {
            return mInitialBearing;
        }

        public void setMInitialBearing(Double mInitialBearing) {
            this.mInitialBearing = mInitialBearing;
        }

        public Boolean getMHasSpeed() {
            return mHasSpeed;
        }

        public void setMHasSpeed(Boolean mHasSpeed) {
            this.mHasSpeed = mHasSpeed;
        }

        public Boolean getMHasBearing() {
            return mHasBearing;
        }

        public void setMHasBearing(Boolean mHasBearing) {
            this.mHasBearing = mHasBearing;
        }

        public Boolean getMHasAltitude() {
            return mHasAltitude;
        }

        public void setMHasAltitude(Boolean mHasAltitude) {
            this.mHasAltitude = mHasAltitude;
        }

        public Boolean getMHasAccuracy() {
            return mHasAccuracy;
        }

        public void setMHasAccuracy(Boolean mHasAccuracy) {
            this.mHasAccuracy = mHasAccuracy;
        }

        public Double getMAccuracy() {
            return mAccuracy;
        }

        public void setMAccuracy(Double mAccuracy) {
            this.mAccuracy = mAccuracy;
        }

        public Double getMSpeed() {
            return mSpeed;
        }

        public void setMSpeed(Double mSpeed) {
            this.mSpeed = mSpeed;
        }

        public Double getMBearing() {
            return mBearing;
        }

        public void setMBearing(Double mBearing) {
            this.mBearing = mBearing;
        }

    }

}