package ElevensPackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
        
        public Deck(){
            top = 51;
                for (int s = 0; s <SUITS.length; s++){
                    for (int c =1; c < 14; c++){
                        cards.add(new Card(SUITS[s], c));
                    }
                }
        }
        
        public Card dealCard(){
            return cards.get(top);
        }
        
        public void shuffle(){
            Collections.shuffle(cards);
            top = 51;
        }      
        
   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}