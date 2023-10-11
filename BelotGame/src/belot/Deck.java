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
}
