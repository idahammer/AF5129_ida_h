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
		textF2.setBounds(18, 97, 130, 26);
		contentPane.add(textF2);
		textF2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 179, 382, 66);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(160, 60, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(160, 97, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textF1.getText().isEmpty() || textF2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Tilføj mere information!!");}	
				else{ 
					String humanName = textF1.getText(); 					
					String dogName = textF2.getText(); 	
				    humanAdd.addBike(humanName + dogName); 		
					textArea.setText(humanAdd.getAllBikes());
			}
			}
		});
		btnNewButton_2.setBounds(160, 130, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblInformation = new JLabel("Information:");
		lblInformation.setBounds(18, 159, 84, 16);
		contentPane.add(lblInformation);
		
		JLabel lblHumansFindsDogs = new JLabel("Humans Finds Dogs");
		lblHumansFindsDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblHumansFindsDogs.setBounds(116, 22, 198, 26);
		contentPane.add(lblHumansFindsDogs);
	}

}
