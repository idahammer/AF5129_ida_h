import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GymGUI extends JFrame {

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
					GymGUI frame = new GymGUI();
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
	public GymGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 343);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 102, 118, 177);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Andersen, Lene", "Bramsen, Arne", "Callesen, Lotte", "Deniss, Bente", "Eik, Lars", "Fonda, Niller", "Goldmann, Britta", "Hoff, David", "Ingerslev, Bodil", "Jolle, Bolle", "Karlsen, Marie", "Lebsos, Connie"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnUdskriv = new JButton("Udskriv");
		btnUdskriv.setBounds(16, 286, 95, 29);
		contentPane.add(btnUdskriv);
		
		JLabel lblFatFitness = new JLabel("FAT 2 FITNESS");
		lblFatFitness.setFont(new Font("Monospaced", Font.PLAIN, 40));
		lblFatFitness.setForeground(Color.WHITE);
		lblFatFitness.setBounds(91, 6, 331, 61);
		contentPane.add(lblFatFitness);
		
		JLabel lblNavn = new JLabel("Navn:");
		lblNavn.setForeground(Color.WHITE);
		lblNavn.setBounds(155, 149, 61, 16);
		contentPane.add(lblNavn);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setForeground(Color.WHITE);
		lblPersonnr.setBounds(155, 177, 61, 16);
		contentPane.add(lblPersonnr);
		
		JLabel lblAdresse = new JLabel("Adresse:");
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setBounds(155, 205, 61, 16);
		contentPane.add(lblAdresse);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(155, 235, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblBillede = new JLabel("Billede:");
		lblBillede.setForeground(Color.WHITE);
		lblBillede.setBounds(155, 263, 61, 16);
		contentPane.add(lblBillede);
		
		textField = new JTextField();
		textField.setBounds(220, 172, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 144, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 200, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(220, 230, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(220, 258, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnRedigr = new JButton("Redigér");
		btnRedigr.setBounds(150, 286, 102, 29);
		contentPane.add(btnRedigr);
		
		JButton btnGem = new JButton("Gem");
		btnGem.setBounds(249, 286, 102, 29);
		contentPane.add(btnGem);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/idahammeringerslev/Desktop/AF5129_ida_h/assignment_1/img/body1.jpg"));
		lblNewLabel.setBounds(369, 78, 102, 143);
		contentPane.add(lblNewLabel);
		
		JButton btnHjlp = new JButton("Hjælp");
		btnHjlp.setBounds(362, 250, 117, 29);
		contentPane.add(btnHjlp);
		
		JButton btnAfslut = new JButton("Afslut");
		btnAfslut.setBounds(362, 286, 117, 29);
		contentPane.add(btnAfslut);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
