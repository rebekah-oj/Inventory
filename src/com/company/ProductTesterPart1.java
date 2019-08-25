package com.company;


public class ProductTesterPart1 {
    static  ProductPart1 productPart1 = new ProductPart1();
    static ProductPart1 productPart2 = new ProductPart1();
    static ProductPart1 productPart3 = new ProductPart1(30, 2, 40000, "Dangote");
    static ProductPart1 productPart4 = new ProductPart1(10, 5, 70000, "Honeywell");
    static  ProductPart1 productPart5 = new ProductPart1(15, 8, 80000, "Flourmill");
    static  ProductPart1 productPart6 = new ProductPart1(26, 9, 60000, "Mamaafrica");


    public static void main(String[] args) {
     System.out.println(productPart3);
     System.out.println(productPart4);
     System.out.println(productPart5);
     System.out.println(productPart6);




    }


}
