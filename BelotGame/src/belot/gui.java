package belot;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.text.html.ImageView;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private Deck deck;
	private Cards card;
	//private ImageView activeImageView;
	private void initialize() {
		int currentWidth = 1920;
		int currentH = 800;
		deck = new Deck();
		frame = new JFrame();
		frame.setSize(currentWidth, currentH);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int firstX = (int)Math.round(currentWidth*0.2);
		int secondX = (int)Math.round(currentWidth*0.24);
		int thirdX = (int)Math.round(currentWidth*0.28);
		int fourthX = (int)Math.round(currentWidth*0.32);
		int fifthX = (int)Math.round(currentWidth*0.36);
		int sixthX = (int)Math.round(currentWidth*0.40);
		int seventhX = (int)Math.round(currentWidth*0.44);
		int eigthX = (int)Math.round(currentWidth*0.48);
		
		int y = (int)Math.round(currentWidth*0.01125);
		int w = (int)Math.round(currentWidth*0.2);
		int h = (int)Math.round(currentH*1.5);
		ArrayList<String> newDeckOfCards = deck.deckWithNames();
		Collections.shuffle(newDeckOfCards);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-1, 11, 50, 100);
		Image img = new ImageIcon(this.getClass().getResource("/backOfCardss.jpg")).getImage();
		frame.getContentPane().setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel firstCard = new JLabel("");
		firstCard.setBounds(firstX, y, w, h);
		frame.getContentPane().add(firstCard);
		
		JButton btnDealCards = new JButton("Раздаване");
		btnDealCards.setBounds(377, 144, 89, 23);
		frame.getContentPane().add(btnDealCards);
		
		JLabel secondCard = new JLabel("");
		secondCard.setBounds(secondX, y, w, h);
		frame.getContentPane().add(secondCard);
		
		JLabel thirdCard = new JLabel("");
		thirdCard.setBounds(thirdX, y, w, h);
		frame.getContentPane().add(thirdCard);
		
		JLabel fourthCard = new JLabel("");
		fourthCard.setBounds(fourthX, y, w, h);
		frame.getContentPane().add(fourthCard);
		
		JLabel fifthCard = new JLabel("");
		fifthCard.setBounds(fifthX, y, w, h);
		frame.getContentPane().add(fifthCard);
		
		JLabel sixthCard = new JLabel("");
		sixthCard.setBounds(sixthX, y, w, h);
		frame.getContentPane().add(sixthCard);
		
		JLabel seventhCard = new JLabel("");
		seventhCard.setBounds(seventhX, y, w, h);
		frame.getContentPane().add(seventhCard);
		
		JLabel eigthCard = new JLabel("");
		eigthCard.setBounds(eigthX, y, w, h);
		frame.getContentPane().add(eigthCard);
		
		Choice choice = new Choice();
		choice.setBounds(163, 79, 118, 20);
		frame.getContentPane().add(choice);
		choice.add("Пас");
		choice.add("Спатия");
		choice.add("Каро");
		choice.add("Пика");
		choice.add("Без коз");
		choice.add("Всичко коз");
		btnDealCards.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				ArrayList<String> card = newDeckOfCards;
				//System.out.println(card[0]);
				for(int i = 0; i < 5; i++)
				{
					//System.out.println(card.get(i));
				}
				//System.out.println("Тест" + card.get(2));
				//System.out.println(card[0]);
				//Image img = new ImageIcon(this.getClass().getResource("/" + card[0])).getImage();
				firstCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card.get(0))));
				secondCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card.get(1))));
				thirdCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card.get(2))));
				fourthCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card.get(3))));
				fifthCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card.get(4))));
				
				//System.out.println("peta kart" + card.get(5));
				System.out.println(card);
			}
			
			
		});
		for(int i = 0; i < 4; i++)
		{
			newDeckOfCards.remove(i);
		}
		System.out.println(newDeckOfCards.get(0));
		
		newDeckOfCards.trimToSize();
		choice.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//System.out.println(newDeckOfCards);
				for(int i = 0; i < 5; i++)
				{
					newDeckOfCards.remove(0);
					newDeckOfCards.trimToSize();
				}
				//newDeckOfCards.trimToSize();
				System.out.println(newDeckOfCards);
				if(e.getSource() == choice)
				{
					 if(!choice.getSelectedItem().equals("Пас")) 
					  { 
						 sixthCard.setIcon(new ImageIcon(this.getClass().getResource("/" + newDeckOfCards.get(0))));
						 seventhCard.setIcon(new ImageIcon(this.getClass().getResource("/" + newDeckOfCards.get(1))));
						 eigthCard.setIcon(new ImageIcon(this.getClass().getResource("/" + newDeckOfCards.get(2))));
					  }
				}
				
			}});
		 
	

	}
}
