package com.suleiman.pagination.retailer.model;

/**
 * Created by sksharma1 on 27-01-2018.
 */
public class CustomerProduct
{


    int ProductId;
    String ProductCode;
    String ProductName;
    String ProductQty;

    public CustomerProduct(int Productid, String ProductCode, String ProductName, String ProductQty)
    {
        this.ProductId= Productid;
        this.ProductCode=ProductCode;
        this.ProductName=ProductName;
        this.ProductQty=ProductQty;
    }


    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductQty() {
        return ProductQty;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public void setProductQty(String productQty) {
        ProductQty = productQty;

    }
}
