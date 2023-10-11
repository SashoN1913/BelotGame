package belot;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards 
{
	private String faceName, suit;
	private Image img;
	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public String getFaceName() {
		return faceName;
	}
	
	public static  ArrayList<String> getValidSuits()
	{
		ArrayList<String> arr = new ArrayList <String> ();
		arr.add("spades");
		arr.add("clubs");
		arr.add("hearts");
		arr.add("diamonds");
		return arr;
	}
	
	public static ArrayList<String> getValidCards() {
		ArrayList<String> arr = new ArrayList <String> ();
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

	
	public void setFaceName(String faceName) 
	{
		ArrayList<String> validCard = getValidCards();
		faceName = faceName.toLowerCase();
		if(validCard.contains(faceName))
		{
			this.faceName = faceName;
		}
	}

	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) 
	{
		ArrayList<String> validSuit = getValidSuits();
		suit = suit.toLowerCase();
		if(validSuit.contains(suit))
				this.suit = suit;
	}

	public Cards(String faceName, String suit) {
		super();
		setFaceName(faceName);
		setSuit(suit);
	}
	
	@Override
	public String toString() {
		return String.format("%s of %s", faceName, suit);
	}
	
}
