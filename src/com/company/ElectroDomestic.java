package com.company;

public class ElectroDomestic {
    /*
        Create a base class named Electro domestic
        Add the following attributes: price, color, weight
        Default values for are white color, price 100 and weight of 5kg
        Available colours are white, black, blue and grey
        Implement the following constructors:
        Default
        Weight and price
        All 3 attributes
        Implement the following methods
            1) CheckColor()
            2) CheckPrice()
    */
    public double price=100.00;
    public String color="white";
    public int weight=5;

    public ElectroDomestic(){

    }

    public ElectroDomestic(int weight, double price){
        this.weight = weight;
        this.price = price;
    }

    public ElectroDomestic(int weight, double price, String color){
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public String CheckColor(){
        return this.color;
    }

    public double CheckPrice(){
        return this.price;
    }
}
