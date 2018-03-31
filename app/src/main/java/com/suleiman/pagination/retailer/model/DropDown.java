package com.suleiman.pagination.retailer.model;


import com.suleiman.pagination.retailer.model.response.Res;

public class DropDown {

    private Res res;
    private DropDownService_data data;

    public Res getRes() {
        return res;
    }

    public void setRes(Res res) {
        this.res = res;
    }

    public DropDownService_data getData() {
        return data;
    }

    public void setData(DropDownService_data data) {
        this.data = data;
    }
}