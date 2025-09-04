package com.chethan.amazonproducts.productmanagement;

import com.chethan.amazonproducts.productinitiation.ProductDetails;
import com.chethan.amazonproducts.productvalidation.ProductValidation;

public class ProductManagement {

    ProductDetails productDetails;
    public boolean productCreation(ProductDetails productDetails) {
        boolean isProductCreated = false;

        ProductValidation productValidation = new ProductValidation();
        boolean isProductValid = productValidation.validatingProduct(productDetails);
        if (isProductValid) {
            this.productDetails = productDetails;
            isProductCreated = true;
        }
        return isProductCreated;
    }

        public void printProducts(){
            System.out.println("Product ID "+productDetails.getProductId());
            System.out.println("Product Name "+productDetails.getProductName());
            System.out.println("Product cost "+productDetails.getProductCost()+"rs");
            System.out.println("Product category "+productDetails.getProductCategory());
        }
        public boolean updateProducts(double price){
            boolean isPriceUpdated = false;
            if(price>0.00){
                productDetails.setProductCost(price);
                isPriceUpdated = true;
            }
            return isPriceUpdated;

        }


}
