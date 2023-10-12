package belot;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.text.html.ImageView;
import javax.swing.JButton;
import javax.swing.JToolBar;

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
		deck = new Deck();
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/backOfCardss.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(-1, 0, 512, 111);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel firstCard = new JLabel("");
		firstCard.setBounds(35, 216, 72, 120);
		frame.getContentPane().add(firstCard);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(377, 144, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel secondCard = new JLabel("");
		secondCard.setBounds(131, 216, 78, 120);
		frame.getContentPane().add(secondCard);
		
		JLabel thirdCard = new JLabel("");
		thirdCard.setBounds(235, 216, 78, 120);
		frame.getContentPane().add(thirdCard);
		
		JLabel fourthCard = new JLabel("");
		fourthCard.setBounds(333, 216, 78, 120);
		frame.getContentPane().add(fourthCard);
		
		JLabel fifthCard = new JLabel("");
		fifthCard.setBounds(421, 216, 78, 120);
		frame.getContentPane().add(fifthCard);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{	
				String [] card = deck.deckWithNames();
				System.out.println(card[0]);
				card = deck.shuffleDeck(card);
				for(int i = 0; i < 5; i++)
				{
					System.out.println(card[i]);
				}
				System.out.println(card[0]);
				//System.out.println(card[0]);
				//Image img = new ImageIcon(this.getClass().getResource("/" + card[0])).getImage();
				firstCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card[0])));
				secondCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card[1])));
				thirdCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card[2])));
				fourthCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card[3])));
				fifthCard.setIcon(new ImageIcon(this.getClass().getResource("/" + card[4])));
			}
			
		});
	

	}
}
