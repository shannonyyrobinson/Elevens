package ElevensPackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

        private String suit;
        private int face;
        
        public Card(){
            suit = "DIAMONDS";
            face = 0;
        }

  	public Card( String s, int f){
            suit = s;
            face = f;
        }
        
        public void setSuit(String s){
            suit = s;
        }
        
        public void setFace(int f){
            face = f;
        }
        
        public int getFace(){
            return face;
        }
        
        public String getSuit(){
            return suit;
        }
        
        public String toString(){
            return FACES[face] + " of " + suit;
        }
 }