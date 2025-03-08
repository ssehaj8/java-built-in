import java.util.Scanner;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		
		//Take user input for three numbers
        	System.out.print("Enter first number: ");
        	int n1 = sc.nextInt();

	        System.out.print("Enter second number: ");
        	int n2 = sc.nextInt();

        	System.out.print("Enter third number: ");
        	int n3 = sc.nextInt();

        	int max = findMax(n1, n2, n3);
        	System.out.println("The maximum of the three numbers is: " + max);
    	}

    	// Method to find the maximum of three numbers
    	public static int findMax(int a, int b, int c) {
        	//Check if a number is greater than the oher two numbers
		if (a >= b && a >= c) {
            		return a;
        	} 
        	else if (b >= a && b >= c) {
            		return b;
        	} 
        	else {
            		return c;
        	}
    	}
}



/*
Enter first number: 3
Enter second number: 4
Enter third number: 5
The maximum of the three numbers is: 5
*/
