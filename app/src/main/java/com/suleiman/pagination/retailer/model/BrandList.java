package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BrandList {

@SerializedName("BrandType")
@Expose
private String brandType;

public String getBrandType() {
return brandType;
}

public void setBrandType(String brandType) {
this.brandType = brandType;
}

}