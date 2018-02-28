package com.ragedragon;

public class Main
{
    public static void main(String[] args)
    {
	    int result = 1 + 2;
        System.out.println("1 + 2 = "+result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = "+result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = "+result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = "+result);

        previousResult = result;
        result = result % 3;

        System.out.println(previousResult + " % 3 = "+result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now = "+result);
        result++;
        System.out.println("Result is now = "+result);
        result--;
        System.out.println("Result is now = "+result);

        result += 2;
        System.out.println("Result is now = "+result);

        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("No es un Alien! \n");
        }
        int topScore = 80;
        if (topScore < 100)
        {
            System.out.println("Has Obtenido El Puntaje Más Alto");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore <100))
        {
            System.out.println("Greater than the second top score and less than 100\n");
        }

        if ((topScore >90) || (secondTopScore <= 90))
        {
            System.out.println("One of these test is true\n");
        }

        int newVaue = 50;
        if(newVaue == 50)
        {
            System.out.println("This is true\n");
        }

        boolean isCar = false;
        if(isCar == true)
        {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }

        // 1. Create a double variable with the value '20'
        // 2. Create a second variable of type double with the value '80'
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if"  statement that displays a message "Total was over the limit"
        //     if the remaining total (#4) is equal to 20 or less

        double firstVariable = 20;
        double secondVariable = 80;
        double sumVariables = (firstVariable + secondVariable) * 25;

        double remainderValue = sumVariables % 40;

        if(remainderValue <= 20)
        {
            System.out.println("Total was over the limit");
        }
    }
}
