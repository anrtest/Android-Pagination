package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

public class DailyReportResponse extends ResponseBase {

    @SerializedName("ALLdataReports")
    @Expose
    private List<ALLdataReport> aLLdataReports = null;

    public List<ALLdataReport> getALLdataReports() {
        return aLLdataReports;
    }

    public void setALLdataReports(List<ALLdataReport> aLLdataReports) {
        this.aLLdataReports = aLLdataReports;
    }


    public class ALLdataReport {

        public String getNoOfVisit() {
            return noOfVisit;
        }

        public void setNoOfVisit(String noOfVisit) {
            this.noOfVisit = noOfVisit;
        }

        public String getNoOfActivity() {
            return noOfActivity;
        }

        public void setNoOfActivity(String noOfActivity) {
            this.noOfActivity = noOfActivity;
        }

        public String getTotalHours() {
            return totalHours;
        }

        public void setTotalHours(String totalHours) {
            this.totalHours = totalHours;
        }

        @SerializedName("noOfVisit")
        @Expose
        private String noOfVisit;

        @SerializedName("noOfActivity")
        @Expose
        private String noOfActivity;

        @SerializedName("totalHours")
        @Expose
        private String totalHours;

        @SerializedName("Date")
        @Expose
        private String date;

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        @SerializedName("remarks")
        @Expose
        private String remarks;


        @SerializedName("Reports")
        @Expose
        private List<ViewVisitDealerList> reports = null;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public List<ViewVisitDealerList> getReports() {
            return reports;
        }

        public void setReports(List<ViewVisitDealerList> reports) {
            this.reports = reports;
        }

    }

//
//    public class DLRListProductSaleingReportUserwise {
//
//        @SerializedName("Category")
//        @Expose
//        private String category;
//        @SerializedName("MTDPurchase1")
//        @Expose
//        private String mTDPurchase1;
//        @SerializedName("MTDSales1")
//        @Expose
//        private String mTDSales1;
//        @SerializedName("CurrentStock1")
//        @Expose
//        private String currentStock1;
//        @SerializedName("OrderTaken1")
//        @Expose
//        private String orderTaken1;
//
//        public String getCategory() {
//            return category;
//        }
//
//        public void setCategory(String category) {
//            this.category = category;
//        }
//
//        public String getMTDPurchase1() {
//            return mTDPurchase1;
//        }
//
//        public void setMTDPurchase1(String mTDPurchase1) {
//            this.mTDPurchase1 = mTDPurchase1;
//        }
//
//        public String getMTDSales1() {
//            return mTDSales1;
//        }
//
//        public void setMTDSales1(String mTDSales1) {
//            this.mTDSales1 = mTDSales1;
//        }
//
//        public String getCurrentStock1() {
//            return currentStock1;
//        }
//
//        public void setCurrentStock1(String currentStock1) {
//            this.currentStock1 = currentStock1;
//        }
//
//        public String getOrderTaken1() {
//            return orderTaken1;
//        }
//
//        public void setOrderTaken1(String orderTaken1) {
//            this.orderTaken1 = orderTaken1;
//        }
//
//    }


//    public class DailyReport {
//        @SerializedName("Attendence")
//        @Expose
//    }

//    public class DailyReport {
//
//        @SerializedName("DLRListProductSaleingReportUserwise")
//        @Expose
//        private List<ReportStockModel> dLRListProductSaleingReportUserwise = null;
//        @SerializedName("User_Id")
//        @Expose
//        private String userId;
//        @SerializedName("Dealer_Id")
//        @Expose
//        private String dealerId;
//        @SerializedName("RetailOutletName")
//        @Expose
//        private String retailOutletName;
//        @SerializedName("CheckingDate")
//        @Expose
//        private String checkingDate;
//        @SerializedName("CheckOutDate")
//        @Expose
//        private String checkOutDate;
//        @SerializedName("QualityofDisplay")
//        @Expose
//        private String qualityofDisplay;
//        @SerializedName("KnowledgeofSP")
//        @Expose
//        private String knowledgeofSP;
//
//        @SerializedName("KnowledgeofISP")
//        @Expose
//        private String knowledgeofISP;
//
//        @SerializedName("ActivityDone")
//        @Expose
//        private String activityDone;
//        @SerializedName("VisitRemarks")
//        @Expose
//        private String visitRemarks;
//        @SerializedName("IsOfficeVisit")
//        @Expose
//        private String isOfficeVisit;
//
//
//
//        @SerializedName("EnqGenerated")
//        @Expose
//        private String enqGenerated;
//
//        @SerializedName("SoldQty")
//        @Expose
//        private String soldQty;
//
//        @SerializedName("POP")
//        @Expose
//        private String pop;
//
//        @SerializedName("POPDetail")
//        @Expose
//        private String pOPDetail;
//
//
//
//
//        public List<ReportStockModel> getDLRListProductSaleingReportUserwise() {
//            return dLRListProductSaleingReportUserwise;
//        }
//
//        public void setDLRListProductSaleingReportUserwise(List<ReportStockModel> dLRListProductSaleingReportUserwise) {
//            this.dLRListProductSaleingReportUserwise = dLRListProductSaleingReportUserwise;
//        }
//
//        public String getUserId() {
//            return userId;
//        }
//
//        public void setUserId(String userId) {
//            this.userId = userId;
//        }
//
//        public String getDealerId() {
//            return dealerId;
//        }
//
//        public void setDealerId(String dealerId) {
//            this.dealerId = dealerId;
//        }
//
//        public String getRetailOutletName() {
//            return retailOutletName;
//        }
//
//        public void setRetailOutletName(String retailOutletName) {
//            this.retailOutletName = retailOutletName;
//        }
//
//        public String getCheckingDate() {
//            return checkingDate;
//        }
//
//        public void setCheckingDate(String checkingDate) {
//            this.checkingDate = checkingDate;
//        }
//
//        public String getCheckOutDate() {
//            return checkOutDate;
//        }
//
//        public void setCheckOutDate(String checkOutDate) {
//            this.checkOutDate = checkOutDate;
//        }
//
//        public String getQualityofDisplay() {
//            return qualityofDisplay;
//        }
//
//        public void setQualityofDisplay(String qualityofDisplay) {
//            this.qualityofDisplay = qualityofDisplay;
//        }
//
//        public String getKnowledgeofSP() {
//            return knowledgeofSP;
//        }
//
//        public void setKnowledgeofSP(String knowledgeofSP) {
//            this.knowledgeofSP = knowledgeofSP;
//        }
//
//        public String getActivityDone() {
//            return activityDone;
//        }
//
//        public void setActivityDone(String activityDone) {
//            this.activityDone = activityDone;
//        }
//
//        public String getVisitRemarks() {
//            return visitRemarks;
//        }
//
//        public void setVisitRemarks(String visitRemarks) {
//            this.visitRemarks = visitRemarks;
//        }
//
//        public String getIsOfficeVisit() {
//            return isOfficeVisit;
//        }
//
//        public void setIsOfficeVisit(String isOfficeVisit) {
//            this.isOfficeVisit = isOfficeVisit;
//        }
//
//        public String getKnowledgeofISP() {
//            return knowledgeofISP;
//        }
//
//        public void setKnowledgeofISP(String knowledgeofISP) {
//            this.knowledgeofISP = knowledgeofISP;
//        }
//
//
//        public String getEnqGenerated() {
//            return enqGenerated;
//        }
//
//        public void setEnqGenerated(String enqGenerated) {
//            this.enqGenerated = enqGenerated;
//        }
//
//        public String getSoldQty() {
//            return soldQty;
//        }
//
//        public void setSoldQty(String soldQty) {
//            this.soldQty = soldQty;
//        }
//
//        public String getPop() {
//            return pop;
//        }
//
//
//
//        public void setPop(String pop) {
//            this.pop = pop;
//        }
//
//        public String getpOPDetail() {
//            return pOPDetail;
//        }
//
//        public void setpOPDetail(String pOPDetail) {
//            this.pOPDetail = pOPDetail;
//        }
//    }

}