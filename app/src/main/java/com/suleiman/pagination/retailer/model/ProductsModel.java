package com.suleiman.pagination.retailer.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mchauhan on 10/16/2017.
 */

public class ProductsModel {
    String name = "NA";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;
    String qty = "";

    public String getQtyTotal() {
        return qtyTotal;
    }

    public void setQtyTotal(String qtyTotal) {
        this.qtyTotal = qtyTotal;
    }

    String qtyTotal = "";


    String totalSaleText = "";
    String kentSaleText = "";

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    String productId = "";


    public ArrayList<DistributorBase> getDistributorsList() {
        return distributorsList;
    }

    public void setDistributorsList(ArrayList<DistributorBase> distributorsList) {
        this.distributorsList = distributorsList;
    }

    ArrayList<DistributorBase> distributorsList;

    public ArrayList<DistributorBase> getDistributorame() {
        return distributorame;
    }


    public void setDistributorame(ArrayList<DistributorBase> distributorame) {
        this.distributorame = distributorame;
    }

    ArrayList<DistributorBase> distributorame;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    String shortName;


    public ProductsModel(Context ctx, String name, int id, String totalSaleText,
                         String kentSaleText, ArrayList<DistributorBase> distributors, String shortName, String productId) {
        this.name = name;
        this.id = id;
        this.totalSaleText = totalSaleText;
        this.kentSaleText = kentSaleText;
        this.distributorsList = distributors;
        this.distributorame = distributors;
        this.shortName = shortName;
        this.productId = productId;
//        compBrands = ProductsModel.productCompletiveBrands(ctx, id);
    }

    public ProductsModel(Context ctx, String name, int id, String totalSaleText,
                         String kentSaleText, String distributors, String distributorame, String shortName, String productId) {
        this.name = name;
        this.id = id;
        this.totalSaleText = totalSaleText;
        this.kentSaleText = kentSaleText;
        // this.distributors = distributors;
        //this.distributorame = distributorame;
        this.shortName = shortName;
        this.productId = productId;
//        compBrands = ProductsModel.productCompletiveBrands(ctx, id);
    }

    List<CompetitorDealingIn> compBrands = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public List<CompetitorDealingIn> getCompBrands() {
        return compBrands;
    }

    public void setCompBrands(List compBrands) {
        this.compBrands = compBrands;
    }

//    public static ArrayList<CompetitorDealingIn> productCompletiveBrands(Context ctx, int _pid) {
//        ArrayList<CompetitorDealingIn> competitors = new ArrayList<>();
//        UserPreference userPerference = UserPreference.getInstance(ctx);
////        ArrayList<String> list = new ArrayList<>();
//        List<BrandList> brandArrayList = userPerference.getDropDownServieData().getProductL().get(_pid).getBrandList();
//        for (BrandList bData : brandArrayList) {
//            add(bData.getBrandType(), competitors);
//        }
//
//        //add("Prestige", competitors);
////        try {
////            switch (_pid) {
////
////                case Constant.P_Rowp:
////                    add("Pureit", competitors);
////                    add("Aquaguard", competitors);
////                    break;
////                case Constant.P_Uvwp:
////                    add("Eureka Forbes", competitors);
////                    add("Purit", competitors);
////                    add("Blue Mount", competitors);
////                    add("Hitech", competitors);
////                    break;
////                case Constant.P_Ufwp:
////                    add("Eureka Forbes", competitors);
////                    add("Purit", competitors);
////                    add("Tata Swach", competitors);
////                    add("Nasaka", competitors);
////                    add("Livpure (Brahma)", competitors);
////
////                    break;
////                case Constant.P_Ap:
////                    add("Philips", competitors);
////                    add("Atlanta", competitors);
////
////                    break;
////                case Constant.P_Sca:
////
////                    add("Maharaja", competitors);
////                    add("Black & Decker", competitors);
////                    add("Wonderchef", competitors);
////
////                    break;
////                case Constant.P_Vc:
////
////                    add("Eureka Forbes", competitors);
////                    add("Black & Decker", competitors);
////                    add("Panasonic", competitors);
////                    add("Philips", competitors);
////                    add("Karcher SC", competitors);
////                    add("Prestige", competitors);
////
////                    break;
////
////            }
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//        return competitors;
//    }

    public String getTotalSaleText() {
        return totalSaleText;
    }


    public String getKentSaleText() {
        return kentSaleText;
    }

    static public ArrayList<CompetitorDealingIn> add(String name, ArrayList<CompetitorDealingIn> c) {
        CompetitorDealingIn competitor = new CompetitorDealingIn();
        competitor.setCompetitor(name);
        c.add(competitor);
        return c;
    }


}

