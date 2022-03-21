import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter two integers that will be added together\nType the first number and hit \"enter\", and do the same for the next number");
		int num1 = userInput.nextInt();
		int num2 = userInput.nextInt();
		add(num1, num2);
		
	}

	public static void add(int int1,int int2) {
		System.out.println("Result: " + (int1 + int2));
	}
}
