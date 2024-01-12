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
    private static long startTime = System.currentTimeMillis(); // Represents the start time of the game

    public static void setDeckSize(int size) 
     {
        deckSize = size;
     }

    public static void updateScore() 
    {
        score = 30 - (System.currentTimeMillis() - startTime) / 1000 > 5 ? (int) (30 - (System.currentTimeMillis() - startTime) / 1000) : 10; 
        startTime = System.currentTimeMillis();
    }
    
    public static int getScore() 
      {
        return score;
    }
}