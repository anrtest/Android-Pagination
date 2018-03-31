package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PotiantialL {

@SerializedName("Potiantial")
@Expose
private String potiantial;

public String getPotiantial() {
return potiantial;
}

public void setPotiantial(String potiantial) {
this.potiantial = potiantial;
}

}