import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textF1;
	private JTextField textF2;
	private Human humanAdd;
	private Dog dogAdd;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogGUI frame = new HumanDogGUI();
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
	public HumanDogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textF1 = new JTextField();
		textF1.setBounds(18, 60, 130, 26);
		contentPane.add(textF1);
		textF1.setColumns(10);
		
		textF2 = new JTextField();
		textF2.setBounds(18, 93, 130, 26);
		contentPane.add(textF2);
		textF2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 179, 382, 66);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Add Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			/*Check the name length*/
				if(textF1.getText().length() >= 3){
			/* add it to the human string */		
					humanAdd = new Human(textF1.getText());
					JOptionPane.showMessageDialog(null, "Human has been added! Have you added a dog?");}
			else if(textF1.getText().length() < 3){
				JOptionPane.showMessageDialog(null, "Thats just stupid! Humans have a least 3 letters in their names!!");}
			
			}
		});
		btnNewButton.setBounds(160, 60, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textF1.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Dog needs human!!");}
			else if(textF2.getText().length() >= 2){
			/* Dog added to Human*/	
				humanAdd.buyDog(new Dog(textF2.getText()));
					JOptionPane.showMessageDialog(null, "Human has a dog! Go on, print the info!");}
			else if(textF2.getText().length()< 2){
				JOptionPane.showMessageDialog(null, "Is that a dog? No No, it has got to have at least two letters!!");}
			}
		});
		btnNewButton_1.setBounds(160, 93, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textF1.getText().length() >= 3){
			/*Humanadd is added to getinfo()*/			
					 textArea.append(humanAdd.getInfo() + "\n");
						} 
				 else if(textF1.getText().isEmpty()){
					 JOptionPane.showMessageDialog(null, "You cannot create a dog without an owner!!");} 
			}
		});
		btnNewButton_2.setBounds(160, 127, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblInformation = new JLabel("Information:");
		lblInformation.setBounds(18, 159, 84, 16);
		contentPane.add(lblInformation);
		
		JLabel lblHumansFindsDogs = new JLabel("Humans Find Dogs");
		lblHumansFindsDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblHumansFindsDogs.setBounds(116, 22, 198, 26);
		contentPane.add(lblHumansFindsDogs);
	}

}
