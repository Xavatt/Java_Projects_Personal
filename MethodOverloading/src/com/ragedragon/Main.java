package com.ragedragon;

public class Main
{
    public static void main(String[] args) {
        int newScore = calculateScore("Xavier", 500);
        System.out.println("New Score is " + newScore);

        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters < 0.0 )
        {
            System.out.println("Invalid parameters \n");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if ((feet <0) || ((inches < 0) || (inches >12)))
        {
            System.out.println("Invalid feet or inches parameters\n");
            return -1;
        }
        double centimiters = (feet * 12) * 2.54;
        centimiters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimiters + " cm");
        return centimiters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0)
        {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player : " + playerName + " Scored : " + score + "  points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println(" Unnamed Player Scored : " + score + "  points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No PLayer name, No Player Score\n");
        return 0;
    }

}
