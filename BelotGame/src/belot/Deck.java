package belot;

import java.util.ArrayList;


public class Deck 
{
	private ArrayList<Cards> deck = new ArrayList<>();

	public Deck(ArrayList<Cards> deck) {
		super();
		this.deck = deck;
	}
	
	public Deck()
	{
		ArrayList<String> suits = Cards.getValidSuits();
		ArrayList<String> faceNames = Cards.getValidCards();
		for(String suit : suits)
		{
			for(String faceName: faceNames)
			{
				deck.add(new Cards(faceName, suit));
			}
		}
				
	}

	public Cards dealCard()
	{
		if(deck.size() > 0)
		{
			return deck.remove(0);
		}
		else
			return null;
	}
	
	public String[] deckWithNames()
	{
		String[] name = new String[32];
		for(int i = 0; i < 32; i++)
		{
			name[i] = ("c" + (i + 1) + ".png");
		}		
		return name;
	}
	
	
	public ArrayList<Cards> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Cards> deck) {
		this.deck = deck;
	}
}
