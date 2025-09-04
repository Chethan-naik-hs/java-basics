package com.chethan.amazonproducts.productinitiation;

public class ProductDetails {
    private int productId;
    private String productName;
    private double productCost;
    private String productCategory;

    public void setProductId(int productId){
        this.productId = productId;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductCost(double productCost){
        this.productCost = productCost;
    }
    public double getProductCost(){
        return productCost;
    }
    public void setProductCategory(String productCategory){
        this.productCategory = productCategory;
    }
    public String getProductCategory(){
        return productCategory;
    }

}
