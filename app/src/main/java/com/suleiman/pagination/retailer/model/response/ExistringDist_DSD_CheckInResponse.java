package com.suleiman.pagination.retailer.model.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.ActivityDoneModel;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;
import java.util.List;

public class ExistringDist_DSD_CheckInResponse extends ResponseBase {


    public ArrayList<ActivityDoneModel> getActivityProducts() {
        return activityProducts;
    }

    public void setActivityProducts(ArrayList<ActivityDoneModel> activityProducts) {
        this.activityProducts = activityProducts;
    }
    @SerializedName("ActivityProducts")
    @Expose
    private ArrayList<ActivityDoneModel> activityProducts;

    @SerializedName("Distributordata")
    @Expose
    private BPList distributordata;
    @SerializedName("Gldata")
    @Expose
    private Gldata gldata;

    @SerializedName("displaySales")
    @Expose
    private List<CurrentMonthSale> displaySales = null;

    @SerializedName("salesMonthPlan")
    @Expose
    private List<PreviousMonthSale> salesMonthPlan = null;

    @SerializedName("createdOn")
    @Expose
    private String createdOn;

    @SerializedName("isPromote")
    @Expose
    private String isPromote;
    @SerializedName("isTrained")
    @Expose
    private String isTrained;

    @SerializedName("executiveTrained")
    @Expose
    private String executiveTrained;

    @SerializedName("isCheckIn")
    @Expose
    private String isCheckIn;
    @SerializedName("numberOfExecutives")
    @Expose
    private String numberOfExecutives;
    @SerializedName("enqGenerated")
    @Expose
    private String enqGenerated;
    @SerializedName("sales")
    @Expose
    private String sales;

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getExecutiveTrained() {
        return executiveTrained;
    }

    public void setExecutiveTrained(String executiveTrained) {
        this.executiveTrained = executiveTrained;
    }

    @SerializedName("topics")
    @Expose
    private String topics;

    public String getEnqGenerated() {
        return enqGenerated;
    }

    public void setEnqGenerated(String enqGenerated) {
        this.enqGenerated = enqGenerated;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @SerializedName("image")
    @Expose
    private String image;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @SerializedName("Remarks")
    @Expose
    private String remarks;

    public BPList getDistributordata() {
        return distributordata;
    }

    public void setDistributordata(BPList distributordata) {
        this.distributordata = distributordata;
    }

    public Gldata getGldata() {
        return gldata;
    }

    public void setGldata(Gldata gldata) {
        this.gldata = gldata;
    }

    public List<CurrentMonthSale> getDisplaySales() {
        return displaySales;
    }

    public void setDisplaySales(List<CurrentMonthSale> displaySales) {
        this.displaySales = displaySales;
    }

    public List<PreviousMonthSale> getSalesMonthPlan() {
        return salesMonthPlan;
    }

    public void setSalesMonthPlan(List<PreviousMonthSale> salesMonthPlan) {
        this.salesMonthPlan = salesMonthPlan;
    }

    public String getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(String isPromote) {
        this.isPromote = isPromote;
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }

    public String getNumberOfExecutives() {
        return numberOfExecutives;
    }

    public void setNumberOfExecutives(String numberOfExecutives) {
        this.numberOfExecutives = numberOfExecutives;
    }

    public String getIsCheckIn() {
        return isCheckIn;
    }

    public void setIsCheckIn(String isCheckIn) {
        this.isCheckIn = isCheckIn;
    }


    public static class BPReport implements Parcelable {
        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getMtdPrimary() {
            return mtdPrimary;
        }

        public void setMtdPrimary(String mtdPrimary) {
            this.mtdPrimary = mtdPrimary;
        }

        public String getOrderCreated() {
            return orderCreated;
        }

        public void setOrderCreated(String orderCreated) {
            this.orderCreated = orderCreated;
        }

        String category = "";
        String target = "";
        String mtdPrimary = "";
        String orderCreated = "";

        protected BPReport(Parcel in) {
            category = in.readString();
            target = in.readString();
            mtdPrimary = in.readString();
            orderCreated = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(category);
            dest.writeString(target);
            dest.writeString(mtdPrimary);
            dest.writeString(orderCreated);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<BPReport> CREATOR = new Creator<BPReport>() {
            @Override
            public BPReport createFromParcel(Parcel in) {
                return new BPReport(in);
            }

            @Override
            public BPReport[] newArray(int size) {
                return new BPReport[size];
            }
        };
    }


    public class Gldata {

        @SerializedName("GlName")
        @Expose
        private String glName;
        @SerializedName("GLCode")
        @Expose
        private String gLCode;
        @SerializedName("GLMobileNo")
        @Expose
        private String gLMobileNo;

        public String getGlName() {
            return glName;
        }

        public void setGlName(String glName) {
            this.glName = glName;
        }

        public String getGLCode() {
            return gLCode;
        }

        public void setGLCode(String gLCode) {
            this.gLCode = gLCode;
        }

        public String getGLMobileNo() {
            return gLMobileNo;
        }

        public void setGLMobileNo(String gLMobileNo) {
            this.gLMobileNo = gLMobileNo;
        }

    }


    public static class PreviousMonthSale implements Parcelable {

        @SerializedName("productcategory")
        @Expose
        private String productcategory;

        @SerializedName("TotalSale")
        @Expose
        private String TotalSale;

        @SerializedName("PrevMonthTarget")
        @Expose
        private String PrevMonthTarget;

        @SerializedName("PrimeryAchived")
        @Expose
        private String PrimeryAchived;

        public PreviousMonthSale() {

        }


        @Override
        public int describeContents() {
            return 0;
        }

        public PreviousMonthSale(Parcel in) {
            productcategory = in.readString();
            TotalSale = in.readString();
            PrevMonthTarget = in.readString();
            PrimeryAchived = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(productcategory);
            dest.writeString(TotalSale);
            dest.writeString(PrevMonthTarget);
            dest.writeString(PrimeryAchived);
        }

        public static final Creator<PreviousMonthSale> CREATOR = new Creator<PreviousMonthSale>() {
            @Override
            public PreviousMonthSale createFromParcel(Parcel in) {
                return new PreviousMonthSale(in);
            }

            @Override
            public PreviousMonthSale[] newArray(int size) {
                return new PreviousMonthSale[size];
            }
        };

        public String getProductcategory() {
            return productcategory;
        }

        public void setProductcategory(String productcategory) {
            this.productcategory = productcategory;
        }

        public String getTotalSale() {
            return TotalSale;
        }

        public void setTotalSale(String totalSale) {
            TotalSale = totalSale;
        }

        public String getPrevMonthTarget() {
            return PrevMonthTarget;
        }

        public void setPrevMonthTarget(String prevMonthTarget) {
            PrevMonthTarget = prevMonthTarget;
        }

        public String getPrimeryAchived() {
            return PrimeryAchived;
        }

        public void setPrimeryAchived(String primeryAchived) {
            PrimeryAchived = primeryAchived;
        }
    }


    public static class CurrentMonthSale implements Parcelable {

        @SerializedName("productcategory")
        @Expose
        private String productcategory;

        @SerializedName("OrderCollectedToday")
        @Expose
        private String OrderCollectedToday;

        @SerializedName("CurrentMonthTraget")
        @Expose
        private String CurrentMonthTraget;

        @SerializedName("CurrentMonthMTDPrimery")
        @Expose
        private String CurrentMonthMTDPrimery;

        public CurrentMonthSale() {

        }

        public CurrentMonthSale(Parcel in) {
            OrderCollectedToday = in.readString();
            CurrentMonthTraget = in.readString();
            CurrentMonthMTDPrimery = in.readString();
            productcategory = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(OrderCollectedToday);
            dest.writeString(CurrentMonthTraget);
            dest.writeString(CurrentMonthMTDPrimery);
            dest.writeString(productcategory);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<CurrentMonthSale> CREATOR = new Creator<CurrentMonthSale>() {
            @Override
            public CurrentMonthSale createFromParcel(Parcel in) {
                return new CurrentMonthSale(in);
            }

            @Override
            public CurrentMonthSale[] newArray(int size) {
                return new CurrentMonthSale[size];
            }
        };

        public String getProductcategory() {
            return productcategory;
        }

        public void setProductcategory(String productcategory) {
            this.productcategory = productcategory;
        }

        public String getOrderCollectedToday() {
            return OrderCollectedToday;
        }

        public void setOrderCollectedToday(String orderCollectedToday) {
            OrderCollectedToday = orderCollectedToday;
        }

        public String getCurrentMonthTraget() {
            return CurrentMonthTraget;
        }

        public void setCurrentMonthTraget(String currentMonthTraget) {
            CurrentMonthTraget = currentMonthTraget;
        }

        public String getCurrentMonthMTDPrimery() {
            return CurrentMonthMTDPrimery;
        }

        public void setCurrentMonthMTDPrimery(String currentMonthMTDPrimery) {
            CurrentMonthMTDPrimery = currentMonthMTDPrimery;
        }
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

}