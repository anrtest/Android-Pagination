package com.suleiman.pagination.retailer.model.request;

import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by sksharma1 on 22-01-2018.
 */
public class Request_ServiceCRMdata extends RequestAuthUserIdBase
{
    String crmid="";

    public String getCrmid()
    {
        return crmid;
    }

    public void setCrmid(String crmid) {
        this.crmid = crmid;
    }
}
