

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JLabel infoLabel;
	private JLabel alarmInfo;
	private JTextField textHour;
	private JTextField textMin;
	private JLabel urLabel;
	private JLabel Pic;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 288);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textHour = new JTextField();
		textHour.setBounds(6, 21, 86, 20);
		contentPane.add(textHour);
		textHour.setColumns(10);

		textMin = new JTextField();
		textMin.setBounds(6, 60, 86, 20);
		contentPane.add(textMin);
		textMin.setColumns(10);

		JLabel lblHour = new JLabel("HOUR:");
		lblHour.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 13));
		lblHour.setBounds(6, 6, 59, 14);
		contentPane.add(lblHour);

		JLabel lblMinute = new JLabel("MIN:");
		lblMinute.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 13));
		lblMinute.setBounds(6, 42, 46, 14);
		contentPane.add(lblMinute);

		JButton alarmSet = new JButton("Set Alarm");
		alarmSet.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 11));
		alarmSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from the two textfields and set them as alarm
				int clockHour;
				int clockMinute;
				try {
					clockHour = Integer.parseInt(textHour.getText());
					clockMinute = Integer.parseInt(textMin.getText());
					clockLogic.setAlarm(clockHour, clockMinute);
				} catch(NumberFormatException ex) {
					System.out.println("buhu!");
				}
				
			}
		});
		alarmSet.setBounds(0, 92, 95, 23);
		contentPane.add(alarmSet);

		JButton alarmClear = new JButton("Clear");
		alarmClear.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 11));
		alarmClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//use the clear method to clear the alarm, set it back to "default"
				clockLogic.clearAlarm();
				infoLabel.setText("Set The Alarm");
				urLabel.setForeground(new Color(0,0,0));
				textHour.setText("");
				textMin.setText("");
			}
		});
		alarmClear.setBounds(239, 238, 109, 23);
		contentPane.add(alarmClear);

		urLabel = new JLabel("00:00");
		urLabel.setFont(new Font("Vladimir Script", Font.PLAIN, 60));
		urLabel.setBounds(58, 105, 300, 111);
		contentPane.add(urLabel);

		infoLabel = new JLabel("Set The Alarm");
		infoLabel.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 16));
		infoLabel.setBounds(103, 92, 226, 33);
		contentPane.add(infoLabel);
		
		alarmInfo = new JLabel("Wait for it...");
		alarmInfo.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 30));
		alarmInfo.setBounds(6, 218, 241, 48);
		contentPane.add(alarmInfo);
		
		lblNewLabel = new JLabel("Alarm At:");
		lblNewLabel.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 16));
		lblNewLabel.setBounds(103, 77, 222, 20);
		contentPane.add(lblNewLabel);
		
		Pic = new JLabel("New label");
		//set background picture
		Pic.setIcon(new ImageIcon("/Users/idahammeringerslev/Desktop/AF5129_ida_h/Assignment5/img/cat.jpeg"));
		Pic.setBounds(0, 0, 348, 266);
		contentPane.add(Pic);
        clockLogic = new ClockLogic(this);
		}

	public void setTimeOnLabel(String time) {
		urLabel.setText(time);
		}
	public void setAlarmTimeOnLabel(String alarmTime) {
		infoLabel.setText(alarmTime);
	}

	public void activateAlarm(Boolean start) {
		if(start == true){
			//if true start alarm else wait for it...
			alarmInfo.setText("WAKE UP!!");
			Toolkit.getDefaultToolkit().beep();
			urLabel.setForeground(new Color(255,0,0));
        } else {
			alarmInfo.setText("Wait for it..");
			
		}

	}
}		


