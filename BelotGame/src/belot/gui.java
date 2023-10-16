package belot;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Choice;


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
		private void initialize() 
		{
		final int currentWidth = 1920;
		final int currentH = 800;
		ArrayList<String> firstPlayerDeck = new ArrayList<>();
		ArrayList<String> secondPlayerDeck = new ArrayList<>();
		ArrayList<String> thirdPlayerDeck = new ArrayList<>();
		ArrayList<String> fourthPlayerDeck = new ArrayList<>();
		ArrayList<JLabel> firstPlayerLabels = new ArrayList<>();
		
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		deck = new Deck();
		
		frame = new JFrame();
		frame.setSize(currentWidth, currentH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArrayList<String> newDeckOfCards = deck.deckWithNames();
		Collections.shuffle(newDeckOfCards);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-1, 11, 50, 100);
		Image img = new ImageIcon(this.getClass().getResource("/backOfCardss.jpg")).getImage();
		frame.getContentPane().setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDealCards = new JButton("Раздаване");
		btnDealCards.setBounds(300, 400, 89, 23);
		frame.getContentPane().add(btnDealCards);
		
		JButton btnComplete = new JButton("Ок");
		btnComplete.setBounds(377, 400, 99, 23);
		
		Choice choice = new Choice();
		choice.setBounds(163, 79, 118, 20);
		frame.getContentPane().add(choice);
		
		choice.add("");
		choice.add("Пас");
		choice.add("Спатия");
		choice.add("Каро");
		choice.add("Купа");
		choice.add("Пика");
		choice.add("Без коз");
		choice.add("Всичко коз");
		
		JLabel p1FirsCard = new JLabel("");
		p1FirsCard.setBounds(p1.cardX(0.20), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1FirsCard);
		
		JLabel p1SecondCard = new JLabel("");
		p1SecondCard.setBounds(p1.cardX(0.24), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1SecondCard);
		
		JLabel p1ThirdCard = new JLabel("");
		p1ThirdCard.setBounds(p1.cardX(0.28), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1ThirdCard);
		
		JLabel p1FourthCard = new JLabel("");
		p1FourthCard.setBounds(p1.cardX(0.32), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1FourthCard);
		
		JLabel p1FifthCard = new JLabel("");
		p1FifthCard.setBounds(p1.cardX(0.36), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1FifthCard);
		
		JLabel p1SixthCard = new JLabel("");
		p1SixthCard.setBounds(p1.cardX(0.40), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1SixthCard);
		
		JLabel p1SeventhCard = new JLabel("");
		p1SeventhCard.setBounds(p1.cardX(0.44), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1SeventhCard);
		
		JLabel p1EigthCard = new JLabel("");
		p1EigthCard.setBounds(p1.cardX(0.48), p1.cardY(0.28), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1EigthCard);
		
		JLabel p2FirstCard = new JLabel("");
		p2FirstCard.setBounds(p2.cardX(0.6), p2.cardY(0.28), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2FirstCard);
		
		JLabel p2SecondCard = new JLabel("");
		p2SecondCard.setBounds(p2.cardX(0.6), p2.cardY(0.24), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2SecondCard);
		
		JLabel p2ThirdCard = new JLabel("");
		p2ThirdCard.setBounds(p2.cardX(0.6), p2.cardY(0.20), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2ThirdCard);
		
		JLabel p2FourthCard = new JLabel("");
		p2FourthCard.setBounds(p2.cardX(0.6), p2.cardY(0.16), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2FourthCard);
		
		JLabel p2FifthCard = new JLabel("");
		p2FifthCard.setBounds(p2.cardX(0.6), p2.cardY(0.12), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2FifthCard);
		
		JLabel p2SixthCard = new JLabel("");
		p2SixthCard.setBounds(p2.cardX(0.6), p2.cardY(0.08), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2SixthCard);
		
		JLabel p2SeventhCard = new JLabel("");
		p2SeventhCard.setBounds(p2.cardX(0.6), p2.cardY(0.04), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2SeventhCard);
		
		JLabel p2EigthCard = new JLabel("");
		p2EigthCard.setBounds(p2.cardX(0.6), p2.cardY(0.00), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p2EigthCard);
		
		JLabel p3FirsCard = new JLabel("");
		p3FirsCard.setBounds(p3.cardX(0.20), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3FirsCard);
		
		JLabel p3SecondCard = new JLabel("");
		p3SecondCard.setBounds(p3.cardX(0.24), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3SecondCard);
		
		JLabel p3ThirdCard = new JLabel("");
		p3ThirdCard.setBounds(p3.cardX(0.28), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3ThirdCard);
		
		JLabel p3FourthCard = new JLabel("");
		p3FourthCard.setBounds(p3.cardX(0.32), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3FourthCard);
		
		JLabel p3FifthCard = new JLabel("");
		p3FifthCard.setBounds(p3.cardX(0.36), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3FifthCard);
		
		JLabel p3SixthCard = new JLabel("");
		p3SixthCard.setBounds(p3.cardX(0.40), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3SixthCard);
		
		JLabel p3SeventhCard = new JLabel("");
		p3SeventhCard.setBounds(p3.cardX(0.44), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3SeventhCard);
		
		JLabel p3EigthCard = new JLabel("");
		p3EigthCard.setBounds(p3.cardX(0.48), p3.cardY(0.01125), p3.cardW(0.2), p3.cardH(0.3));
		frame.getContentPane().add(p3EigthCard);
		
		JLabel p4FirstCard = new JLabel("");
		p4FirstCard.setBounds(p2.cardX(0.01), p2.cardY(0.28), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4FirstCard);
		
		JLabel p4SecondCard = new JLabel("");
		p4SecondCard.setBounds(p2.cardX(0.01), p2.cardY(0.24), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4SecondCard);
		
		JLabel p4ThirdCard = new JLabel("");
		p4ThirdCard.setBounds(p2.cardX(0.01), p2.cardY(0.20), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4ThirdCard);
		
		JLabel p4FourthCard = new JLabel("");
		p4FourthCard.setBounds(p2.cardX(0.01), p2.cardY(0.16), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4FourthCard);
		
		JLabel p4FifthCard = new JLabel("");
		p4FifthCard.setBounds(p2.cardX(0.01), p2.cardY(0.12), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4FifthCard);
		
		JLabel p4SixthCard = new JLabel("");
		p4SixthCard.setBounds(p2.cardX(0.01), p2.cardY(0.08), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4SixthCard);
		
		JLabel p4SeventhCard = new JLabel("");
		p4SeventhCard.setBounds(p2.cardX(0.01), p2.cardY(0.04), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4SeventhCard);
		
		JLabel p4EigthCard = new JLabel("");
		p4EigthCard.setBounds(p2.cardX(0.01), p2.cardY(0.00), p2.cardW(0.2), p2.cardH(0.2));
		frame.getContentPane().add(p4EigthCard);
		
		JLabel p1Cards = new JLabel("");
		p1Cards.setBounds(p1.cardX(0.28), p1.cardY(0.2), p1.cardW(0.2), p1.cardH(0.2));
		frame.getContentPane().add(p1Cards);
		
		JLabel p3Cards = new JLabel("");
		p3Cards.setBounds(p1.cardX(0.28), p1.cardY(0.01125), p1.cardW(0.2), p1.cardH(0.7));
		frame.getContentPane().add(p3Cards);
		
		btnDealCards.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				p1FirsCard.setIcon(p1.dealCard(newDeckOfCards, 0));
				String img = ((ImageIcon) p1FirsCard.getIcon()).getDescription();  //path to photo file:/C:/Users/kupat/git/BelotGame/BelotGame/bin/c8.png
				
				System.out.println(img);
				
				
				p1SecondCard.setIcon(p1.dealCard(newDeckOfCards, 1));
				p1ThirdCard.setIcon(p1.dealCard(newDeckOfCards, 2));
				p1FourthCard.setIcon(p1.dealCard(newDeckOfCards, 12));
				p1FifthCard.setIcon(p1.dealCard(newDeckOfCards, 13));
				
				firstPlayerDeck.add(newDeckOfCards.get(0));
				firstPlayerDeck.add(newDeckOfCards.get(1));
				firstPlayerDeck.add(newDeckOfCards.get(2));
				firstPlayerDeck.add(newDeckOfCards.get(12));
				firstPlayerDeck.add(newDeckOfCards.get(13));
				
				p2FirstCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 3));
				p2SecondCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 4));
				p2ThirdCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 5));
				p2FourthCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 14));
				p2FifthCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 15));
				
				secondPlayerDeck.add(newDeckOfCards.get(3));
				secondPlayerDeck.add(newDeckOfCards.get(4));
				secondPlayerDeck.add(newDeckOfCards.get(5));
				secondPlayerDeck.add(newDeckOfCards.get(14));
				secondPlayerDeck.add(newDeckOfCards.get(15));
				
				p3FirsCard.setIcon(p3.dealCard(newDeckOfCards, 6));
				p3SecondCard.setIcon(p3.dealCard(newDeckOfCards, 7));
				p3ThirdCard.setIcon(p3.dealCard(newDeckOfCards, 8));
				p3FourthCard.setIcon(p3.dealCard(newDeckOfCards, 16));
				p3FifthCard.setIcon(p3.dealCard(newDeckOfCards, 17));
				
				thirdPlayerDeck.add(newDeckOfCards.get(6));
				thirdPlayerDeck.add(newDeckOfCards.get(7));
				thirdPlayerDeck.add(newDeckOfCards.get(8));
				thirdPlayerDeck.add(newDeckOfCards.get(16));
				thirdPlayerDeck.add(newDeckOfCards.get(17));
				
				p4FirstCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 9));
				p4SecondCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 10));
				p4ThirdCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 11));
				p4FourthCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 18));
				p4FifthCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 19));
				
				fourthPlayerDeck.add(newDeckOfCards.get(9));
				fourthPlayerDeck.add(newDeckOfCards.get(10));
				fourthPlayerDeck.add(newDeckOfCards.get(11));
				fourthPlayerDeck.add(newDeckOfCards.get(18));
				fourthPlayerDeck.add(newDeckOfCards.get(19));
				
				btnDealCards.setVisible(false);
			}
			
			
		});
		
		choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				for(int i = 0; i < 20; i++)
				{
					newDeckOfCards.remove(0);
					newDeckOfCards.trimToSize();
				}
				frame.getContentPane().add(btnComplete);
				if(e.getSource() == choice)
				{
					//frame.getContentPane().add(btnComplete);
					btnComplete.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) 
						{
							if(!choice.getSelectedItem().equals("Пас")) 
							  { 
								 p1SixthCard.setIcon(p1.dealCard(newDeckOfCards, 0));
								 p1SeventhCard.setIcon(p1.dealCard(newDeckOfCards, 1));
								 p1EigthCard.setIcon(p1.dealCard(newDeckOfCards, 2));
								 
								 firstPlayerDeck.add(newDeckOfCards.get(0));
								 firstPlayerDeck.add(newDeckOfCards.get(1));
								 firstPlayerDeck.add(newDeckOfCards.get(2));
								 
								 p2SixthCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 3));
								 p2SeventhCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 4));
								 p2EigthCard.setIcon(p2.dealOpponentsCards(newDeckOfCards, p2, 5));
								 
								 secondPlayerDeck.add(newDeckOfCards.get(3));
								 secondPlayerDeck.add(newDeckOfCards.get(4));
								 secondPlayerDeck.add(newDeckOfCards.get(5));
								 
								 p3SixthCard.setIcon(p3.dealCard(newDeckOfCards, 6));
								 p3SeventhCard.setIcon(p3.dealCard(newDeckOfCards, 7));
								 p3EigthCard.setIcon(p3.dealCard(newDeckOfCards, 8));
								 
								 thirdPlayerDeck.add(newDeckOfCards.get(6));
								 thirdPlayerDeck.add(newDeckOfCards.get(7));
								 thirdPlayerDeck.add(newDeckOfCards.get(8));
								 
								 p4SixthCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 9));
								 p4SeventhCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 10));
								 p4EigthCard.setIcon(p4.dealOpponentsCards(newDeckOfCards, p4, 11));
								 
								 fourthPlayerDeck.add(newDeckOfCards.get(9));
								 fourthPlayerDeck.add(newDeckOfCards.get(10));
								 fourthPlayerDeck.add(newDeckOfCards.get(11));
							  }
							else
							{
								//second players gives call
							}
						}
						
					});
					
				}
				
			}});
	
			p3FirsCard.addMouseListener(new MouseAdapter()
			{
				@Override
	            public void mouseClicked(MouseEvent e) 
				{
					System.out.println(thirdPlayerDeck.get(0));
					p3Cards.setIcon(p1.dealCard(thirdPlayerDeck, 0));
					p3FirsCard.setIcon(null);
					
	            }
			});
			
			firstPlayerLabels.add(p1FirsCard);
			firstPlayerLabels.add(p1SecondCard);
			firstPlayerLabels.add(p1ThirdCard);
			firstPlayerLabels.add(p1FourthCard);
			firstPlayerLabels.add(p1FifthCard);
			firstPlayerLabels.add(p1SixthCard);
			firstPlayerLabels.add(p1SeventhCard);
			firstPlayerLabels.add(p1EigthCard);
			
			JButton btnStart = new JButton("Start");
			btnStart.setBounds(1271, 682, 89, 23);
			frame.getContentPane().add(btnStart);
			
			
			
			btnStart.addActionListener(new ActionListener() 
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					int [] thirdPlayerCards = p3.deckInNumbers(thirdPlayerDeck);
					int [] firstPlayerCards = p1.deckInNumbers(firstPlayerDeck);
					System.out.println("karta" + thirdPlayerCards[0]);
					for(int i = 0; i < thirdPlayerDeck.size(); i++)
					{
						System.out.println(firstPlayerCards[i]);
						if(firstPlayerCards[i] > thirdPlayerCards[0])
						{
							System.out.println("pechalba");
							int c = i;
							firstPlayerLabels.get(i).addMouseListener(new MouseAdapter() 
							{
								@Override
					            public void mouseClicked(MouseEvent e) 
								{
									System.out.println("Label is clicked");
									p1Cards.setIcon(p1.dealCard(firstPlayerDeck, c));
									firstPlayerLabels.get(c).setIcon(null);
					            }
							});
							
						}
					}
					
				}
				
			});
			
			
	
				//pravq edin spisyk s kartite na vseki igrach ArrayList p1Cards ArrayList p2Cards<String>
				//Pravq si klas kojto sydyrja vsichki terci ili metod i sravnqvam po imena na snimki naprimer 789 91J i tiq na pika
				//sa v edin metod i pravq if p1Cards.contains(terca()) i tova vryshta true ili false terca ako e true vika terca i taka
				//za otgovarqneto na boite kato cykne pyrviqt karta vzimam ot labela po sredata koq e kartata mu i chekvam dali sledvashtiq
				// igrach ima takava naprimer ako hvyrli spatiq chekvam if(p1Cards.contains(image ot c1 - c8)) ako da ako e koz dali moje 
				// da se kachi ako ne e koz i nqma spatiq dali moje da caka a ako ne e koz i ima si izbira edna ot vsichkite i taka za 
				// vsqka boq i za 50 i 100 i tiq raboti predi vsqka igra se puska proverkata za 50 100 kareta i terci
	}
}
