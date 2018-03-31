package com.suleiman.pagination.retailer.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProductsDealingIn implements Parcelable {

    @SerializedName("ProductCode")
    @Expose
    private String productCode;
    @SerializedName("TotalSale")
    @Expose
    private String totalSale;

    @SerializedName("KentSale")
    @Expose
    private String kentSale;

    /*@SerializedName("BPCode")
    @Expose
    private String BPCode;


    @SerializedName("BPName")
    @Expose
    private String BPName;
*/

  /*  @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(productCode);
        dest.writeString(totalSale);
        dest.writeString(kentSale);
        dest.writeString(BPCode);
        dest.writeString(BPName);
        dest.writeTypedList(BP);
        dest.writeTypedList(competitorDealingIn);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProductsDealingIn> CREATOR = new Creator<ProductsDealingIn>() {
        @Override
        public ProductsDealingIn createFromParcel(Parcel in) {
            return new ProductsDealingIn(in);
        }

        @Override
        public ProductsDealingIn[] newArray(int size) {
            return new ProductsDealingIn[size];
        }
    };*/

    protected ProductsDealingIn(Parcel in) {
        productCode = in.readString();
        totalSale = in.readString();
        kentSale = in.readString();
        BP = in.createTypedArrayList(DistributorBase.CREATOR);
        competitorDealingIn = in.createTypedArrayList(CompetitorDealingIn.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(productCode);
        dest.writeString(totalSale);
        dest.writeString(kentSale);
        dest.writeTypedList(BP);
        dest.writeTypedList(competitorDealingIn);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProductsDealingIn> CREATOR = new Creator<ProductsDealingIn>() {
        @Override
        public ProductsDealingIn createFromParcel(Parcel in) {
            return new ProductsDealingIn(in);
        }

        @Override
        public ProductsDealingIn[] newArray(int size) {
            return new ProductsDealingIn[size];
        }
    };

    public ArrayList<DistributorBase> getBP() {
        return BP;
    }

    public void setBP(ArrayList<DistributorBase> BP) {
        this.BP = BP;
    }

    @SerializedName("BP")
    @Expose
    private ArrayList<DistributorBase> BP = new ArrayList<>();

    @SerializedName("CompetitorDealingIn")
    @Expose
    private List<CompetitorDealingIn> competitorDealingIn = null;


    /*   protected ProductsDealingIn(Parcel in) {
               productCode = in.readString();
               totalSale = in.readString();
               kentSale = in.readString();
               BPCode = in.readString();
               competitorDealingIn = in.createTypedArrayList(CompetitorDealingIn.CREATOR);
           }


           @Override
           public void writeToParcel(Parcel dest, int flags) {
               dest.writeString(productCode);
               dest.writeString(totalSale);
               dest.writeString(kentSale);
               dest.writeString(BPCode);
               dest.writeTypedList(competitorDealingIn);
           }

           @Override
           public int describeContents() {
               return 0;
           }

           public static final Creator<ProductsDealingIn> CREATOR = new Creator<ProductsDealingIn>() {
               @Override
               public ProductsDealingIn createFromParcel(Parcel in) {
                   return new ProductsDealingIn(in);
               }

               @Override
               public ProductsDealingIn[] newArray(int size) {
                   return new ProductsDealingIn[size];
               }
           };

       */
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(String totalSale) {
        this.totalSale = totalSale;
    }

    public String getKentSale() {
        return kentSale;
    }

    public void setKentSale(String kentSale) {
        this.kentSale = kentSale;
    }


    public List<CompetitorDealingIn> getCompetitorDealingIn() {
        return competitorDealingIn;
    }

    public void setCompetitorDealingIn(List<CompetitorDealingIn> competitorDealingIn) {
        this.competitorDealingIn = competitorDealingIn;
    }

    public ProductsDealingIn() {

    }

   /* protected ProductsDealingIn(Parcel in) {

        productCode = in.readString();
        totalSale = in.readString();
        kentSale = in.readString();
        BPCode = in.readString();

        //competitorDealingIn = in.readArrayList();
        in.readTypedList(competitorDealingIn, CompetitorDealingIn.CREATOR);

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(productCode);
        dest.writeString(totalSale);
        dest.writeString(kentSale);
        dest.writeString(BPCode);
        dest.writeTypedList(competitorDealingIn);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ProductsDealingIn> CREATOR = new Creator<ProductsDealingIn>() {
        @Override
        public ProductsDealingIn createFromParcel(Parcel in) {
            return new ProductsDealingIn(in);
        }

        @Override
        public ProductsDealingIn[] newArray(int size) {
            return new ProductsDealingIn[size];
        }
    };*/

}