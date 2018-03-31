package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.RetailerReport2;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;

/**
 * Created by mchauhan on 11/23/2017.
 */

public class RetailerReportResponse extends ResponseBase {



    public Report getCategoryList() {
        return CategoryList;
    }

    public void setCategoryList(Report categoryList) {
        this.CategoryList = categoryList;
    }

    @SerializedName("CategoryList")
    @Expose
    public Report CategoryList;

    public static class Report {
        public ArrayList<RetailerReport2> getCategory() {
            return Category;
        }

        public void setCategory(ArrayList<RetailerReport2> category) {
            this.Category = category;
        }

        @SerializedName("Category")
        @Expose
        ArrayList<RetailerReport2> Category = new ArrayList<>();
    }
}
