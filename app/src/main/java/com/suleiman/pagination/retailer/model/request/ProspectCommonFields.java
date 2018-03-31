package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mchauhan on 1/22/2018.
 */

public class ProspectCommonFields implements Parcelable {

    public ProspectCommonFields(){

    }

    protected ProspectCommonFields(Parcel in) {
        address = in.readParcelable(AddressModel.class.getClassLoader());
        imageVisiting = in.readString();
        remarks = in.readString();
        contactName = in.readString();
        contactMobile = in.readString();
        prospectStatus = in.readString();
        followUpDate = in.readString();
        closerDate = in.readString();
        appointmentdate = in.readString();
        businessName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(address, flags);
        dest.writeString(imageVisiting);
        dest.writeString(remarks);
        dest.writeString(contactName);
        dest.writeString(contactMobile);
        dest.writeString(prospectStatus);
        dest.writeString(followUpDate);
        dest.writeString(closerDate);
        dest.writeString(appointmentdate);
        dest.writeString(businessName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProspectCommonFields> CREATOR = new Creator<ProspectCommonFields>() {
        @Override
        public ProspectCommonFields createFromParcel(Parcel in) {
            return new ProspectCommonFields(in);
        }

        @Override
        public ProspectCommonFields[] newArray(int size) {
            return new ProspectCommonFields[size];
        }
    };

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    @SerializedName("address")
    @Expose
    AddressModel address;


    @SerializedName("imageVisiting")
    @Expose
    String imageVisiting;

    @SerializedName("remarks")
    @Expose
    String remarks;


    @SerializedName("contactName")
    @Expose
    String contactName;

    @SerializedName("contactMobile")
    @Expose
    String contactMobile;

    @SerializedName("prospectStatus")
    @Expose
    String prospectStatus;

    @SerializedName("followUpDate")
    @Expose
    String followUpDate;

    @SerializedName("closerDate")
    @Expose
    String closerDate;


    @SerializedName("appointmentdate")
    @Expose
    private String appointmentdate;


    @SerializedName("businessName")
    @Expose
    String businessName;


    public String getAppointmentDate() {
        return appointmentdate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentdate = appointmentDate;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }


    public String getImageVisiting() {
        return imageVisiting;
    }

    public void setImageVisiting(String imageVisiting) {
        this.imageVisiting = imageVisiting;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

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


}

