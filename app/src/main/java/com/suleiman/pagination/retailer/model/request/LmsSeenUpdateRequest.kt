package com.model.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.suleiman.pagination.retailer.model.Authentication

/**
 * Created by sagrawal on 2/28/2018.
 */
class LmsSeenUpdateRequest {

    @SerializedName("Authentication")
    @Expose
    var authentication: Authentication? = null

    @SerializedName("ProspectsId")
    @Expose
    var ProspectsId: String? = null

    @SerializedName("UserId")
    @Expose
    var userId: String? = null

    @SerializedName("hasSeen")
    @Expose
    var hasSeen: Boolean? = false

}