package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailTypeL {

@SerializedName("RetailType")
@Expose
private String retailType;

public String getRetailType() {
return retailType;
}

public void setRetailType(String retailType) {
this.retailType = retailType;
}

}