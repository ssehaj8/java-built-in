import java.util.Scanner;

public class FibonacciGenerator {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	//Take user input
        	System.out.print("Enter the number for the Fibonacci sequence: ");
        	int n = sc.nextInt();

        	System.out.println("Fibonacci sequence up to " + n + " terms:");
        	//make a call to the method that generates the sequence
        	generateFibonacci(n);
    	}

    	// Method to generate and print the Fibonacci sequence up to a given number of terms
    	public static void generateFibonacci(int n) {
        	int first = 0, second = 1;

        	for (int i = 0; i < n; i++) {
            		System.out.print(first + " ");
            		int next = first + second;
            		first = second;
            		second = next;
        	}
        	System.out.println();
    	}
} 

/*
I/P -> Enter the number for the Fibonacci sequence: 10
O/P -> Fibonacci sequence up to 10 terms:
       0 1 1 2 3 5 8 13 21 34 
*/
