package com.company;

import com.company.ElectroDomestic;

public class Washer extends ElectroDomestic {
    /*
        Create a washer class and inherit the base class
            1) Implement a default constructor
            2) Change the price to any different amount
            3) Call the checkPrice method from the parent class
    */

    public Washer(){
        super();
    }

    public void ChangePrice(double price){
        super.price = price;
    }

    public double CheckPrice(){
        return super.CheckPrice();
    }
}
