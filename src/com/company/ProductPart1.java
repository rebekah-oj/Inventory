package com.company;

public class ProductPart1{
    static int number;
    static int unit;
    static int price;
    static String name;



    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ProductPart1.name = name;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        ProductPart1.price = price;
    }

    public static int getUnit() {
        return unit;
    }

    public static void setUnit(int unit) {
        ProductPart1.unit = unit;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        ProductPart1.number = number;
    }

    ProductPart1(){

    }
    ProductPart1(int number,int unit,int price,String name){
        this.number= number;
        this.unit= unit;
        this.price=price;
        this.name=name;

    }

    @Override
    public String toString() {
        String desc= "Number: "+getNumber()+"\nUnit: "+getUnit()+"\nPrice: "+getPrice() +"\nName: " + getName();
        return desc;
    }
    public static void main(String [] args){
        ProductPart1 Rice = new ProductPart1(7, 3,6,"Rice");

        System.out.println(Rice);
    }
}




