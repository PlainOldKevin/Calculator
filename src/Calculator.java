import java.util.Scanner;

public class Calculator {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter two integers\nType the first number and hit \"enter\", and do the same for the next number\n");
		
		int num1 = userInput.nextInt();
		int num2 = userInput.nextInt();
		
		System.out.println("Would you like to add or subtract these numbers?\nType \"sub\" for subtract or \"add\" for add");
		
		userInput.nextLine();
		String choice = userInput.nextLine();
		
		if (choice.equalsIgnoreCase("add")) {
			add(num1, num2);
		}
		else if(choice.equalsIgnoreCase("sub")) {
			subtract(num1, num2);
		}
	}

	public static void add(int int1,int int2) {
		System.out.println("Result: " + (int1 + int2));
	}
	
	public static void subtract(int int1, int int2) {
		System.out.println("Result: " + (int1 - int2));
	}
}
