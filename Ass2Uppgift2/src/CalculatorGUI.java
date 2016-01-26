import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;

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
		setBounds(100, 100, 220, 338);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setFont(new Font("Menlo", Font.PLAIN, 27));
		textField.setForeground(Color.GREEN);
		textField.setBackground(Color.BLACK);
		textField.setBounds(6, 23, 208, 73);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		btnNewButton.setBounds(6, 266, 52, 44);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button.setBounds(6, 220, 52, 44);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_1.setBounds(58, 220, 52, 44);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_2.setBounds(111, 220, 52, 44);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_3.setBounds(6, 177, 52, 44);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_4.setBounds(58, 177, 52, 44);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_5.setBounds(111, 177, 52, 44);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_6.setBounds(6, 136, 52, 44);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_7.setBounds(58, 136, 52, 44);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_8.setBounds(111, 136, 52, 44);
		contentPane.add(button_8);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("=");
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_10.setBounds(111, 266, 52, 44);
		contentPane.add(button_10);
		
		JButton button_9 = new JButton(",");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText (",");
			}
		});
		button_9.setBounds(58, 266, 52, 44);
		contentPane.add(button_9);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("+");
				myCalculator.plus();
			}
		});
		button_11.setBounds(164, 266, 51, 44);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("-");
				myCalculator.minus();
			}
		});
		button_12.setBounds(164, 220, 51, 44);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("*");
				myCalculator.mult();
			}
		});
		button_13.setBounds(164, 177, 51, 44);
		contentPane.add(button_13);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText ("Cleared");
				myCalculator.clear();
			}
		});
		btnC.setBounds(164, 136, 51, 44);
		contentPane.add(btnC);
	}
}
