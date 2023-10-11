package belot;

public class Cards 
{
	private String faceName, suit;

	public String getFaceName() {
		return faceName;
	}

	public void setFaceName(String faceName) {
		this.faceName = faceName;
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
