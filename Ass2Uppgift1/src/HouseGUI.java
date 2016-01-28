import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JScrollPane;
import java.awt.Color;
public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	Random rand = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * 1.2
		 */
        House House1 = new House(2001,111);
        House House2 = new House(1990,254);
        House House3 = new House(1989,112);
        
       
        int House1Built = House1.getYearBuilt();
		int House2Built = House2.getYearBuilt();
		int House3Built = House3.getYearBuilt();
		
		int House1Size = House1.getSize();
		int House2Size = House2.getSize();
		int House3Size = House3.getSize();
		
		/**
		 * 1.3
		 */
		myHouses = new House[10];
		myHouses[0] = new House (1900,200);
		myHouses[1] = new House (1930,20);
		myHouses[2] = new House (1960,110);
		myHouses[3] = new House (1990,120);
		myHouses[4] = new House (1995,130);
		myHouses[5] = new House (1911,140);
		myHouses[6] = new House (1840,150);
		myHouses[7] = new House (1865,111);
		myHouses[8] = new House (1833,160);
		myHouses[9] = new House (1945,300);
		
		
		/**
		 * 1.4
		 */ArrayList<House> manyHouses;
			manyHouses = new ArrayList<House>();
			Random r = new Random();
			int minSize = 10;
			int maxSize = 1000;
			int minYear = 1800;
			int maxYear = 2015;
		
		// scrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 6, 414, 254);
		contentPane.add(scrollPane);
		
		//1.2 text
		JTextArea textArea = new JTextArea("Uppgift 1.2 " + '\n' + "Et hus bygget i " + House1Built + " som er " + House1Size + " Kvm " + '\n' + "Et hus bygget i " +House2Built + " som er " + House2Size + " Kvm " + '\n' + "Et hus bygget i " + House3Built + " som er " + House3Size + " Kvm " + " " + "\n");
		scrollPane.setViewportView(textArea);
		
		//1.3 text
		textArea.append('\n' + "Uppgift 1.3" + '\n');
		
		//1.3 for loop - looper gennem Array'en
		for(int i = 0; i < myHouses.length; i = i+1){
			textArea.append("Et hus bygget i " + myHouses[i].getYearBuilt() + " som er " + myHouses[i].getSize() + " Kvm " + "" + '\n');
		}
		
		//1.4 text
		textArea.append('\n' + "Uppgift 1.4" + "\n");
		
		//1.4 2 for loops random-udvælgelse
		for(int a = 0; a < 99; a = a + 1){
			manyHouses.add(new House(r.nextInt(maxYear - minYear) + minYear, r.nextInt(maxSize-minSize) + minSize));
		}
		for(int b = 0; b<manyHouses.size(); b = b+1){
			textArea.append("Et hus bygget i " + manyHouses.get(b).getYearBuilt() + " som er " +manyHouses.get(b).getSize() + " Kvm " + "\n");
		}
	}

}
