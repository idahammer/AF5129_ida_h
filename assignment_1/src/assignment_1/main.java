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
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Insets;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		
		JList list = new JList();
		list.setForeground(Color.BLACK);
		list.setBorder(new LineBorder(Color.LIGHT_GRAY, 3, true));
		list.setBackground(Color.WHITE);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Andersen, Birgitte", "Bendtsen, Hans", "Carlsen, Franz", "Danielsen, Bjarne", "Eriksen, Kristian", "Fedesen, Irena", "Gelly, Linda", "Hansen, Johanne", "Ingerslev, Jørgen", "Jensen, Birdie", "Kallesen, René"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(6, 62, 105, 187);
		contentPane.add(list);
		
		JButton btnUdskriv = new JButton("Udskriv");
		btnUdskriv.setForeground(Color.BLACK);
		btnUdskriv.setBackground(Color.WHITE);
		btnUdskriv.setBounds(0, 249, 117, 29);
		contentPane.add(btnUdskriv);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(1, 1, 1, 1));
		menuBar.setBounds(0, 0, 132, 22);
		contentPane.add(menuBar);
		
		JMenu mnMedlemmer = new JMenu("Medlemmer");
		menuBar.add(mnMedlemmer);
		
		JMenu mnNyeMedlemmer = new JMenu("Nye medlemmer");
		mnMedlemmer.add(mnNyeMedlemmer);
		
		JMenuItem mntmTilfj = new JMenuItem("Tilføj");
		mnNyeMedlemmer.add(mntmTilfj);
		
		JMenu mnEksisterendeMedlemmer = new JMenu("Eksisterende medlemmer");
		mnMedlemmer.add(mnEksisterendeMedlemmer);
		
		JMenuItem mntmRedigr = new JMenuItem("Redigér");
		mnEksisterendeMedlemmer.add(mntmRedigr);
		
		JLabel lblNewLabel = new JLabel("Navn:");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(123, 121, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Personnr:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(123, 149, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adresse:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(123, 177, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telf:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(123, 205, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(123, 233, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(187, 116, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 144, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(187, 172, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(187, 200, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(187, 228, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnGemndringer = new JButton("Gem Ændringer");
		btnGemndringer.setBounds(314, 243, 132, 29);
		contentPane.add(btnGemndringer);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(348, 89, 96, 137);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblFatFitness = new JLabel("Fat 2 Fitness");
		lblFatFitness.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		lblFatFitness.setForeground(Color.WHITE);
		lblFatFitness.setBounds(227, 6, 219, 44);
		contentPane.add(lblFatFitness);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}