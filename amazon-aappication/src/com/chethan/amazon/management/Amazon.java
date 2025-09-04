package com.chethan.amazon.management;

import com.chethan.amazon.creation.Products;
import com.chethan.amazon.validation.ProductValidate;

public class Amazon {

    public Amazon(int size){
        product= new Products[size];
    }
    public Products[] product ;
    ProductValidate val= new ProductValidate();
    int index;

    public boolean addProducts(Products products){
        boolean isProductAdded = false;
        if(products != null && val.productValidation(products)){
            product[index++] = products;
            isProductAdded = true;
        }else System.out.println("Product not added");

        return isProductAdded;
    }

    public void getAllProducts(){
        System.out.println("==================list of all products=============");

        for(Products products:product){
            System.out.println("Product ID : "+products.getPId());
            System.out.println("Product name : "+products.getPName());
            System.out.println("Product price : "+products.getPrice());
            System.out.println("-----------------------------------------------");
        }
    }


}
