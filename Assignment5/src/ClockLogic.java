import java.text.DecimalFormat;
import java.util.Calendar;


public class ClockLogic {
	
private int alarmHour;
private int alarmMinute;
private DigitalClockGUI digitalClockGUI;
private ClockLogic DigitalClockThread;
	
private class DigitalClockThread extends Thread{
	@Override
	public void run(){
		DecimalFormat decimalFormat = new DecimalFormat("00");
		while(true){
			// Get the right time
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int minute = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			digitalClockGUI.setTimeOnLabel("" +decimalFormat.format(hour) + ":" + decimalFormat.format(minute) + ":" + decimalFormat.format(sec));
			if((hour == alarmHour) && (minute == alarmMinute)) {
				digitalClockGUI.activateAlarm(true);
			} else {
				digitalClockGUI.activateAlarm(false);
				}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
		}
	}
}
	
public ClockLogic(DigitalClockGUI digitalClockGUI){
		this.digitalClockGUI = digitalClockGUI;
        new DigitalClockThread().start();; 
	}
public void setAlarm(int alarmHour, int alarmMinute){
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
		// The hours must be between 0 - 24
		if((alarmHour >= 0) && (alarmHour < 24) ){
			this.alarmHour = alarmHour;
		} else {
			alarmHour = -1;
		}

		// the minutes must be between 0 - 60
		if((alarmMinute >= 0) && (alarmMinute < 60) ){
			this.alarmMinute = alarmMinute;
		} else {
			alarmMinute = -1;
		}
		
		if((alarmHour >= 0) && (alarmMinute >= 0))
		{
        DecimalFormat decimalFormat = new DecimalFormat("00");

			digitalClockGUI.setAlarmTimeOnLabel(decimalFormat.format(alarmHour) + ":" + decimalFormat.format(alarmMinute));
		}
	}
//Clear the alarm. stop the alarm sound
public void clearAlarm(){
	setAlarm(-1, -1);
	digitalClockGUI.activateAlarm(false);

	}


}