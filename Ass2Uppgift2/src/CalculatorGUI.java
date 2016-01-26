import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(25, 28, 397, 55);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("0");
			}
		});
		btnNewButton.setBounds(6, 243, 45, 29);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("1");
			}
		});
		button.setBounds(6, 202, 52, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("2");
			}
		});
		button_1.setBounds(58, 202, 52, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("3");
			}
		});
		button_2.setBounds(111, 202, 45, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("4");
			}
		});
		button_3.setBounds(6, 168, 63, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("5");
			}
		});
		button_4.setBounds(68, 168, 52, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("6");
			}
		});
		button_5.setBounds(119, 168, 45, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("7");
			}
		});
		button_6.setBounds(6, 133, 52, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("8");
			}
		});
		button_7.setBounds(57, 133, 63, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("9");
			}
		});
		button_8.setBounds(121, 133, 45, 29);
		contentPane.add(button_8);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("=");
			}
		});
		button_10.setBounds(121, 243, 45, 29);
		contentPane.add(button_10);
		
		JButton button_9 = new JButton(",");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText (",");
			}
		});
		button_9.setBounds(68, 243, 50, 29);
		contentPane.add(button_9);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("+");
			}
		});
		button_11.setBounds(162, 243, 45, 29);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("-");
			}
		});
		button_12.setBounds(168, 202, 45, 29);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("*");
			}
		});
		button_13.setBounds(164, 168, 63, 29);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("/");
			}
		});
		button_14.setBounds(162, 133, 52, 29);
		contentPane.add(button_14);
	}
}
