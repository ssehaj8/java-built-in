import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
        	// Get user input
        	int n = getInput();

        	// Calculate factorial using recursion
        	long fact = calculateFactorial(n);

        	// Display the result
        	displayResult(n, fact);
    	}
	
    	// Method to get input from the user
    	public static int getInput() {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a number to calculate its factorial: ");
        	return sc.nextInt();
    	}

    	// Recursive method to calculate factorial
    	public static long calculateFactorial(int n) {
		// Base case: factorial of 0 or 1 is 1
        	if (n == 0 || n == 1) { 
            		return 1;
        	} 
		//Recursive call
		else { 
	  	        return n * calculateFactorial(n - 1);
        	}
    	}

    	// Method to display the result
    	public static void displayResult(int n, long fact) {
        	System.out.println("The factorial of " + n + " is: " + fact);
    	}
}



/*
I/P -> Enter a number to calculate its factorial: 5
O/P -> The factorial of 5 is: 120
*/
