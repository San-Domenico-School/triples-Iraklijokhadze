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
        deckSize = 27;
     }

    public static void updateScore() 
    {
        score = 123; 
        System.out.println(30 - (System.currentTimeMillis()- startTime / 1000) > 5 ? (30 - (System.currentTimeMillis()- startTime / 1000)) : 5);
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
    

 
