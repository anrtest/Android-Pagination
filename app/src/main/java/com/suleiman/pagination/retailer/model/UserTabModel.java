package com.suleiman.pagination.retailer.model;

/**
 * Created by jalam on 28-12-2017.
 */

public class UserTabModel {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }


    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }


    String text;
    int drawableId;
    int tag;


}
