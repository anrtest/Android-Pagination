package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.response.CategorySales;
import com.suleiman.pagination.retailer.model.response.Isp;
import com.suleiman.pagination.retailer.model.service.base.UserBaseRequest;

import java.util.List;

public class Dealer extends UserBaseRequest implements Parcelable {


    public CategorySales getProductSales() {
        return ProductSales;
    }

    public void setProductSales(CategorySales productSales) {
        this.ProductSales = productSales;
    }

    @SerializedName("res")
    @Expose
    private String res;

    public String getISPCode() {
        return ISPCode;
    }

    public void setISPCode(String ISPCode) {
        this.ISPCode = ISPCode;
    }

    @SerializedName("ISPCode")
    @Expose
    private String ISPCode;// INFO


    @SerializedName("Authentication")
    @Expose
    private Authentication authentication;


    @JsonAdapter(ISPAdapterFactory.class)
    @SerializedName("isp")
    @Expose
    protected Isp isp;

    @SerializedName("ProductSales")
    @Expose
    private CategorySales ProductSales;

    @SerializedName("IsNew")
    @Expose
    private String isNew;


    @SerializedName("Dealer_State")
    @Expose
    private String dealerState;


    //    @SerializedName("RetailOutletName")
//    @Expose
//    private String retailOutletName;
    @SerializedName("Dealer_Type")
    @Expose
    private String dealerType;
    @SerializedName("Market_Id")
    @Expose
    private String marketId;
    @SerializedName("Owner_name")
    @Expose
    private String ownerName;
    @SerializedName("Owner_Number")
    @Expose
    private String ownerNumber;
    @SerializedName("Owner_Email")
    @Expose
    private String ownerEmail;
    @SerializedName("ManagerName")
    @Expose
    private String managerName;
    @SerializedName("ManagerNumber")
    @Expose
    private String managerNumber;
    @SerializedName("Manager_Email")
    @Expose
    private String managerEmail;


    @SerializedName("manager_email")
    @Expose
    private String managerEmail_New;

    @SerializedName("Dealer_AddressLine1")
    @Expose
    private String dealerAddressLine1;
    @SerializedName("Dealer_AddressLine2")
    @Expose
    private String dealerAddressLine2;
    @SerializedName("Dealer_Landline")
    @Expose
    private String dealerLandline;
    @SerializedName("Dealer_Pincode")
    @Expose
    private String dealerPincode;
    @SerializedName("RetailOutletType")
    @Expose
    private String retailOutletType;
    @SerializedName("Potential")
    @Expose
    private String potential;
    @SerializedName("BrandName")
    @Expose
    private String brandName;
    @SerializedName("Kent_RoSaleMonth")
    @Expose
    private Integer kentRoSaleMonth;
    @SerializedName("Total_RoSaleMonth")
    @Expose
    private Integer totalRoSaleMonth;
    @SerializedName("BP_Prd_Category")
    @Expose
    private String bPPrdCategory;
    @SerializedName("Kent_PrdType")
    @Expose
    private String kentPrdType;
    @SerializedName("Distributor_Link")
    @Expose
    private String distributorLink;
    @SerializedName("Dealer_Name")
    @Expose
    private String dealerName;
    @SerializedName("Dealer_Category")
    @Expose
    private String dealerCategory;
    @SerializedName("Dealer_Email")
    @Expose
    private String dealerEmail;
    @SerializedName("User_Id")
    @Expose
    private String userId;
    @SerializedName("Lat")
    @Expose
    private String lat;
    @SerializedName("Long")
    @Expose
    private String _long;

    @SerializedName("Area")
    @Expose
    private String area;
    @SerializedName("ImageURLShop")
    @Expose
    private String imageURLShop;
    @SerializedName("ImageURLInvoice")
    @Expose
    private String imageURLInvoice;
    @SerializedName("ImageURLCard")
    @Expose
    private String imageURLCard;
    @SerializedName("AlcStatus")
    @Expose
    private String alcStatus;
    @SerializedName("AlcCounter")
    @Expose
    private String alcCounter;

    @SerializedName("DealerLink")
    @Expose
    private String dealerLink;

    @SerializedName("Remarks")
    @Expose
    private String remarks;


    @SerializedName("IsSameOwner")
    @Expose
    private String isSameOwner;

    @SerializedName("VerifyStatus")
    @Expose
    private String verifyStatus;

    @SerializedName("isCheckInWhere")
    @Expose
    private String isCheckInWhere;


    @SerializedName("ProductsDealingIn")
    @Expose
    private List<ProductsDealingIn> productsDealingIn = null;

   /* @SerializedName("IsEnabelGPS")
    @Expose
    boolean IsEnabelGPS;*/

    @SerializedName("IsEnabelGPS")
    @Expose
    String IsEnabelGPS = "";


    public String isEnabelGPS() {
        return IsEnabelGPS;
    }



    transient boolean check;

    public Dealer() {

    }

    protected Dealer(Parcel in) {
        res = in.readString();
        ISPCode = in.readString();
        isp = in.readParcelable(Isp.class.getClassLoader());
        ProductSales = in.readParcelable(CategorySales.class.getClassLoader());
        refId = in.readString();
        dealerState = in.readString();
        city = in.readString();
        retailOutletName = in.readString();
        dealerType = in.readString();
        marketId = in.readString();
        ownerName = in.readString();
        ownerNumber = in.readString();
        ownerEmail = in.readString();
        managerName = in.readString();
        managerNumber = in.readString();
        managerEmail = in.readString();
        dealerAddressLine1 = in.readString();
        dealerAddressLine2 = in.readString();
        dealerLandline = in.readString();
        dealerPincode = in.readString();
        retailOutletType = in.readString();
        potential = in.readString();
        brandName = in.readString();
        bPPrdCategory = in.readString();
        kentPrdType = in.readString();
        distributorLink = in.readString();
        dealerName = in.readString();
        dealerCategory = in.readString();
        dealerEmail = in.readString();
        userId = in.readString();
        lat = in.readString();
        _long = in.readString();
        distance = in.readString();
        area = in.readString();
        imageURLShop = in.readString();
        imageURLInvoice = in.readString();
        imageURLCard = in.readString();
        alcStatus = in.readString();
        alcCounter = in.readString();
        focusStatus = in.readString();
        dealerLink = in.readString();
        remarks = in.readString();
        isISP = in.readString();
        CreatedOn = in.readString();
        verifyStatus = in.readString();
        productsDealingIn = in.createTypedArrayList(ProductsDealingIn.CREATOR);
        IsEnabelGPS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(res);
        dest.writeString(ISPCode);
        dest.writeParcelable(isp, flags);
        dest.writeParcelable(ProductSales, flags);
        dest.writeString(refId);
        dest.writeString(dealerState);
        dest.writeString(city);
        dest.writeString(retailOutletName);
        dest.writeString(dealerType);
        dest.writeString(marketId);
        dest.writeString(ownerName);
        dest.writeString(ownerNumber);
        dest.writeString(ownerEmail);
        dest.writeString(managerName);
        dest.writeString(managerNumber);
        dest.writeString(managerEmail);
        dest.writeString(dealerAddressLine1);
        dest.writeString(dealerAddressLine2);
        dest.writeString(dealerLandline);
        dest.writeString(dealerPincode);
        dest.writeString(retailOutletType);
        dest.writeString(potential);
        dest.writeString(brandName);
        dest.writeString(bPPrdCategory);
        dest.writeString(kentPrdType);
        dest.writeString(distributorLink);
        dest.writeString(dealerName);
        dest.writeString(dealerCategory);
        dest.writeString(dealerEmail);
        dest.writeString(userId);
        dest.writeString(lat);
        dest.writeString(_long);
        dest.writeString(distance);
        dest.writeString(area);
        dest.writeString(imageURLShop);
        dest.writeString(imageURLInvoice);
        dest.writeString(imageURLCard);
        dest.writeString(alcStatus);
        dest.writeString(alcCounter);
        dest.writeString(focusStatus);
        dest.writeString(dealerLink);
        dest.writeString(remarks);
        dest.writeString(isISP);
        dest.writeString(CreatedOn);
        dest.writeString(verifyStatus);
        dest.writeTypedList(productsDealingIn);
       // dest.writeByte((byte) (IsEnabelGPS ? 1 : 0));
        //dest.writeByte(IsEnabelGPS);
        dest.writeString(IsEnabelGPS);
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Dealer> CREATOR = new Creator<Dealer>() {
        @Override
        public Dealer createFromParcel(Parcel in) {
            return new Dealer(in);
        }

        @Override
        public Dealer[] newArray(int size) {
            return new Dealer[size];
        }
    };

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }


    public String getDealerState() {
        return dealerState;
    }

    public void setDealerState(String dealerState) {
        this.dealerState = dealerState;
    }


    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerNumber() {
        return managerNumber;
    }

    public void setManagerNumber(String managerNumber) {
        this.managerNumber = managerNumber;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getDealerAddressLine1() {
        return dealerAddressLine1;
    }

    public void setDealerAddressLine1(String dealerAddressLine1) {
        this.dealerAddressLine1 = dealerAddressLine1;
    }

    public String getDealerAddressLine2() {
        return dealerAddressLine2;
    }

    public void setDealerAddressLine2(String dealerAddressLine2) {
        this.dealerAddressLine2 = dealerAddressLine2;
    }

    public String getDealerLandline() {
        return dealerLandline;
    }

    public void setDealerLandline(String dealerLandline) {
        this.dealerLandline = dealerLandline;
    }

    public String getDealerPincode() {
        return dealerPincode;
    }

    public void setDealerPincode(String dealerPincode) {
        this.dealerPincode = dealerPincode;
    }

    public String getRetailOutletType() {
        return retailOutletType;
    }

    public void setRetailOutletType(String retailOutletType) {
        this.retailOutletType = retailOutletType;
    }

    public String getPotential() {
        return potential;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getKentRoSaleMonth() {
        return kentRoSaleMonth;
    }

    public void setKentRoSaleMonth(Integer kentRoSaleMonth) {
        this.kentRoSaleMonth = kentRoSaleMonth;
    }

    public Integer getTotalRoSaleMonth() {
        return totalRoSaleMonth;
    }

    public void setTotalRoSaleMonth(Integer totalRoSaleMonth) {
        this.totalRoSaleMonth = totalRoSaleMonth;
    }

    public String getBPPrdCategory() {
        return bPPrdCategory;
    }

    public void setBPPrdCategory(String bPPrdCategory) {
        this.bPPrdCategory = bPPrdCategory;
    }

    public String getKentPrdType() {
        return kentPrdType;
    }

    public void setKentPrdType(String kentPrdType) {
        this.kentPrdType = kentPrdType;
    }

    public String getDistributorLink() {
        return distributorLink;
    }

    public void setDistributorLink(String distributorLink) {
        this.distributorLink = distributorLink;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerCategory() {
        return dealerCategory;
    }

    public void setDealerCategory(String dealerCategory) {
        this.dealerCategory = dealerCategory;
    }

    public String getDealerEmail() {
        return dealerEmail;
    }

    public void setDealerEmail(String dealerEmail) {
        this.dealerEmail = dealerEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getImageURLShop() {
        return imageURLShop;
    }

    public void setImageURLShop(String imageURLShop) {
        this.imageURLShop = imageURLShop;
    }

    public String getImageURLInvoice() {
        return imageURLInvoice;
    }

    public void setImageURLInvoice(String imageURLInvoice) {
        this.imageURLInvoice = imageURLInvoice;
    }

    public String getImageURLCard() {
        return imageURLCard;
    }

    public void setImageURLCard(String imageURLCard) {
        this.imageURLCard = imageURLCard;
    }

    public String getAlcStatus() {
        return alcStatus;
    }

    public void setAlcStatus(String alcStatus) {
        this.alcStatus = alcStatus;
    }

    public String getAlcCounter() {
        return alcCounter;
    }

    public void setAlcCounter(String alcCounter) {
        this.alcCounter = alcCounter;
    }


    public String getDealerLink() {
        return dealerLink;
    }

    public void setDealerLink(String dealerLink) {
        this.dealerLink = dealerLink;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    public List<ProductsDealingIn> getProductsDealingIn() {
        return productsDealingIn;
    }

    public void setProductsDealingIn(List<ProductsDealingIn> productsDealingIn) {
        this.productsDealingIn = productsDealingIn;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }


    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getManagerEmail_New() {
        return managerEmail_New;
    }

    public void setManagerEmail_New(String managerEmail_New) {
        this.managerEmail_New = managerEmail_New;
    }


    public String getIsSameOwner() {
        return isSameOwner;
    }

    public void setIsSameOwner(String isSameOwner) {
        this.isSameOwner = isSameOwner;
    }


    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }


    public Isp getIsp() {
        return isp;
    }

    public void setIsp(Isp isp) {
        this.isp = isp;
    }


    public String getIsCheckInWhere() {
        return isCheckInWhere;
    }

    public void setIsCheckInWhere(String isCheckInWhere) {
        this.isCheckInWhere = isCheckInWhere;
    }

   /* public boolean isEnabelGPS() {
        return IsEnabelGPS;
    }

    public void setEnabelGPS(boolean enabelGPS) {
        IsEnabelGPS = enabelGPS;
    }
*/
}

