/**
 * Write a description of class Scorekeeper here.
 * 
 * @author Ika Jokhadze 
 * @version January 11, 2023 
 */
public class Scorekeeper  
{
    private static int deckSize;   // Represents the size of the deck
    private static int score;      // Represents the player's score
    private static long startTime; // Represents the start time of the game

    public static void setDeckSize(int size) 
     {
        deckSize = size;
     }

    public static void updateScore() 
    {
        long elapsedTime = System.currentTimeMillis() - startTime; // Calculate time elapsed
        int speedFactor = 1000; 
        int scoreIncrease = speedFactor / (int) elapsedTime; // Example formula for scoring
        
        score += scoreIncrease; // Increase the score based on the calculated score increase
    }
    
    public static int getScore() 
      {
        return score;
    }

    public static void setStartTime() 
    {
         startTime = System.currentTimeMillis();
    }
}
    

 
