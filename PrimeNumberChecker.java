import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		
		//Take input number
        	System.out.print("Enter a number: ");
        	int n = sc.nextInt();
		
		//Check if prime or not by calling a method and print the result
        	if (isPrime(n)) {
            		System.out.println("YES! " + n + " is a prime number.");
        	} 
		else {
            		System.out.println("NO! " + n + " is not a prime number.");
        	}
    	}

    	// Method to check if a number is prime
    	public static boolean isPrime(int n) {
        	if (n <= 1) {
            		return false;
        	}
        	for (int i = 2; i <= Math.sqrt(n); i++) {
            		if (n % i == 0) {
                		return false;
            		}
        	}
        	return true;
    	}
}



/*
I/P -> Enter a number: 5
O/P -> YES!5 is a prime number.
*/
