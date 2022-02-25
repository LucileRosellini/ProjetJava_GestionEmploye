package modele;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class GestionDate {

	public GestionDate() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPassed(Date d) {
		return false;
	}

	public boolean isFuture(Date d) {
		return false;
	}

	public Date stringToDate(String sDate) {

		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sfd.parse(sDate);
		} catch (ParseException e) {
			System.out.println(e);
			// TODO Auto-generated catch block
		}

		return null;

	}

	public static String dateToString(Date d, String dDate) {

		SimpleDateFormat sfd = new SimpleDateFormat(dDate);
		Calendar c = Calendar.getInstance();
		c.setTime(d);

		Date dateTruc = c.getTime();

		return sfd.format(dateTruc);
	}

	public int diffDays(Date d1, Date d2) {
		
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(d1);
		
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(d2);
		

        // Get the difference between two dates in milliseconds    
		long diffInMillisec = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();     

		// Get difference between two dates in days
		long diffInDays = diffInMillisec / (24 * 60 * 60 * 1000);
		
		return (int) Math.abs(diffInDays);
}
		
		
	public int diffYears(Date d1, Date d2) {

		return 0;
	}

	public int diffMonths(Date d1, Date d2) {
		return 0;

	}

}
