package com.ragedragon;

public class Main
{

    public static void main(String[] args)
    {
        // Int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = "+ myTotal);

        // byte has a width of 8
        byte myByteValue = 10;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("MyNewByteValue = "+myNewByteValue);

        // short has a width of 16
        short myShortValue = 30000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("MyNewShortValue = "+ myNewShortValue);

        // Int has a width of 64
        long myLongValue = 100L;
    }
}
