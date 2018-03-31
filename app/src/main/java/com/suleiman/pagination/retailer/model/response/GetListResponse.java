package com.suleiman.pagination.retailer.model.response;

import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;

/**
 * Created by mchauhan on 12/22/2017.
 */

public class GetListResponse<T> extends ResponseBase {

    public ArrayList<T> getList() {
        return List;
    }

    public void setList(ArrayList<T> list) {
        List = list;
    }

    ArrayList<T> List;
}
