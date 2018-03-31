package com.model.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.suleiman.pagination.retailer.model.Authentication

/**
 * Created by sagrawal on 2/13/2018.
 */
class GpsStateUpdateRequest {

    @SerializedName("Authentication")
    @Expose
    var authentication: Authentication? = null

    @SerializedName("UserId")
    @Expose
    var userId: String? = null
}