package belot;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
	
	public ImageIcon dealCard(ArrayList<String> newDeckOfCards, int i)
	{
		return new ImageIcon(this.getClass().getResource("/" + newDeckOfCards.get(i)));
	}
	public static BufferedImage rotateClockwise90(BufferedImage src) {
	    int w = src.getWidth();
	    int h = src.getHeight();
	    BufferedImage dest = new BufferedImage(h, w, src.getType());
	    for (int y = 0; y < h; y++) 
	        for (int x = 0; x < w; x++) 
	            dest.setRGB(y, w - x - 1, src.getRGB(x, y));
	    return dest;
	}
	
	  public static BufferedImage urlToImage(String string) {
	        BufferedImage image;
	        try {
	            image = ImageIO.read(new File(string));
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to read image from URL: " + string, e);
	        }
	        return image;
	    }
	
	public ImageIcon dealOpponentsCards(ArrayList<String> newDeckOfCards, Player p1, int i)
	{
		BufferedImage img = urlToImage("C:\\Users\\kupat\\git\\BelotGame\\BelotGame\\images\\" + newDeckOfCards.get(i));
		img = p1.rotateClockwise90(img);
		ImageIcon im = new ImageIcon(img);
		return im;
	}
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
}
