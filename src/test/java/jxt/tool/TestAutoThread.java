package jxt.tool;

import java.util.Calendar;
import java.util.Date;

public class TestAutoThread implements Runnable {

	private Date date;

	public TestAutoThread(Date date) {
		super();
		this.date = date;
	}

	private static boolean isSameDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);

		boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		boolean isSameMonth = isSameYear
				&& cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean isSameDate = isSameMonth
				&& cal1.get(Calendar.DAY_OF_MONTH) == cal2
						.get(Calendar.DAY_OF_MONTH);

		return isSameDate;
	}

	@Override
	public void run() {
		while (true) {
			if (isSameDate(date, new Date())) {
				System.out.println("哈哈哈哈");
			}
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
