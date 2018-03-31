package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.Authentication;
import com.suleiman.pagination.retailer.model.ProductsDealingIn;
import com.suleiman.pagination.retailer.model.service.base.UserBaseRequest;

import java.util.List;

public class AddDmdRequest extends UserBaseRequest implements Parcelable {

    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;


    @SerializedName("NoOfSalesExecutive")
    @Expose
    private String noOfSalesExecutive;

    @SerializedName("Potential")
    @Expose
    private String dmdCategory;

    @SerializedName("Lat")
    @Expose
    private String lattitude;

    @SerializedName("Long")
    @Expose
    private String longitude;


    @SerializedName("DMD_AddressLine1")
    @Expose
    private String addressline1;

    @SerializedName("DMD_AddressLine2")
    @Expose
    private String addressline2;

    @SerializedName("DMD_City")
    @Expose
    private String city;

    @SerializedName("DMD_State")
    @Expose
    private String state;

    @SerializedName("DMD_Pincode")
    @Expose
    private String pincode;

    @SerializedName("Owner_name")
    @Expose
    private String ownerName;

    @SerializedName("Owner_Number")
    @Expose
    private String ownerMobileNumber;

    @SerializedName("Owner_Email")
    @Expose
    private String ownerEmail;

    @SerializedName("DMD_Landline")
    @Expose
    private String ownerLandline;

    @SerializedName("DMD_Type")
    @Expose
    private String dmdType;


    @SerializedName("ManagerName")
    @Expose
    private String managerName;

    @SerializedName("ManagerNumber")
    @Expose
    private String managerMobile;

    @SerializedName("Manager_Email")
    @Expose
    private String managerEmail;

    @SerializedName("ImageURLShop")
    @Expose
    private String imageOutSideImage;

    @SerializedName("ImageURLCard")
    @Expose
    private String imageInsideImage;


    @SerializedName("Distributor_Link")
    @Expose
    private String distributorLink;

    @SerializedName("BP_Prd_Category")
    @Expose
    private String productCategory;

    @SerializedName("Kent_PrdType")
    @Expose
    private String productType;

    @SerializedName("User_Id")
    @Expose
    private String userID;

    @SerializedName("Area")
    @Expose
    private String area;

    @SerializedName("Remarks")
    @Expose
    private String remarks;




    @SerializedName("IsSameOwner")
    @Expose
    private String isSameOwner;


    @SerializedName(value = "productsDealingIn", alternate = {"ProductsDealingIn", "ProductsDealing"})
    @Expose
    private List<ProductsDealingIn> productsDealingIn = null;



    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerMobile() {
        return managerMobile;
    }

    public void setManagerMobile(String managerMobile) {
        this.managerMobile = managerMobile;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getImageOutSideImage() {
        return imageOutSideImage;
    }

    public void setImageOutSideImage(String imageOutSideImage) {
        this.imageOutSideImage = imageOutSideImage;
    }

    public String getImageInsideImage() {
        return imageInsideImage;
    }

    public void setImageInsideImage(String imageInsideImage) {
        this.imageInsideImage = imageInsideImage;
    }

    public String getDistributorLink() {
        return distributorLink;
    }

    public void setDistributorLink(String distributorLink) {
        this.distributorLink = distributorLink;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

//    public String getDmdCode() {
//        return dmdCode;
//    }
//
//    public void setDmdCode(String dmdCode) {
//        this.dmdCode = dmdCode;
//    }

//    public String getDmdName() {
//        return dmdName;
//    }
//
//    public void setDmdName(String dmdName) {
//        this.dmdName = dmdName;
//    }

    public String getNoOfSalesExecutive() {
        return noOfSalesExecutive;
    }

    public void setNoOfSalesExecutive(String noOfSalesExecutive) {
        this.noOfSalesExecutive = noOfSalesExecutive;
    }

    public String getDmdCategory() {
        return dmdCategory;
    }

    public void setDmdCategory(String dmdCategory) {
        this.dmdCategory = dmdCategory;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerMobileNumber() {
        return ownerMobileNumber;
    }

    public void setOwnerMobileNumber(String ownerMobileNumber) {
        this.ownerMobileNumber = ownerMobileNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerLandline() {
        return ownerLandline;
    }

    public void setOwnerLandline(String ownerLandline) {
        this.ownerLandline = ownerLandline;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }


    public String getDmdType() {
        return dmdType;
    }

    public void setDmdType(String dmdType) {
        this.dmdType = dmdType;
    }

    public AddDmdRequest() {

    }



    public List<ProductsDealingIn> getProductsDealingIn() {
        return productsDealingIn;
    }

    public void setProductsDealingIn(List<ProductsDealingIn> productsDealingIn) {
        this.productsDealingIn = productsDealingIn;
    }




    public String getIsSameOwner() {
        return isSameOwner;
    }

    public void setIsSameOwner(String isSameOwner) {
        this.isSameOwner = isSameOwner;
    }

//    public String getDmdId() {
//        return DMD_Id;
//    }

//    public void setDmdId(String dmdId) {
//        this.DMD_Id = dmdId;
//    }


    protected AddDmdRequest(Parcel in) {

        refId = in.readString();
        retailOutletName = in.readString();
        noOfSalesExecutive = in.readString();
        dmdCategory = in.readString();
        lattitude = in.readString();
        longitude = in.readString();
        addressline1 = in.readString();
        addressline2 = in.readString();
        city = in.readString();
        state = in.readString();
        pincode = in.readString();
        ownerName = in.readString();
        ownerMobileNumber = in.readString();
        ownerEmail = in.readString();
        ownerLandline = in.readString();
        dmdType = in.readString();
        managerName = in.readString();
        managerMobile = in.readString();
        managerEmail = in.readString();
        imageOutSideImage = in.readString();
        imageInsideImage = in.readString();
        distributorLink = in.readString();
        productCategory = in.readString();
        productType = in.readString();
        userID = in.readString();
        area = in.readString();
        CreatedOn = in.readString();
        focusStatus = in.readString();
        remarks = in.readString();
        productsDealingIn = in.createTypedArrayList(ProductsDealingIn.CREATOR);


    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(refId);
        dest.writeString(retailOutletName);
        dest.writeString(noOfSalesExecutive);
        dest.writeString(dmdCategory);
        dest.writeString(lattitude);
        dest.writeString(longitude);
        dest.writeString(addressline1);
        dest.writeString(addressline2);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeString(pincode);
        dest.writeString(ownerName);
        dest.writeString(ownerMobileNumber);
        dest.writeString(ownerEmail);
        dest.writeString(ownerLandline);
        dest.writeString(dmdType);
        dest.writeString(managerName);
        dest.writeString(managerMobile);
        dest.writeString(managerEmail);
        dest.writeString(imageOutSideImage);
        dest.writeString(imageInsideImage);
        dest.writeString(distributorLink);
        dest.writeString(productCategory);
        dest.writeString(productType);
        dest.writeString(userID);
        dest.writeString(area);
        dest.writeString(CreatedOn);
        dest.writeString(focusStatus);
        dest.writeString(remarks);
        dest.writeTypedList(productsDealingIn);

    }

    @Override
    public int describeContents() {
        return 0;
    }


    public static final Creator<AddDmdRequest> CREATOR = new Creator<AddDmdRequest>() {
        @Override
        public AddDmdRequest createFromParcel(Parcel in) {
            return new AddDmdRequest(in);
        }

        @Override
        public AddDmdRequest[] newArray(int size) {
            return new AddDmdRequest[size];
        }
    };

}
