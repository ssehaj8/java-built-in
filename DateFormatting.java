import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
	public static void main(String[] args) {
        	// Get the current date
        	LocalDate currDate = LocalDate.now();

        	// Format the date in different styles
        	String res1 = currDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        	String res2 = currDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        	String res3 = currDate.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"));

        	// Display the formatted dates
        	System.out.println("Current date in format dd/MM/yyyy: " + res1);
        	System.out.println("Current date in format yyyy-MM-dd: " + res2);
        	System.out.println("Current date in format EEE, MMM dd, yyyy: " + res3);
    	}
}
