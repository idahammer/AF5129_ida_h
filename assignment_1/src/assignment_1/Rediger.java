package assignment_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Rediger extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rediger frame = new Rediger();
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
	public Rediger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMedlemmer = new JLabel("Redigér Medlemmer");
		lblMedlemmer.setFont(new Font("Modern No. 20", Font.PLAIN, 23));
		lblMedlemmer.setForeground(Color.WHITE);
		lblMedlemmer.setBounds(120, 18, 191, 20);
		contentPane.add(lblMedlemmer);
		
		JLabel lblNavn = new JLabel("Navn");
		lblNavn.setForeground(Color.WHITE);
		lblNavn.setBounds(18, 68, 61, 16);
		contentPane.add(lblNavn);
		
		JLabel lblNewLabel = new JLabel("Personnummer");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(18, 96, 94, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(18, 149, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setBounds(18, 177, 61, 16);
		contentPane.add(lblAdresse);
		
		JLabel lblBillede = new JLabel("Billede");
		lblBillede.setForeground(Color.WHITE);
		lblBillede.setBounds(18, 211, 61, 16);
		contentPane.add(lblBillede);
		
		JButton btnGem = new JButton("GEM");
		btnGem.setBounds(314, 243, 117, 29);
		contentPane.add(btnGem);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setForeground(Color.WHITE);
		lblTelefon.setBounds(18, 121, 61, 16);
		contentPane.add(lblTelefon);
		
		textField = new JTextField();
		textField.setBounds(143, 63, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 91, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(143, 116, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(143, 144, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(143, 172, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(143, 206, 130, 26);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
