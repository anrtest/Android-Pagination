package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by mchauhan on 1/3/2018.
 */

public class VisitParcel implements Parcelable {

    private String knowledgeofISP;
    private String year;
    private String remarks;
    private String createdOn;

    private String dayVisitNumber;

    public VisitParcel() {

    }


    protected VisitParcel(Parcel in) {
        knowledgeofISP = in.readString();
        year = in.readString();
        remarks = in.readString();
        createdOn = in.readString();
        productInfo = in.readString();
        screenStatus = in.readString();
        incompletescren_status = in.readString();
        checkInTime = in.readString();
        checkOutTime = in.readString();
        position = in.readInt();
        isCurrentDate = in.readString();
        visitdate = in.readString();
        qualityDisplay = in.readString();
        knowledgeOfSP = in.readString();
        isPop = in.readString();
        popDetail = in.readString();
        activityDone = in.readString();
        enqGenerated = in.readString();
        soldQty = in.readString();
        image = in.readString();
        focusStatus = in.readString();
        visitStatus = in.readString();
        month = in.readString();
        editable = in.readString();
        dayVisitNumber = in.readString();

        visitReports = in.createTypedArrayList(VisitReport.CREATOR);
        reportStockModels = in.createTypedArrayList(ReportStockModel.CREATOR);
        dealer = in.readParcelable(Dealer.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(knowledgeofISP);
        dest.writeString(year);
        dest.writeString(remarks);
        dest.writeString(createdOn);
        dest.writeString(productInfo);
        dest.writeString(screenStatus);
        dest.writeString(incompletescren_status);
        dest.writeString(checkInTime);
        dest.writeString(checkOutTime);
        dest.writeInt(position);
        dest.writeString(isCurrentDate);
        dest.writeString(visitdate);
        dest.writeString(qualityDisplay);
        dest.writeString(knowledgeOfSP);
        dest.writeString(isPop);
        dest.writeString(popDetail);
        dest.writeString(activityDone);
        dest.writeString(enqGenerated);
        dest.writeString(soldQty);
        dest.writeString(image);
        dest.writeString(focusStatus);
        dest.writeString(visitStatus);
        dest.writeString(month);
        dest.writeString(editable);
        dest.writeString(dayVisitNumber);

        dest.writeTypedList(visitReports);
        dest.writeTypedList(reportStockModels);
        dest.writeParcelable(dealer, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<VisitParcel> CREATOR = new Creator<VisitParcel>() {
        @Override
        public VisitParcel createFromParcel(Parcel in) {
            return new VisitParcel(in);
        }

        @Override
        public VisitParcel[] newArray(int size) {
            return new VisitParcel[size];
        }
    };

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getScreenStatus() {
        return screenStatus;
    }

    public void setScreenStatus(String screenStatus) {
        this.screenStatus = screenStatus;
    }

    public String getIncompletescren_status() {
        return incompletescren_status;
    }

    public void setIncompletescren_status(String incompletescren_status) {
        this.incompletescren_status = incompletescren_status;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getIsCurrentDate() {
        return isCurrentDate;
    }

    public void setIsCurrentDate(String isCurrentDate) {
        this.isCurrentDate = isCurrentDate;
    }


    String productInfo;
    String screenStatus;
    String incompletescren_status = "0";
    String checkInTime;
    String checkOutTime;

    int position = 0;
    String isCurrentDate = "0";

    public String getVisitdate() {
        return visitdate;
    }

    public void setVisitdate(String visitdate) {
        this.visitdate = visitdate;
    }

    public List<VisitReport> getVisitReports() {
        return visitReports;
    }

    public void setVisitReports(List<VisitReport> visitReports) {
        this.visitReports = visitReports;
    }

    public List<ReportStockModel> getReportStockModels() {
        return reportStockModels;
    }

    public void setReportStockModels(List<ReportStockModel> reportStockModels) {
        this.reportStockModels = reportStockModels;
    }

    String visitdate;
    private String qualityDisplay;
    private String knowledgeOfSP;
    private String isPop;
    private String popDetail;
    private String activityDone;
    private String enqGenerated;
    private String soldQty;
    private String image;
    private String focusStatus;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    private String visitStatus;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    private String month;

    public String getEditable() {
        return editable;
    }

    public void setEditable(String editable) {
        this.editable = editable;
    }

    private String editable;
    List<VisitReport> visitReports;
    List<ReportStockModel> reportStockModels;

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    Dealer dealer;

    public String getQualityDisplay() {
        return qualityDisplay;
    }

    public void setQualityDisplay(String qualityDisplay) {
        this.qualityDisplay = qualityDisplay;
    }

    public String getKnowledgeOfSP() {
        return knowledgeOfSP;
    }

    public void setKnowledgeOfSP(String knowledgeOfSP) {
        this.knowledgeOfSP = knowledgeOfSP;
    }

    public String getIsPop() {
        return isPop;
    }

    public void setIsPop(String isPop) {
        this.isPop = isPop;
    }

    public String getPopDetail() {
        return popDetail;
    }

    public void setPopDetail(String popDetail) {
        this.popDetail = popDetail;
    }

    public String getActivityDone() {
        return activityDone;
    }

    public void setActivityDone(String activityDone) {
        this.activityDone = activityDone;
    }

    public String getEnqGenerated() {
        return enqGenerated;
    }

    public void setEnqGenerated(String enqGenerated) {
        this.enqGenerated = enqGenerated;
    }


    public String getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(String soldQty) {
        this.soldQty = soldQty;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getFocusStatus() {
        return focusStatus;
    }

    public void setFocusStatus(String focusStatus) {
        this.focusStatus = focusStatus;
    }

    public String getKnowledgeofISP() {
        return knowledgeofISP;
    }

    public void setKnowledgeofISP(String knowledgeofISP) {
        this.knowledgeofISP = knowledgeofISP;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public String getDayVisitNumber() {
        return dayVisitNumber;
    }

    public void setDayVisitNumber(String dayVisitNumber) {
        this.dayVisitNumber = dayVisitNumber;
    }
}
