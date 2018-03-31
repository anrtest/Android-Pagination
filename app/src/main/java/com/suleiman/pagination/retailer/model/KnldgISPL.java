package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KnldgISPL {

@SerializedName("KnldgCodeISP")
@Expose
private String knldgCodeISP;
@SerializedName("KnldgNameISP")
@Expose
private String knldgNameISP;

public String getKnldgCodeISP() {
return knldgCodeISP;
}

public void setKnldgCodeISP(String knldgCodeISP) {
this.knldgCodeISP = knldgCodeISP;
}

public String getKnldgNameISP() {
return knldgNameISP;
}

public void setKnldgNameISP(String knldgNameISP) {
this.knldgNameISP = knldgNameISP;
}


    @Override
    public String toString()
    {
        return knldgNameISP;
    }
}

