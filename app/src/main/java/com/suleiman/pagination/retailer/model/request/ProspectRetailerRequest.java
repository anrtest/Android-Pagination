package com.suleiman.pagination.retailer.model.request;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

import java.util.ArrayList;

/**
 * Created by mchauhan on 1/22/2018.
 */

public class ProspectRetailerRequest extends RequestAuthUserIdBase implements Parcelable {


    private transient int position = -1;
    private transient boolean editMode = false;

    @SerializedName("type")
    @Expose
    private String type;

   /* @SerializedName("IsEnabelGPS")
    @Expose
    boolean IsEnabelGPS;*/

    @SerializedName("IsEnabelGPS")
    @Expose
//    byte IsEnabelGPS;
    String IsEnabelGPS;


    public String isEnabelGPS() {
        return IsEnabelGPS;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @SerializedName("Imageurl")

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

    @SerializedName("invoiceAmount")
    @Expose
    private String invoiceAmount;

    protected ProspectRetailerRequest(Parcel in) {
        type = in.readString();
        productPurchased = in.readString();
        productQty = in.readString();
        gstin = in.readString();
        invoiceNo = in.readString();
        invoiceDate = in.readString();
        invoiceAmount = in.readString();
        prosLostReason = in.readString();
        ProspectsId = in.readString();
        productType = in.readString();
        appointmentDate = in.readString();
        retailersAssociated = in.readString();
        serviceProductName = in.readString();
        serviceProductSerialNumber = in.readString();
        serviceReportedProblem = in.readString();
        fakepartsimage = in.readString();
        fakepartsdis = in.readString();
        prospectRequestBase = in.readParcelable(ProspectCommonFields.class.getClassLoader());
        imageShopOutside = in.readString();
        imageShopInside = in.readString();
        category = in.readString();
        stokingType = in.readString();
        storeType = in.readString();
        ProspectsType = in.readString();
        LeadSource = in.readString();
        leadCRMStatus = in.readString();
        interestedProducts = in.createTypedArrayList(InterestedProduct.CREATOR);
        upfrontInvestment = in.readString();
        gst = in.readString();
        salesPersons = in.readString();
        serviceTechnicians = in.readString();
        officeSize = in.readString();
        leadId = in.readString();
        CRMCallId = in.readString();
        MachinePhoto = in.readString();
        createdon = in.readString();
        FakePartsFound = in.readString();
        brandsDealing = in.readString();
        existingBusiness = in.readString();
        imageUrl = in.readString();
        scallImage = in.readString();
        companyName = in.readString();
        position = in.readInt();
        editMode = in.readByte() != 0;
        hasSeen = in.readByte() != 0;
        //IsEnabelGPS = in.readByte();
        IsEnabelGPS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(type);
        dest.writeString(productPurchased);
        dest.writeString(productQty);
        dest.writeString(gstin);
        dest.writeString(invoiceNo);
        dest.writeString(invoiceDate);
        dest.writeString(invoiceAmount);
        dest.writeString(prosLostReason);
        dest.writeString(ProspectsId);
        dest.writeString(productType);
        dest.writeString(appointmentDate);
        dest.writeString(retailersAssociated);
        dest.writeString(serviceProductName);
        dest.writeString(serviceProductSerialNumber);
        dest.writeString(serviceReportedProblem);
        dest.writeString(fakepartsimage);
        dest.writeString(fakepartsdis);
        dest.writeParcelable(prospectRequestBase, flags);
        dest.writeString(imageShopOutside);
        dest.writeString(imageShopInside);
        dest.writeString(category);
        dest.writeString(stokingType);
        dest.writeString(storeType);
        dest.writeString(ProspectsType);
        dest.writeString(LeadSource);
        dest.writeString(leadCRMStatus);
        dest.writeTypedList(interestedProducts);
        dest.writeString(upfrontInvestment);
        dest.writeString(gst);
        dest.writeString(salesPersons);
        dest.writeString(serviceTechnicians);
        dest.writeString(officeSize);
        dest.writeString(leadId);
        dest.writeString(CRMCallId);
        dest.writeString(MachinePhoto);
        dest.writeString(createdon);
        dest.writeString(FakePartsFound);
        dest.writeString(brandsDealing);
        dest.writeString(existingBusiness);
        dest.writeString(imageUrl);
        dest.writeString(scallImage);
        dest.writeString(companyName);
        dest.writeInt(position);
        dest.writeByte((byte) (editMode ? 1 : 0));
        dest.writeByte((byte) (hasSeen ? 1 : 0));
        //dest.writeByte(IsEnabelGPS);
        dest.writeString(IsEnabelGPS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProspectRetailerRequest> CREATOR = new Creator<ProspectRetailerRequest>() {
        @Override
        public ProspectRetailerRequest createFromParcel(Parcel in) {
            return new ProspectRetailerRequest(in);
        }

        @Override
        public ProspectRetailerRequest[] newArray(int size) {
            return new ProspectRetailerRequest[size];
        }
    };

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

    public String getProsLostReason() {
        return prosLostReason;
    }

    public void setProsLostReason(String prosLostReason) {
        this.prosLostReason = prosLostReason;
    }

    @SerializedName("prosLostReason")
    @Expose
    private String prosLostReason;


    @SerializedName("ProspectsId")
    @Expose
    private String ProspectsId = "";

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @SerializedName("Productytype")
    @Expose
    private String productType = "";

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @SerializedName("AppointmentDate")
    @Expose
    private String appointmentDate;


    @SerializedName("retailersAssociated")
    @Expose
    private String retailersAssociated;


    @SerializedName("ServiceProductName")
    @Expose
    private String serviceProductName;


    @SerializedName("ServiceProductSerialNumber")
    @Expose
    private String serviceProductSerialNumber;


    @SerializedName("ServiceReportedProblem")
    @Expose
    private String serviceReportedProblem;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isEditMode() {
        return editMode;
    }

    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }


    public ProspectRetailerRequest() {

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("fakepartsimage")
    @Expose
    String fakepartsimage;

    public String getScallImage() {
        return scallImage;
    }

    public void setScallImage(String scallImage) {
        this.scallImage = scallImage;
    }

    @SerializedName("scallImage")
    @Expose
    String scallImage;


    @SerializedName("fakepartsdis")
    @Expose
    String fakepartsdis;

    public String getFakepartsdis() {
        return fakepartsdis;
    }

    public void setFakepartsdis(String fakepartsdis) {
        this.fakepartsdis = fakepartsdis;
    }

    public String getFakepartsimage() {
        return fakepartsimage;
    }

    public void setFakepartsimage(String fakepartsimage) {
        this.fakepartsimage = fakepartsimage;
    }

    public ProspectCommonFields getProspectRequestBase() {
        return prospectRequestBase;
    }

    public void setProspectRequestBase(ProspectCommonFields prospectRequestBase) {
        this.prospectRequestBase = prospectRequestBase;
    }

    public String getImageShopOutside() {
        return imageShopOutside;
    }

    public void setImageShopOutside(String imageShopOutside) {
        this.imageShopOutside = imageShopOutside;
    }

    public String getImageShopInside() {
        return imageShopInside;
    }

    public void setImageShopInside(String imageShopInside) {
        this.imageShopInside = imageShopInside;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStokingType() {
        return stokingType;
    }

    public void setStokingType(String stokingType) {
        this.stokingType = stokingType;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public ArrayList<InterestedProduct> getInterestedProducts() {
        return interestedProducts;
    }

    public void setInterestedProducts(ArrayList<InterestedProduct> interestedProducts) {
        this.interestedProducts = interestedProducts;
    }


    public String getUpfrontInvestment() {
        return upfrontInvestment;
    }

    public void setUpfrontInvestment(String upfrontInvestment) {
        this.upfrontInvestment = upfrontInvestment;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getSalesPersons() {
        return salesPersons;
    }

    public void setSalesPersons(String salesPersons) {
        this.salesPersons = salesPersons;
    }

    public String getServiceTechnicians() {
        return serviceTechnicians;
    }

    public void setServiceTechnicians(String serviceTechnicians) {
        this.serviceTechnicians = serviceTechnicians;
    }

    public String getOfficeSize() {
        return officeSize;
    }

    public void setOfficeSize(String officeSize) {
        this.officeSize = officeSize;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getCRMCallId() {
        return CRMCallId;
    }

    public void setCRMCallId(String CRMCallId) {
        this.CRMCallId = CRMCallId;
    }

    public String getMachinePhoto() {
        return MachinePhoto;
    }

    public void setMachinePhoto(String machinePhoto) {
        MachinePhoto = machinePhoto;
    }

    public String getFakePartsFound() {
        return FakePartsFound;
    }

    public void setFakePartsFound(String fakePartsFound) {
        FakePartsFound = fakePartsFound;
    }

    @SerializedName("commonFields")
    @Expose
    ProspectCommonFields prospectRequestBase;


    //for retailer request & response
    @SerializedName("imageShopOutside")
    @Expose
    String imageShopOutside;

    @SerializedName("imageShopInside")
    @Expose
    String imageShopInside;

    @SerializedName("category")
    @Expose
    String category;

    @SerializedName("stokingType")
    @Expose
    String stokingType;

    @SerializedName("storeType")
    @Expose
    String storeType;


    @SerializedName("ProspectsType")
    @Expose
    String ProspectsType;

    public String getLeadSource() {
        return LeadSource;
    }

    public void setLeadSource(String leadSource) {
        LeadSource = leadSource;
    }

    @SerializedName("LeadSource")
    @Expose
    String LeadSource;


    public Boolean getHasSeen() {
        return hasSeen;
    }

    public void setHasSeen(Boolean hasSeen) {
        this.hasSeen = hasSeen;
    }

    @SerializedName("hasSeen")
    @Expose
    Boolean hasSeen;

    @SerializedName("leadCRMStatus")
    @Expose
    String leadCRMStatus;

/*

    public boolean isEnabelGPS() {
        return IsEnabelGPS;
    }

    public void setEnabelGPS(boolean enabelGPS) {
        IsEnabelGPS = enabelGPS;
    }
*/




    @SerializedName("interestedProducts")
    @Expose
    ArrayList<InterestedProduct> interestedProducts;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @SerializedName("companyName")
    @Expose
    String companyName;

    @SerializedName("upfrontInvestment")
    @Expose
    String upfrontInvestment;

    @SerializedName("GST")
    @Expose
    String gst;


    // for DSD
    @SerializedName("salesPersons")
    @Expose
    String salesPersons;

    // for service franchise
    @SerializedName("serviceTechnicians")
    @Expose
    String serviceTechnicians;
    @SerializedName("officeSize")
    @Expose
    String officeSize;

    // for customer
    @SerializedName("leadId")
    @Expose
    String leadId;

    // Service Call
    @SerializedName("CallId")
    @Expose
    String CRMCallId;

    @SerializedName("MachinePhoto")
    @Expose
    String MachinePhoto;


    @SerializedName("createdon")
    @Expose
    String createdon;

    @SerializedName("FakePartsFound")
    @Expose
    String FakePartsFound;


    @SerializedName("brandsDealing")
    @Expose
    String brandsDealing;


    @SerializedName("existingBusiness")
    @Expose
    String existingBusiness;

    public String getBrandsDealing() {
        return brandsDealing;
    }

    public void setBrandsDealing(String brandsDealing) {
        this.brandsDealing = brandsDealing;
    }


    public String getProspectsType() {
        return ProspectsType;
    }

    public void setProspectsType(String prospectsType) {
        ProspectsType = prospectsType;
    }


    public String getProspectsId() {
        return ProspectsId;
    }

    public void setProspectsId(String prospectsId) {
        ProspectsId = prospectsId;
    }

    public String getCreatedon() {
        return createdon;
    }

    public void setCreatedon(String createdon) {
        this.createdon = createdon;
    }

    public String getRetailersAssociated() {
        return retailersAssociated;
    }

    public void setRetailersAssociated(String retailersAssociated) {
        this.retailersAssociated = retailersAssociated;
    }

    public String getExistingBusiness() {
        return existingBusiness;
    }

    public void setExistingBusiness(String existingBusiness) {
        this.existingBusiness = existingBusiness;
    }

    public String getLeadCRMStatus() {
        return leadCRMStatus;
    }

    public void setLeadCRMStatus(String leadCRMStatus) {
        this.leadCRMStatus = leadCRMStatus;
    }

    public String getServiceProductName() {
        return serviceProductName;
    }

    public void setServiceProductName(String serviceProductName) {
        this.serviceProductName = serviceProductName;
    }

    public String getServiceProductSerialNumber() {
        return serviceProductSerialNumber;
    }

    public void setServiceProductSerialNumber(String serviceProductSerialNumber) {
        this.serviceProductSerialNumber = serviceProductSerialNumber;
    }

    public String getServiceReportedProblem() {
        return serviceReportedProblem;
    }

    public void setServiceReportedProblem(String serviceReportedProblem) {
        this.serviceReportedProblem = serviceReportedProblem;
    }

}
