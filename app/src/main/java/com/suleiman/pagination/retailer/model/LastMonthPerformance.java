package com.suleiman.pagination.retailer.model;

/**
 * Created by achauhan2 on 1/30/2018.
 */

public class LastMonthPerformance {

    String category;
    String target;
    String achieved;
    String shortfall;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShortfall() {
        return shortfall;
    }

    public void setShortfall(String shortfall) {
        this.shortfall = shortfall;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAchieved() {
        return achieved;
    }

    public void setAchieved(String achieved) {
        this.achieved = achieved;
    }


}
