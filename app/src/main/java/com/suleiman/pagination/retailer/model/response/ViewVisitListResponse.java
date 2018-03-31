package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

/**
 * Created by jalam on 27-11-2017.
 */

public class ViewVisitListResponse extends ResponseBase {

    @SerializedName("ViewVisitDealerList")
    @Expose
    private List<ViewVisitDealerList> viewVisitDealerList = null;


    @SerializedName("IsCurrentDate")
    @Expose
    String isCurrentDate;



    public List<ViewVisitDealerList> getViewVisitDealerList() {
        return viewVisitDealerList;
    }

    public void setViewVisitDealerList(List<ViewVisitDealerList> viewVisitDealerList) {
        this.viewVisitDealerList = viewVisitDealerList;
    }

    public String getIsCurrentDate() {
        return isCurrentDate;
    }

    public void setIsCurrentDate(String isCurrentDate) {
        this.isCurrentDate = isCurrentDate;
    }
}
