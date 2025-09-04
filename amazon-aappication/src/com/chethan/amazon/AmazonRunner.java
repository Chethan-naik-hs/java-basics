package com.chethan.amazon;

import com.chethan.amazon.creation.Products;
import com.chethan.amazon.management.Amazon;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of products to be added");
        int size = scanner.nextInt();
        Amazon amazon = new Amazon(size);
        System.out.println("no of products : "+amazon.product.length);

        for(int i = 0;i< size;i++){
            Products product = new Products();
            System.out.println("Enter product ID");
            product.setPId(scanner.nextInt());

            System.out.println("Enter product name");
            product.setPName(scanner.next());

            System.out.println("Enter product cost");
            product.setPrice(scanner.nextInt());

            amazon.addProducts(product);
        }
        amazon.getAllProducts();
    }

}
