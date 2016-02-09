import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textF1;
	private JTextField textF2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanGUI frame = new HumanGUI();
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
	public HumanGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(21, 54, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 92, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(158, 54, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(158, 92, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_2 = new JButton("Print info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textF1.getText().isEmpty() || textF2.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Tilføj mere information!!");}
				else{ 		
					textArea.setText(); 
				}
			}
		});
		btnNewButton_2.setBounds(158, 133, 117, 29);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 174, 387, 50);
		contentPane.add(scrollPane);
		
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setBounds(21, 157, 86, 16);
		contentPane.add(lblInformation);
		
		JLabel lblHumanAndDogs = new JLabel("Humans and Dogs");
		lblHumanAndDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblHumanAndDogs.setBounds(127, 0, 209, 36);
		contentPane.add(lblHumanAndDogs);
	}
}
