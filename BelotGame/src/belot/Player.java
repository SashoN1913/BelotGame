package belot;

import javax.swing.JLabel;

public class Player 
{
	final int screenWidth = 1920;
	final int screenH = 800;
	private int x;
	private int y;
	private int w;
	private int h;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	public int cardX(double value)
	{
		return (int)Math.round(screenWidth*value);
	}
	
	public int cardY(double value)
	{
		return (int)Math.round(screenWidth*value);
	}
	
	public int cardW(double value)
	{
		return (int)Math.round(screenWidth*value);
	}
	
	public int cardH(double value)
	{
		return (int)Math.round(screenH*value);
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
}
