import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int lowerBound = 1;
        	int upperBound = 100;
        	int guess;
        	String feedback;

        	System.out.println("Think of a number between 1 and 100 and I will try to guess it!");

        	do {
            		guess = generateGuess(lowerBound, upperBound);
            		System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            		feedback = sc.nextLine().toLowerCase();

            		if (feedback.equals("higher")) {
                		lowerBound = adjustLowerBound(guess);
            		} 
            		else if (feedback.equals("lower")) {
                		upperBound = adjustUpperBound(guess);
            		} 
            		else if (!feedback.equals("correct")) {
                		System.out.println("Please respond with 'higher', 'lower', or 'correct'.");
            		}
        	} 
          	while (!feedback.equals("correct"));

        	System.out.println("Yes, I guessed your number!");
    	}

    	// Method to generate a random guess within the bounds
    	public static int generateGuess(int lower, int upper) {
        	Random random = new Random();
        	return lower + random.nextInt(upper - lower + 1);
    	}

    	// Method to adjust the lower bound after 'higher' feedback
    	public static int adjustLowerBound(int guess) {
        	return guess + 1;
    	}

    	// Method to adjust the upper bound after 'lower' feedback
    	public static int adjustUpperBound(int guess) {
        	return guess - 1;
    	}
}



/*
Think of a number between 1 and 100 and I will try to guess it!
Is your number 22? (higher/lower/correct)
higher
Is your number 68? (higher/lower/correct)
lower
Is your number 29? (higher/lower/correct)
high  
Please respond with 'higher', 'lower', or 'correct'.
Is your number 38? (higher/lower/correct)
lower
Is your number 29? (higher/lower/correct)
higher
Is your number 35? (higher/lower/correct)
correct
Yes, I guessed your number!
*/
