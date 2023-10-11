package belot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards 
{
	private String faceName, suit;

	public String getFaceName() {
		return faceName;
	}

	public void setFaceName(String faceName) 
	{
		List<String> validCard = getValidCards();
		this.faceName = faceName;
	}

	private ArrayList<String> getValidCards() {
		ArrayList<String> arr = new ArrayList <String> ();
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		arr.add("6");
		arr.add("7");
		arr.add("8");
		arr.add("9");
		arr.add("10");
		arr.add("11");
		arr.add("jack");
		arr.add("queen");
		arr.add("king");
		arr.add("ace");
		return arr;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public Cards(String faceName, String suit) {
		super();
		this.faceName = faceName;
		this.suit = suit;
	}
	
	 
	
}
