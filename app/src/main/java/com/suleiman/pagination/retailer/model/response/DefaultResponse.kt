package com.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.suleiman.pagination.retailer.model.response.Res

/**
 * Created by sagrawal on 3/3/2018.
 */
class DefaultResponse {
    @SerializedName("res")
    @Expose
    var res: Res? = null
}