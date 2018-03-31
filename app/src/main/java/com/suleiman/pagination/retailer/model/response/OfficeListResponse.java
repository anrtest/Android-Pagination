package com.suleiman.pagination.retailer.model.response;

import com.suleiman.pagination.retailer.model.Dealer;
import com.suleiman.pagination.retailer.model.service.base.ResponseBase;

import java.util.ArrayList;

/**
 * Created by mchauhan on 12/22/2017.
 */

public class OfficeListResponse extends ResponseBase {


    public ArrayList<Dealer> getOfficeGetList() {
        return OfficeGetList;
    }

    public void setOfficeGetList(ArrayList<Dealer> officeGetList) {
        OfficeGetList = officeGetList;
    }

    ArrayList<Dealer> OfficeGetList = new ArrayList<>();

}
