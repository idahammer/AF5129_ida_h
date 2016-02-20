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
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
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
		
		if((alarmHour >= 0) && (alarmHour < 24) ){
			this.alarmHour = alarmHour;
		} else {
			alarmHour = -1;
		}

		
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
public void clearAlarm(){
	setAlarm(-1, -1);
	digitalClockGUI.activateAlarm(false);

	}


}