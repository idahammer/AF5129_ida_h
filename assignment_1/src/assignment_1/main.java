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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Fat 2 fit fitness");
		heading.setFont(new Font("Modern No. 20", Font.PLAIN, 38));
		heading.setForeground(Color.WHITE);
		heading.setBounds(110, 0, 244, 60);
		contentPane.add(heading);
		
		JButton btnArkiv = new JButton("ARKIV");
		btnArkiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnArkiv.setBackground(Color.WHITE);
		btnArkiv.setBounds(16, 89, 117, 29);
		contentPane.add(btnArkiv);
		
		JButton btnMedlemmer = new JButton("MEDLEMMER");
		btnMedlemmer.setBackground(Color.WHITE);
		btnMedlemmer.setBounds(168, 89, 117, 29);
		contentPane.add(btnMedlemmer);
		
		JButton btnHjlp = new JButton("HJÆLP");
		btnHjlp.setBackground(Color.WHITE);
		btnHjlp.setBounds(316, 89, 117, 29);
		contentPane.add(btnHjlp);
		
		JLabel lblInternt = new JLabel("- Internt");
		lblInternt.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		lblInternt.setForeground(Color.WHITE);
		lblInternt.setBounds(168, 49, 169, 22);
		contentPane.add(lblInternt);
	}
}
