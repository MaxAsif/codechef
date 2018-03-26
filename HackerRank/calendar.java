import java.util.Scanner;
class Solution {
	public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
        LocalDate date = new LocalDate(day,month,year);
        return date.getFirstDayOfWeek();
        
    }
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String month = in.next();
    	String day = in.next();
    	String year = in.next();

    	System.out.println(getDay(day, month, year));
    }
}