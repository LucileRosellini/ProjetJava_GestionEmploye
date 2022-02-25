package modele;

import java.util.Date;

public interface IDate {
	
	
	
	
	Date stringToDate(String sDate); 
	public String dateToString(Date dDate) ;
	public int diffDays(Date d1, Date d2) ;
	public int diffYears(Date d1, Date d2) ;
	public int diffMonths(Date d1, Date d2) ;
	

}
