import java.awt.EventQueue;
import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TrafikGUI extends JFrame {

	
TrafikGUI GUI = this;
Parser p = new Parser();
	
public String sNavn;
public JPanel contentPane;
public JTextField textS;
public JTextArea TextR1; 
public JTextArea textR2;
public JTextField textF;
public JTextField textT;
public JButton searchB2;


//Create thread for StationSearch
private class stationSøgning extends Thread{
public void run(){
ArrayList<Station> stationsS = new ArrayList<Station>(); 
stationsS.addAll(Parser.getStationsFromURL(sNavn));
TextR1.setText("");
for (Station a: stationsS){
if(a.getStationName().contains(sNavn)){
TextR1.append("Station NR: " + a.getStationNbr() + " Navn: " + a.getStationName() + " Latitude: " + a.getLatitude() + " Longitude: " + a.getLongitude() + "\n");
}
}
}
}
//Crate thread for TravelSearch
private class rejseSøgning extends Thread{
public void run(){
String søgWeb = Constants.getURL(textF.getText(),textT.getText(),1); 
//Search "Skånetrafikken" for trains
Journeys journeys = Parser.getJourneys(søgWeb);
textR2.setText("");
for (Journey journey : journeys.getJourneys()) {
textR2.append(journey.getStartStation()+ " til ");
textR2.append(journey.getEndStation().getStationName());
//Add current time
String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
//Write to textField
textR2.append(" Toget afgår: " + time +" Hvilket er om: "+journey.getTimeToDeparture()+ " Minutter. Toget er: "+journey.getDepTimeDeviation()+" minutter forsinket.");
} 
}
}
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
TrafikGUI frame = new TrafikGUI();
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
public TrafikGUI() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 440, 473);
contentPane = new JPanel();
contentPane.setBackground(Color.BLUE);
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);


JPanel panel = new JPanel();
panel.setBounds(6, 156, 427, 289);
contentPane.add(panel);
panel.setLayout(null);
JScrollPane scrollPane_1 = new JScrollPane();
scrollPane_1.setBounds(6, 119, 415, 150);
panel.add(scrollPane_1);

textR2 = new JTextArea();
scrollPane_1.setViewportView(textR2);

textF = new JTextField();
textF.setBounds(48, 3, 258, 26);
panel.add(textF);
textF.setColumns(10);


textT = new JTextField();
textT.setBounds(48, 35, 258, 26);
panel.add(textT);
textT.setColumns(10);

JLabel lblNewLabel = new JLabel("Fra:");
lblNewLabel.setFont(new Font("Lithos Pro", Font.PLAIN, 13));
lblNewLabel.setBounds(23, 9, 69, 20);
panel.add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("Til:");
lblNewLabel_1.setFont(new Font("Lithos Pro", Font.PLAIN, 13));
lblNewLabel_1.setBounds(23, 38, 69, 20);
panel.add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("Resultat:");
lblNewLabel_2.setFont(new Font("Lithos Pro", Font.PLAIN, 13));
lblNewLabel_2.setBounds(6, 87, 69, 20);
panel.add(lblNewLabel_2);

JPanel panel_1 = new JPanel();
panel_1.setBounds(6, 6, 427, 138);
contentPane.add(panel_1);
panel_1.setLayout(null);

JScrollPane scrollPane = new JScrollPane();
scrollPane.setBounds(6, 57, 415, 75);
panel_1.add(scrollPane);

TextR1 = new JTextArea();
scrollPane.setViewportView(TextR1);

textS = new JTextField();
textS.setBounds(15, 6, 115, 26);
panel_1.add(textS);
textS.setColumns(10);


JButton searchB = new JButton("Søg Station");
searchB.setFont(new Font("Lithos Pro", Font.PLAIN, 13));
searchB.setBounds(15, 29, 115, 29);
panel_1.add(searchB);
JLabel lblSknetrafikken = new JLabel("SkåneTrafikken");
lblSknetrafikken.setFont(new Font("Lithos Pro", Font.PLAIN, 20));
lblSknetrafikken.setBounds(181, 11, 222, 34);
panel_1.add(lblSknetrafikken);
searchB.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
TextR1.setText("Søger..");
sNavn = GUI.textS.getText();
sNavn = sNavn.substring(0,1).toUpperCase() + sNavn.substring(1).toLowerCase();
new stationSøgning().start();
}
});
searchB2 = new JButton("Søg rejse");
searchB2.setFont(new Font("Lithos Pro", Font.PLAIN, 13));
searchB2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
textR2.setText("Søger...");
new rejseSøgning().start();
}
});
searchB2.setBounds(306, 35, 115, 29);
panel.add(searchB2);
}
}


