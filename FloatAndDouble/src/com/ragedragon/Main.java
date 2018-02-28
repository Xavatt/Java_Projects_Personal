package com.ragedragon;

public class Main
{
    public static void main(String[] args)
    {
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5.25;
        System.out.println("My Int Value = "+myIntValue);
        System.out.println("My Float Value = "+myFloatValue);
        System.out.println("My Double Value = "+myDoubleValue);

        // Convert given number of ponds to Kilograms
        // 1. Create a variable to store a the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store un a variable
        // 3. Print out the results
        //
        // NOTES: 1 pound is equal to 0.45359237 Kilograms

        double numPound = 200d;
        double convertedKlograms = numPound * 0.45359237d;
        System.out.println("Kilograms = "+convertedKlograms);
    }
}
