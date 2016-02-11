import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JScrollPane;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 48, 373, 211);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		ArrayList<Animal> dyr = new ArrayList<Animal>();
		dyr.add(new Dog("Jørgen", "Canis majori", 12, true));
		dyr.add(new Cat("Miffe", "Felis silvestris catus", 10, 26));
		dyr.add(new Dog("Carles","Canis majori", 9, false));
		dyr.add(new Snake("Frede","Serpens",true));
		dyr.add(new Snake("Spytte", "Serpens", false));
		dyr.add(new Cat("Katte", "Felis silvestris catus", 9,2));
		dyr.add(new Cat("Fede", "Felis silvestris catus", 20,9));
		dyr.add(new Dog("Ida","Canis majori", 59, true));
		dyr.add(new Snake("Snape!","Serpens", true));
		dyr.add(new Snake("Dick","Serpens", true));
		dyr.add(new Cat("Niller","Felis silvestris catus", 100,0));
		for(Animal animal : dyr){
		textArea.append(animal.getInfo() + "\n");
		}

		
		JLabel lblDyreliste = new JLabel("Dyreliste");
		lblDyreliste.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDyreliste.setBounds(152, 17, 154, 19);
		contentPane.add(lblDyreliste);
	}
}
