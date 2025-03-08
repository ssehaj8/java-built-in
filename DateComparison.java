import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking first date input from the user
        	System.out.print("Enter the first date (yyyy-mm-dd): ");
        	LocalDate date1 = LocalDate.parse(sc.nextLine());

        	// Taking second date input from the user
        	System.out.print("Enter the second date (yyyy-mm-dd): ");
        	LocalDate date2 = LocalDate.parse(sc.nextLine());

        	// Comparing the two dates
        	if (date1.isBefore(date2)) {
            		System.out.println(date1 + " is before " + date2);
        	} 
        	else if (date1.isAfter(date2)) {
            		System.out.println(date1 + " is after " + date2);
        	} 
        	else if (date1.isEqual(date2)) {
            		System.out.println(date1 + " is the same as " + date2);
        	}
    	}
}

/*
I/P -> Enter the first date (yyyy-mm-dd): 2025-05-24
Enter the second date (yyyy-mm-dd): 2025-11-13
O/P -> 2025-05-24 is before 2025-11-13
*/
