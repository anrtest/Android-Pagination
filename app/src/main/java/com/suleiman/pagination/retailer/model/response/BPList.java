package com.suleiman.pagination.retailer.model.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.UserBaseRequest;


import java.util.ArrayList;

/**
 * Created by mchauhan on 12/29/2017.
 */

public class BPList extends UserBaseRequest implements Parcelable {


    public BPList(String id, String name, String state, String city,
                  String address1, String address2, String lat, String lng,
                  String type, String mobile, String pincode, String distance) {

        this.refId = id;
        this.retailOutletName = name;
        this.state = state;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
        this.mobile = mobile;
        this.Pincode = pincode;
        this.type = type;
        this.lat = lat;
        this.lng = lng;
        this.distance = distance;

    }

    protected BPList(Parcel in) {
        refId = in.readString();
        retailOutletName = in.readString();
        bpSaleList = in.createTypedArrayList(BpSaleList.CREATOR);
        bpLastMonthtargetList = in.createTypedArrayList(BpSaleList.CREATOR);
        state = in.readString();
        city = in.readString();
        address1 = in.readString();
        address2 = in.readString();
        lat = in.readString();
        lng = in.readString();
        type = in.readString();
        mobile = in.readString();
        Pincode = in.readString();
        distance = in.readString();
        contactPersonName = in.readString();
        contactPersonMobile = in.readString();
        //IsEnabelGPS = in.readByte() != 0;
//        IsEnabelGPS = in.readByte();
         IsEnabelGPS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(refId);
        dest.writeString(retailOutletName);
        dest.writeTypedList(bpSaleList);
        dest.writeTypedList(bpLastMonthtargetList);
        dest.writeString(state);
        dest.writeString(city);
        dest.writeString(address1);
        dest.writeString(address2);
        dest.writeString(lat);
        dest.writeString(lng);
        dest.writeString(type);
        dest.writeString(mobile);
        dest.writeString(Pincode);
        dest.writeString(distance);
        dest.writeString(contactPersonName);
        dest.writeString(contactPersonMobile);
        dest.writeString(IsEnabelGPS);
        // dest.writeByte((byte) (IsEnabelGPS ? 1 : 0));
//        dest.writeByte(IsEnabelGPS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<BPList> CREATOR = new Creator<BPList>() {
        @Override
        public BPList createFromParcel(Parcel in) {
            return new BPList(in);
        }

        @Override
        public BPList[] newArray(int size) {
            return new BPList[size];
        }
    };

    public ArrayList<BpSaleList> getBpSaleList() {
        return bpSaleList;
    }

    public void setBpSaleList(ArrayList<BpSaleList> bpSaleList) {
        bpSaleList = bpSaleList;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @SerializedName("BpSaleList")
    @Expose
    private ArrayList<BpSaleList> bpSaleList;


    @SerializedName("BpLastMonthtargetList")
    @Expose
    private ArrayList<BpSaleList> bpLastMonthtargetList;

    public ArrayList<BpSaleList> getBpLastMonthtargetList() {
        return bpLastMonthtargetList;
    }

    public void setBpLastMonthtargetList(ArrayList<BpSaleList> bpLastMonthtargetList) {
        this.bpLastMonthtargetList = bpLastMonthtargetList;
    }

    @SerializedName("State")
    @Expose
    private String state;

    @SerializedName("Address1")
    @Expose
    private String address1;

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @SerializedName("Address2")
    @Expose
    private String address2;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("type")
    @Expose
    private String type;

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("Pincode")
    @Expose
    private String Pincode;

    @SerializedName("ContactPersonName")
    @Expose
    private String contactPersonName;

    @SerializedName("ContactPersonMobile")
    @Expose
    private String contactPersonMobile;

    /* public String getIsEnabelGPS() {
         return IsEnabelGPS;
     }

     public void setIsEnabelGPS(String isEnabelGPS) {
         IsEnabelGPS = isEnabelGPS;
     }
 */
    @SerializedName("IsEnabelGPS")
    @Expose
//    byte IsEnabelGPS;
    String IsEnabelGPS;


    public String isEnabelGPS() {
        return IsEnabelGPS;
    }

   /* public void setEnabelGPS(boolean enabelGPS) {
      //  IsEnabelGPS = enabelGPS;
    }
*/

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonMobile() {
        return contactPersonMobile;
    }

    public void setContactPersonMobile(String contactPersonMobile) {
        this.contactPersonMobile = contactPersonMobile;
    }


    public static class BpSaleList implements Parcelable {

        @SerializedName("TotalSale")
        @Expose
        private String totalSale;

        @SerializedName("targetSale")
        @Expose
        private String targetSale;

        @SerializedName("shortfall")
        @Expose
        private String shortfall;

        @SerializedName("Month")
        @Expose
        private String month;
        @SerializedName("year")
        @Expose
        private String year;

        @SerializedName("productcategory")
        @Expose
        private String productcategory;

        public BpSaleList() {

        }

        public BpSaleList(Parcel in) {
            totalSale = in.readString();
            month = in.readString();
            year = in.readString();
            productcategory = in.readString();
            targetSale = in.readString();
            shortfall = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(totalSale);
            dest.writeString(month);
            dest.writeString(year);
            dest.writeString(productcategory);
            dest.writeString(targetSale);
            dest.writeString(shortfall);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<BpSaleList> CREATOR = new Creator<BpSaleList>() {
            @Override
            public BpSaleList createFromParcel(Parcel in) {
                return new BpSaleList(in);
            }

            @Override
            public BpSaleList[] newArray(int size) {
                return new BpSaleList[size];
            }
        };

        public void setYear(String year) {
            this.year = year;
        }

        public String getProductcategory() {
            return productcategory;
        }

        public void setProductcategory(String productcategory) {
            this.productcategory = productcategory;
        }

        public String getShortfall() {
            return shortfall;
        }

        public void setShortfall(String shortfall) {
            this.shortfall = shortfall;
        }

        public String getTotalSale() {
            return totalSale;
        }

        public void setTotalSale(String totalSale) {
            this.totalSale = totalSale;
        }

        public String getTargetSale() {
            return targetSale;
        }

        public void setTargetSale(String targetSale) {
            this.targetSale = targetSale;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }
    }

}
