package com.ragedragon;

public class Main
{

    public static void main(String[] args)
    {
        Car porsche = new Car();
        Car sonic = new Car();

        porsche.setModel("911");
        System.out.println("Model is: "+ porsche.getModel());

        sonic.setModel("9134");
        System.out.println("Model is: "+ porsche.getModel());
    }
}
