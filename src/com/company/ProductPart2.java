package com.company;

public class ProductPart2 {
    static int number;
    static int unit;
    static int price;
    static String name;


    public  String getName() {

        return name;
    }

    public  void setName(String name) {

        ProductPart2.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        ProductPart2.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        ProductPart2.unit = unit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        ProductPart2.number = number;
    }

    ProductPart2() {

    }

    ProductPart2(int number, int unit, int price, String name) {
        this.number = number;
        this.unit = unit;
        this.price = price;
        this.name = name;

    }

    @Override
    public String toString() {
        String desc = "Number: " + getNumber() + "\nUnit: " + getUnit() + "\nPrice: " + getPrice() + "\nName: " + getName();
        return desc;
    }

    public static void main(String[] args) {
        ProductPart2 Rice = new ProductPart2(7, 3, 6, "Rice");

        System.out.println(Rice);
    }
}