package com.suleiman.pagination.retailer.model;

import com.suleiman.pagination.retailer.model.response.Res;

/**
 * Created by sksharma1 on 16-10-2017.
 */
public class LoginDataModel
{
    private Res res;

    private Data data;


    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
