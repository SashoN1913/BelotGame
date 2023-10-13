package belot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


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
	
	public ArrayList<String> deckWithNames()
	{
		ArrayList<String> name = new ArrayList<String>(32);
		for(int i = 0; i < 32; i++)
		{
			name.add(i, "c" + (i + 1) + ".png");
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
