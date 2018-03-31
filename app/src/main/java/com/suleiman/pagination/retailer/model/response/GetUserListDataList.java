package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.List;

public class GetUserListDataList extends ResponseBase {


    @SerializedName("GetUserListData")
    @Expose
    private List<GetUserListDatum> getUserListData = null;


    public List<GetUserListDatum> getGetUserListData() {
        return getUserListData;
    }

    public void setGetUserListData(List<GetUserListDatum> getUserListData) {
        this.getUserListData = getUserListData;
    }

}