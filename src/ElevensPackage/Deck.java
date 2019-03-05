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
                for (String s: SUITS){
                    for (int c = 1; c < 14; c++){
                        cards.add( new BlackJackCard(s, c));
                    }
                }
        }
        
        public Card dealCard(){
            Card t = cards.get(top);
            top--;
            return t;
        }
        
        public void shuffle(){
            Collections.shuffle(cards);
            top = 51;
        }      
}