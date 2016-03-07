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


public class GUI extends JFrame {
	ImageIcon img = new ImageIcon("img/YouDidn'tSayTheMagicWord.gif");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAssTest = new JButton("ASS 7 TEST");
		btnAssTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController pix = PixelController.getInstance(Screen.ASSIGNMENT_7);
				
				while (!pix.isConnected()){
					try {
					Thread.sleep(2000);
					System.out.println("Tilslutter..");
					} catch (InterruptedException d) {
					d.printStackTrace();
					} 
					}

					if(pix.isConnected()){
						for(int x=1; x < 100; x++ ){
							// draw rainbow
							pix.setPixel(10+x, 10+x, Color.YELLOW);
							pix.setPixel(11+x, 11+x, Color.GREEN);
							pix.setPixel(12+x, 12+x, Color.BLUE);
							pix.setPixel(13+x, 13+x, Color.PINK);
						}
					}
					}
		});
		btnAssTest.setBounds(6, 6, 117, 29);
		contentPane.add(btnAssTest);
		
		JButton btnMedea = new JButton("MEDEA_1");
		btnMedea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController pix = PixelController.getInstance(Screen.MEDEA_1);
				//test connection
				while (!pix.isConnected()){
					try {
					Thread.sleep(2000);
					System.out.println("Tilslutter..");
					} catch (InterruptedException d) {
					d.printStackTrace();
					} 
					}

					if(pix.isConnected()){
						for(int x=1; x < 100; x++ ){
							// draw rainbow
							pix.setPixel(10+x, 10+x, Color.YELLOW);
							pix.setPixel(11+x, 11+x, Color.GREEN);
							pix.setPixel(12+x, 12+x, Color.BLUE);
							pix.setPixel(13+x, 13+x, Color.PINK);
						}

					}
					}
		});
		btnMedea.setBounds(124, 6, 117, 29);
		contentPane.add(btnMedea);
		
		JButton btnMedea_1 = new JButton("MEDEA_2");
		btnMedea_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController pix = PixelController.getInstance(Screen.MEDEA_2);
				//test connection
				while (!pix.isConnected()){
					try {
					Thread.sleep(2000);
					System.out.println("Tilslutter..");
					} catch (InterruptedException d) {
					d.printStackTrace();
					} 
					}

					if(pix.isConnected()){
						for(int x=1; x < 100; x++ ){
							// draw rainbow
							pix.setPixel(10+x, 10+x, Color.YELLOW);
							pix.setPixel(11+x, 11+x, Color.GREEN);
							pix.setPixel(12+x, 12+x, Color.BLUE);
							pix.setPixel(13+x, 13+x, Color.PINK);
						}

					
					}
					}
		});
		
		btnMedea_1.setBounds(246, 6, 117, 29);
		contentPane.add(btnMedea_1);
		
		JButton btnMedea_2 = new JButton("MEDEA_3");
		btnMedea_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController pix = PixelController.getInstance(Screen.MEDEA_3);
				//test connection
				while (!pix.isConnected()){
					try {
					Thread.sleep(2000);
					System.out.println("Tilslutter..");
					} catch (InterruptedException d) {
					d.printStackTrace();
					} 
					}

					if(pix.isConnected()){
						for(int x=1; x < 100; x++ ){
							// draw rainbow
							pix.setPixel(10+x, 10+x, Color.YELLOW);
							pix.setPixel(11+x, 11+x, Color.GREEN);
							pix.setPixel(12+x, 12+x, Color.BLUE);
							pix.setPixel(13+x, 13+x, Color.PINK);
						}
					}
					}
		});
		
		btnMedea_2.setBounds(6, 47, 117, 29);
		contentPane.add(btnMedea_2);
		
		JButton btnMedea_3 = new JButton("FLOOR_5");
		btnMedea_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PixelController pix = PixelController.getInstance(Screen.FLOOR_5);
				//test connection
				while (!pix.isConnected()){
				try {
				Thread.sleep(2000);
				System.out.println("Tilslutter..");
				} catch (InterruptedException d) {
				d.printStackTrace();
				} 
				}

				if(pix.isConnected()){
					for(int x=1; x < 100; x++ ){
						// draw rainbow
						pix.setPixel(10+x, 10+x, Color.YELLOW);
						pix.setPixel(11+x, 11+x, Color.GREEN);
						pix.setPixel(12+x, 12+x, Color.BLUE);
						pix.setPixel(13+x, 13+x, Color.PINK);
					}
				
					}
					}
		});
		
		btnMedea_3.setBounds(124, 47, 117, 29);
		contentPane.add(btnMedea_3);
		
		JLabel lblNewLabel = new JLabel(img);
		lblNewLabel.setIcon(new ImageIcon("/Users/idahammeringerslev/Desktop/AF5129_ida_h/A7_Ida_I/img/YouDidn'tSayTheMagicWord.gif"));
		lblNewLabel.setBounds(134, 76, 293, 196);
		contentPane.add(lblNewLabel);
		
	
	}


}
