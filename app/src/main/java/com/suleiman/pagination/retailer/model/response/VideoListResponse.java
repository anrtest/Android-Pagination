package com.suleiman.pagination.retailer.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by achauhan2 on 2/16/2018.
 */

public class VideoListResponse {

    public List<AllVideoList> getAllVideoLists() {
        return allVideoLists;
    }

    public void setAllVideoLists(List<AllVideoList> allVideoLists) {
        this.allVideoLists = allVideoLists;
    }

    @SerializedName("List")
    @Expose
    private List<AllVideoList> allVideoLists = null;


    public class AllVideoList{

        public String getHeader() {
            return Header;
        }

        public void setHeader(String header) {
            Header = header;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getVideoLink() {
            return VideoLink;
        }

        public void setVideoLink(String videoLink) {
            VideoLink = videoLink;
        }

        @SerializedName("Header")
        @Expose
        String Header;

        @SerializedName("Description")
        @Expose
        String Description;

        @SerializedName("VideoLink")
        @Expose
        String VideoLink;
    }
}
