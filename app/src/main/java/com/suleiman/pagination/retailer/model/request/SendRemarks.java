package com.suleiman.pagination.retailer.model.request;

import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by shankitk on 2/2/2018.
 */

public class SendRemarks extends RequestAuthUserIdBase
{
   private String Sub_id;
   private String date;
   private String VisitRemarks;

    public String getSub_id() {
        return Sub_id;
    }

    public void setSub_id(String sub_id) {
        Sub_id = sub_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemarks() {
        return VisitRemarks;
    }

    public void setRemarks(String remarks) {
        VisitRemarks = remarks;
    }
}
