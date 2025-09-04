package com.chethan.amazon.validation;

import com.chethan.amazon.creation.Products;

public class ProductValidate {
    Products product;
    public boolean productValidation(Products product){
        boolean isProductValiated = false;
        boolean isId = false;
        boolean isName = false;
        boolean isPrice = false;
        if(product.getPId()>0){
            isId = true;
        }else System.out.println("Invalid Product ID");

        if(product.getPName()!=null && !product.getPName().isEmpty()) isName =true;
        else System.out.println("Invalid product name");

        if(product.getPrice()>0) isPrice = true;
        else System.out.println("Invalid product price");

        if(isId && isName && isPrice) isProductValiated = true;
        else System.out.println("Some fields are missing");


        return isProductValiated;
    }



}
