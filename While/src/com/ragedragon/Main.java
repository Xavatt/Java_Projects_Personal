package com.ragedragon;

public class Main
{

    public static void main(String[] args)
    {
	    int count =6;

	    /*while (count != 6)
        {
            System.out.println("Count Value is : "+ count);
            count++;
        }
        System.out.println("\n");
*/
   /*     count =1;
	    while(true)
        {
            if (count ==6)
            {
                break;
            }
            System.out.println("Count Value is : " + count);
            count++;
        }*/

        count = 6;
        do
        {
            System.out.println("Count Value is: "+count);
            count++;

            if( count >100)
            {
                break;
            }
        } while(count != 6);

    }
}
