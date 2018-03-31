package com.suleiman.pagination.retailer.model.request;

import com.suleiman.pagination.retailer.model.service.base.RequestAuthUserIdBase;

/**
 * Created by sksharma1 on 22-01-2018.
 */
public class RequestLMsCrmData extends RequestAuthUserIdBase
{
    String LMSid="";

    public String getLMSid() {
        return LMSid;
    }

    public void setLMSid(String LMSid) {
        this.LMSid = LMSid;
    }
}
