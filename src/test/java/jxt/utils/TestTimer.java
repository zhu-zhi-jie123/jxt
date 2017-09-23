package jxt.utils;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, +1);
		
		Timer timer = new Timer();
		timer.schedule((new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("卧槽");
			}
		}), calendar.getTime());
		
	}
	
}
