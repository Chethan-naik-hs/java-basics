package com.chethan.amazonproducts;

import com.chethan.amazonproducts.productinitiation.ProductDetails;
import com.chethan.amazonproducts.productmanagement.ProductManagement;

public class ProductRunner {
    public static void main(String[] args) {
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductId(1001);
        productDetails.setProductName("dell latitute 7490");
        productDetails.setProductCost(120000.00D);
        productDetails.setProductCategory("Laptop");

        ProductManagement productManagement = new ProductManagement();
        boolean productAdded = productManagement.productCreation(productDetails);
        if(productAdded){
            productManagement.printProducts();
        }else System.out.println("Product not added");

        productManagement.updateProducts(130000.00D);

        System.out.println("updated product cost "+productDetails.getProductCost());


    }
}
