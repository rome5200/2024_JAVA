package Chap4_Programming;

class Date{
	private int year;
	private int month;
	private int day;
	private String monthString;
	
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public String print1() {
		return year+"."+month+"."+day;
	}
	
	public String print2() {
		switch(month) {
			case 1:  
				monthString = "January";
				break;
			case 2:  
				monthString = "February";
				break;
			case 3:  
				monthString = "March";
				break;
			case 4:  
				monthString = "April";
				break;
			case 5: 
				monthString = "May";
				break;
			case 6:  
				monthString = "June";
				break;
			case 7:  
				monthString = "July";
				break;
			case 8:  
				monthString = "August";
				break;
			case 9: 
				monthString = "September";
				break;
			case 10: 
				monthString = "October";
				break;
			case 11: 
				monthString = "November";
				break;
			case 12: 
				monthString = "December";
				break;
			default: 
				monthString = "Invalid month";
				break;
		}
		return monthString+" "+day+" "+year;
	}
}

public class Chap4_Programming6 {

	public static void main(String[] args) {
		Date d = new Date(2022, 9, 5);
		System.out.println(d.print1());
		System.out.println(d.print2());
	}
}
