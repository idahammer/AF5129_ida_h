package assignment_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;

public class Main extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		getContentPane().setBackground(UIManager.getColor("List.selectionInactiveForeground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel Overskrift = new JLabel("Fat 2 Fit fitness");
		Overskrift.setForeground(UIManager.getColor("List.background"));
		Overskrift.setFont(new Font("OCR A Std", Font.PLAIN, 30));
		Overskrift.setBounds(39, 6, 422, 98);
		getContentPane().add(Overskrift);
		
		JLabel mainpic = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/training-603981_640.jpg")).getImage();
		mainpic.setIcon(new ImageIcon(img))
		mainpic.setBounds(39, 75, 375, 185);
		getContentPane().add(mainpic);
	}
}
