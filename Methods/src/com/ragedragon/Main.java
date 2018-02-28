package com.ragedragon;

public class Main
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your Final Score Was : "+highScore+ "\n");

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your Final Score Was : "+highScore + "\n");

        // Create a method called displayHighScorePosition
        // It should a players name as a parameter, and 2nd parameter as a position in the high score table
        // You should display the players name along with a message like "manged to get into position" and the
        // position they got and a further message  "on the high score table"
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return data should be
        // 1 if the score is >= 1000
        // 2 if the score is >= 500 and < 1000
        // 3 if the score is >= 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400, and 50

        int highScorePosition = calculateHigScorePosition(1500);
        displayHighScore("Xavier",highScorePosition);

        highScorePosition = calculateHigScorePosition(900);
        displayHighScore("Xavatt",highScorePosition);

        highScorePosition = calculateHigScorePosition(400);
        displayHighScore("George",highScorePosition);

        highScorePosition = calculateHigScorePosition(50);
        displayHighScore("Arthur",highScorePosition);

        highScorePosition = calculateHigScorePosition(1000);
        displayHighScore("Eduardo",highScorePosition);

    }

    public static void displayHighScore(String name, int position)
    {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHigScorePosition(int playerScore)
    {
        if (playerScore >= 1000)
        {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000)
        {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }

    public static int calculateScore (boolean gameOver, int score, int levelComplete, int bonus)
    {
        if(gameOver)
        {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }
            return -1;
    }
}

