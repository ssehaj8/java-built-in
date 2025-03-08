import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
        	String str = getInput();
        	boolean isPalindrome = checkPalindrome(str);
        	displayResult(str, isPalindrome);
    	}

    	// Function to get user input
    	public static String getInput() {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a word or phrase: ");
        	return sc.nextLine().replaceAll("\\s+", "").toLowerCase();
    	}

    	// Function to check if a string is a palindrome
    	public static boolean checkPalindrome(String s) {
        	int left = 0;
        	int right = s.length() - 1;

        	while (left < right) {
            		if (s.charAt(left) != s.charAt(right)) {
                		return false;
            		}
            		left++;
            		right--;
        	}
        	return true;
    	}

    	// Function to display the result
    	public static void displayResult(String s, boolean isPalindrome) {
        	if (isPalindrome) {
            		System.out.println("YES!, \"" + s + "\" is a palindrome.");
        	} 
        	else {
            		System.out.println("NO!, \"" + s + "\" is not a palindrome.");
        	}
    	}
}


/*
I/P -> Enter a word or phrase: abba
O/P -> YES!, "abba" is a palindrome.
*/
