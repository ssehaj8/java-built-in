import java.util.Scanner;

public class TempratureConverter {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		//Take user input to choose the conversion
        	System.out.println("Choose conversion ");
        	System.out.println("Choice 1 -> Fahrenheit to Celsius");
        	System.out.println("Choice 2 -> Celsius to Fahrenheit");
        	int choice = sc.nextInt();

		//Calls to be made based on the conversion choice
        	switch (choice) {
            		case 1:
                		System.out.print("Enter temperature in Fahrenheit: ");
                		double fahrenheit = sc.nextDouble();
                		System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheit));
                		break;
            		case 2:
                		System.out.print("Enter temperature in Celsius: ");
                		double celsius = sc.nextDouble();
                		System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                		break;
            		default:
                		System.out.println("Invalid choice!");
        	}
    	}

    	// Method to convert Fahrenheit to Celsius
    	public static double fahrenheitToCelsius(double fahrenheit) {
        	return (fahrenheit - 32) * 5 / 9;
    	}

    	// Method to convert Celsius to Fahrenheit
    	public static double celsiusToFahrenheit(double celsius) {
        	return (celsius * 9 / 5) + 32;
    	}
}


/*
I/P :
Choose conversion 
Choice 1 -> Fahrenheit to Celsius
Choice 2 -> Celsius to Fahrenheit
2
Enter temperature in Celsius: 32

O/P -> Temperature in Fahrenheit: 89.6
*/
