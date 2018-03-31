package com.suleiman.pagination.retailer.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

import java.util.ArrayList;

/**
 * Created by mchauhan on 12/22/2017.
 */

public class ProspectCheckOutRequest extends RequestAuthUserIdBase {

    String Dealer_Id = "";
    String CheckIn = "";
    String remarks = "";


    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;


    @SerializedName("productPurchased")
    @Expose
    private String productPurchased;

    @SerializedName("productQty")
    @Expose
    private String productQty;

    @SerializedName("gstin")
    @Expose
    private String gstin;

    @SerializedName("invoiceNo")
    @Expose
    private String invoiceNo;

    @SerializedName("invoiceDate")
    @Expose
    private String invoiceDate;

    public String getProsLostReason() {
        return prosLostReason;
    }

    public void setProsLostReason(String prosLostReason) {
        this.prosLostReason = prosLostReason;
    }

    public String getLeadCRMStatus() {
        return leadCRMStatus;
    }

    public void setLeadCRMStatus(String leadCRMStatus) {
        this.leadCRMStatus = leadCRMStatus;
    }

    @SerializedName("leadCRMStatus")
    @Expose
    String leadCRMStatus;

    @SerializedName("prosLostReason")
    @Expose
    private String prosLostReason;


    public String getProductPurchased() {
        return productPurchased;
    }

    public void setProductPurchased(String productPurchased) {
        this.productPurchased = productPurchased;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @SerializedName("invoiceAmount")
    @Expose
    private String invoiceAmount;

    public String getProspectStatus() {
        return prospectStatus;
    }

    public void setProspectStatus(String prospectStatus) {
        this.prospectStatus = prospectStatus;
    }

    public String getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(String followUpDate) {
        this.followUpDate = followUpDate;
    }


    public String getCloserDate() {
        return closerDate;
    }

    public void setCloserDate(String closerDate) {
        this.closerDate = closerDate;
    }

    @SerializedName("closerDate")
    @Expose
    String closerDate;

    @SerializedName("prospectStatus")
    @Expose
    String prospectStatus;

    @SerializedName("followUpDate")
    @Expose
    String followUpDate;

    @SerializedName("slat")
    @Expose
    private String slat;


    @SerializedName("slong")
    @Expose
    private String slong;

    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }


    public String getSlong() {
        return slong;
    }

    public void setSlong(String slong) {
        this.slong = slong;
    }

    public String getDealer_Id() {
        return Dealer_Id;
    }

    public void setDealer_Id(String dealer_Id) {
        Dealer_Id = dealer_Id;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String checkIn) {
        CheckIn = checkIn;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public ArrayList<InterestedProduct> getInterestedProducts() {
        return interestedProducts;
    }

    public void setInterestedProducts(ArrayList<InterestedProduct> interestedProducts) {
        this.interestedProducts = interestedProducts;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @SerializedName("interestedProducts")
    @Expose
    ArrayList<InterestedProduct> interestedProducts;


    @SerializedName("Productytype")
    @Expose
    private String productType = "";

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
