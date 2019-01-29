package com.company;

public class Main {

    public static void main(String[] args) {

        Washer washer = new Washer();

        System.out.println("Price:"+washer.CheckPrice());
        washer.ChangePrice(6999.99);
        System.out.println("Price:"+washer.CheckPrice());

        Television tv = new Television();

        System.out.println("Price:"+tv.CheckPrice());
        tv.ChangePrice(2500.99);
        System.out.println("Price:"+tv.CheckPrice());

        System.out.println("Price:"+tv.CheckChannel());
        tv.ChangeChannel(23);
        System.out.println("Price:"+tv.CheckChannel());
    }
}
