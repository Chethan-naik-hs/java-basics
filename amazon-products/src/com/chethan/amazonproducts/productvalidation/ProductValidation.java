package com.chethan.amazonproducts.productvalidation;

import com.chethan.amazonproducts.productinitiation.ProductDetails;

public class ProductValidation {

    public boolean  validatingProduct(ProductDetails productDetails){
        boolean isProductValid = false;
        boolean isId = false;
        boolean isName = false;
        boolean isCost = false;
        boolean isCategory = false;

        if(productDetails.getProductId() > 0) isId = true;
        else System.out.println("Invalid product ID");

        if(productDetails.getProductName() != null && !productDetails.getProductName().isEmpty()) isName = true;
        else System.out.println("Invalid product name");

        if(productDetails.getProductCost() >0 ) isCost = true;
        else System.out.println("Invalid product details");

        if(productDetails.getProductCategory() != null && !productDetails.getProductCategory().isEmpty()) isCategory = true;
        else System.out.println("Invalid product catagory");

        if(isId && isName && isCost && isCategory) isProductValid = true;
        else System.out.println("Invalid product details entered");



        return isProductValid;
    }
}
