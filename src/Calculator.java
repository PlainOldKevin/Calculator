import java.util.Scanner;

public class Calculator {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter two numbers\nType the first number and hit \"enter\", and do the same for the next number\n");
		
		double num1 = userInput.nextDouble();
		double num2 = userInput.nextDouble();
		
		System.out.println("Would you like to add, subtract, multiply, or divide these numbers?");
		System.out.println("Type \"sub\" to subtract, \"add\" to add, \"mult\" to multiply, or \"div\" to divide");
		
		userInput.nextLine();
		String choice = userInput.nextLine();
		
		if (choice.equalsIgnoreCase("add")) {
			add(num1, num2);
		}
		else if(choice.equalsIgnoreCase("sub")) {
			subtract(num1, num2);
		}
		else if(choice.equalsIgnoreCase("mult")) {
			multiply(num1, num2);
		}
		else {
			divide(num1, num2);
		}
	}

	public static void add(double int1, double int2) {
		System.out.println("Result: " + (int1 + int2));
	}
	
	public static void subtract(double int1, double int2) {
		System.out.println("Result: " + (int1 - int2));
	}
	
	public static void multiply(double int1, double int2) {
		System.out.println("Result: " + (int1 * int2));
	}
	
	public static void divide(double int1, double int2) {
		System.out.println("Result: " + (int1 / int2));
	}
}
