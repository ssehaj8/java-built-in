import java.util.Scanner;

public class GCDLCM {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.print("Enter the first number: ");
        	int n1 = sc.nextInt();

        	System.out.print("Enter the second number: ");
        	int n2 = sc.nextInt();

        	// Calculate GCD and LCM
        	int gcd = findGCD(n1, n2);
        	int lcm = findLCM(n1, n2, gcd);

        	// Display the results
        	System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
        	System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
   	}

    	// Function to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    	public static int findGCD(int a, int b) {
        	if (b == 0) {
            		return a;
        	}
        	return findGCD(b, a % b);
    	}

    	// Function to calculate the Least Common Multiple (LCM)
    	public static int findLCM(int a, int b, int gcd) {
        	return (a * b) / gcd;
    	}
} 



/* I/P -> Enter the first number: 20
	  Enter the second number: 5
O/P -> 	GCD of 20 and 5 is: 5
	LCM of 20 and 5 is: 20
*/
