import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
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
	public MainGui() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAssTest = new JButton("ASS 7 TEST");
		btnAssTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController px = PixelController.getInstance(Screen.ASSIGNMENT_7);
				for(int x=1; x < 300; x++ ){
					px.setPixel(10+x, 10+x, Color.YELLOW);
					px.setPixel(11+x, 11+x, Color.GREEN);
					px.setPixel(12+x, 12+x, Color.BLUE);
					px.setPixel(13+x, 13+x, Color.PINK);
					}
					}
		});
		btnAssTest.setBounds(6, 6, 117, 29);
		contentPane.add(btnAssTest);
		
		JButton btnMedea = new JButton("MEDEA_1");
		btnMedea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController px1 = PixelController.getInstance(Screen.MEDEA_1);
				for(int x=10; x < 300; x++ ){
					px1.setPixel(10+x, 10+x, Color.YELLOW);
					px1.setPixel(11+x, 11+x, Color.GREEN);
					px1.setPixel(12+x, 12+x, Color.BLUE);
					px1.setPixel(13+x, 13+x, Color.PINK);
					}
					}
		});
		btnMedea.setBounds(124, 6, 117, 29);
		contentPane.add(btnMedea);
		
		JButton btnMedea_1 = new JButton("MEDEA_2");
		btnMedea_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController px2 = PixelController.getInstance(Screen.MEDEA_2);
				for(int x=10; x < 300; x++ ){
					px2.setPixel(10+x, 10+x, Color.YELLOW);
					px2.setPixel(11+x, 11+x, Color.GREEN);
					px2.setPixel(12+x, 12+x, Color.BLUE);
					px2.setPixel(13+x, 13+x, Color.PINK);
					}
					}
		});
		
		btnMedea_1.setBounds(246, 6, 117, 29);
		contentPane.add(btnMedea_1);
		
		JButton btnMedea_2 = new JButton("MEDEA_3");
		btnMedea_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController px3 = PixelController.getInstance(Screen.MEDEA_3);
				for(int x=10; x < 300; x++ ){
					px3.setPixel(10+x, 10+x, Color.YELLOW);
					px3.setPixel(11+x, 11+x, Color.GREEN);
					px3.setPixel(12+x, 12+x, Color.BLUE);
					px3.setPixel(13+x, 13+x, Color.PINK);
					}
					}
		});
		
		btnMedea_2.setBounds(6, 47, 117, 29);
		contentPane.add(btnMedea_2);
		
		JButton btnMedea_3 = new JButton("FLOOR_5");
		btnMedea_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController px4 = PixelController.getInstance(Screen.FLOOR_5);
				for(int x=10; x < 300; x++ ){
					px4.setPixel(10+x, 10+x, Color.YELLOW);
					px4.setPixel(11+x, 11+x, Color.GREEN);
					px4.setPixel(12+x, 12+x, Color.BLUE);
					px4.setPixel(13+x, 13+x, Color.PINK);
					}
					}
		});
		
		btnMedea_3.setBounds(124, 47, 117, 29);
		contentPane.add(btnMedea_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/idahammeringerslev/Desktop/AF5129_ida_h/A7_Ida_I/img/YouDidn'tSayTheMagicWord.gif"));
		lblNewLabel.setBounds(134, 76, 293, 196);
		contentPane.add(lblNewLabel);
		
		try {
			Thread.sleep(2000);
			System.out.println("Forbinder...");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}