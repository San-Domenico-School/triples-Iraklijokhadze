import greenfoot.*;
import java.util.ArrayList;

public class Dealer extends Actor 
{
    private Deck deck;
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    private int numCardsInDeck;
    private int triplesRemaining;
    private final int NUM_CARDS_IN_DECK = 81;
    
    public Dealer(int numCardsInDeck) 
    {
        this.numCardsInDeck = numCardsInDeck;
        this.triplesRemaining = numCardsInDeck / 3;
        this.deck = new Deck(numCardsInDeck);
        this.cardsSelected = new Card[3];
    }
    
    public void addedToWorld(World world)
    {
        dealBoard(world);
        setUI(world);
    }
    
    public void dealBoard(World world)
    {
         Greenfoot.playSound("shuffle.wav");
        for (int y = 45; y <= 450; y +=90) 
        {
            for (int x = 80; x <= 350; x +=135) 
            {
                getWorld().addObject(deck.getTopCard(), x, y);
            }
        }
    }

    
    public void setUI(World world)
    {
        Integer score = Scorekeeper.getScore();
        Integer numCardsRemaining = numCardsInDeck;
        getWorld().showText(score.toString(), 312, 505);
        getWorld().showText(numCardsRemaining.toString(), 312, 470);
    }

    
    public void endGame()
    {
        //
    }

    
    public void checkIfTriple()
    {
        //
    }

    
    public void actionIfTriple()
    {
        //
    }

    
    public void setCardsSelected(ArrayList<Card> cards, ArrayList<Integer> indices, Card[] selected)
    {
        //
    }
    
    
}