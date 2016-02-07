import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class BikeGUI extends JFrame {
	
	
	/** Instance variables */
	private JPanel contentPane;
	private JTextField textF1;
	private JTextField textF2;
	private JTextField textF3;
	private BikeStore bikeAdd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BikeGUI() {
		bikeAdd = new BikeStore();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		textF1 = new JTextField();
		textF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textF1.setBounds(16, 68, 87, 26);
		contentPane.add(textF1);
		textF1.setColumns(10);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 131, 343, 128);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnAddToList = new JButton("Add to list");
		btnAddToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
/** If any of the textFileds don't have any value, write message:*/
				if(textF1.getText().isEmpty() || textF2.getText().isEmpty() || textF3.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Tilføj mere information!!");}	
/** Else, bring all of the values to the textArea, and add them to the ArrayList getAllBikes() */
				else{ 
				String theColor = textF1.getText(); 					
				int theSize = Integer.parseInt(textF2.getText()); 
				int thePrice = Integer.parseInt(textF3.getText()); 		
			    bikeAdd.addBike(theColor, theSize, thePrice); 		
				textArea.setText(bikeAdd.getAllBikes()); 
			}
		}
		});
		
		btnAddToList.setBounds(232, 96, 127, 29);
		contentPane.add(btnAddToList);
		
		JLabel lblMyBikeshop = new JLabel("MY BIKESHOP");
		lblMyBikeshop.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMyBikeshop.setBounds(112, 6, 153, 26);
		contentPane.add(lblMyBikeshop);
		
		textF2 = new JTextField();
		textF2.setBounds(115, 68, 117, 26);
		contentPane.add(textF2);
		textF2.setColumns(10);
		
		textF3 = new JTextField();
		textF3.setBounds(244, 68, 114, 26);
		contentPane.add(textF3);
		textF3.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(16, 47, 61, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(122, 47, 61, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(249, 47, 61, 16);
		contentPane.add(lblPrice);
		
	
	}

}
