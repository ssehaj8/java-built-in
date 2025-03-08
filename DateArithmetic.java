import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking date input from the user in the format YYYY-MM-DD
        	System.out.print("Enter a date (YYYY-MM-DD): ");
        	String str = sc.nextLine();

        	// Parsing the input date to LocalDate
        	LocalDate date = LocalDate.parse(str);

        	// Adding 7 days, 1 month, and 2 years
        	LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        	// Subtracting 3 weeks
        	modifiedDate = modifiedDate.minusWeeks(3);

        	// Displaying the final date
        	System.out.println("Final modified date: " + modifiedDate);
    	}
} 

/*
I/P -> Enter a date (YYYY-MM-DD): 2025-12-23
O/P -> Final modified date: 2028-01-09
*/
