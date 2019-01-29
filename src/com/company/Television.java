package com.company;

import com.company.ElectroDomestic;

public class Television extends ElectroDomestic {
    /*
        Create a tv class and inherit the base class
            1) Implement a default constructor
            2) Change the price to any different amount
            3) Call the checkPrice method from the parent class
            4) Add a channels property
            5) Add a display size property
            5) add a method called changeChannel()
    */

    public double displaySize=23.5;
    public int channel=5;

    public Television(){
        super();
    }

    public void ChangePrice(double price){
        super.price = price;
    }

    public void ChangeChannel(int channel){
        this.channel = channel;
    }

    public double CheckChannel(){
        return this.channel;
    }
}