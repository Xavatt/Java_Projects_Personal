package com.ragedragon;

public class Main
{
    public static void main(String[] args)
    {

        int switchValue = 1;

	    switch (switchValue)
        {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, or 4, or a 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;

        }

        // CHALLENGE
        char switchValueChar = 'F';
	    switch (switchValueChar)
        {
            case 'A':
                System.out.println("Value was: A");
                break;
            case 'B':
                System.out.println("Value was: B");
                break;
            case 'C':
                System.out.println("Value was: C");
                break;
            case 'D':
                System.out.println("Value was: D");
                break;
            case 'E':
                System.out.println("Value was: E");
                break;
             default:
                 System.out.println("Was not A,B,C,D or E");
                 System.out.println("Actually it was :" +switchValueChar);
                 break;
        }
    }
}
