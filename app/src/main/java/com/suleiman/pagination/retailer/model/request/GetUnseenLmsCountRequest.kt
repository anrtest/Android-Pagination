package com.model.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.suleiman.pagination.retailer.model.Authentication

/**
 * Created by sagrawal on 1/31/2018.
 */
class GetUnseenLmsCountRequest {

    @SerializedName("Authentication")
    @Expose
    var authentication: Authentication? = null

   /* @SerializedName("date")
    @Expose
    var date: String? = null*/

    @SerializedName("UserId")
    @Expose
    var userId: String? = null



}
