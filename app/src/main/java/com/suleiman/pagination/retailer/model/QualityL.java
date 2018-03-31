package com.suleiman.pagination.retailer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QualityL {

@SerializedName("QltyCode")
@Expose
private String qltyCode;
@SerializedName("QltyName")
@Expose
private String qltyName;

public String getQltyCode() {
return qltyCode;
}

public void setQltyCode(String qltyCode) {
this.qltyCode = qltyCode;
}

public String getQltyName() {
return qltyName;
}

public void setQltyName(String qltyName) {
this.qltyName = qltyName;
}

    @Override
    public String toString() {
        return qltyName;
    }
}

