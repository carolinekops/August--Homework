//homework August 8th
import java.util.Scanner;

public class NewCalculator {
	
	public static void main(String[] args) {
		do {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first number?");
		int num1 = keyboard.nextInt();
		System.out.println("What is your second number?");
		int num2 = keyboard.nextInt();
		Calculate(num1,num2);
		}
		while(Continue().equals("yes"));
	}	
	static String Continue(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Want to do another equation? Enter Yes or No");
		String keepGoing = keyboard.nextLine(); 
		keepGoing.equalsIgnoreCase("no");
		return keepGoing;
	}
	

	static void Calculate(int num1, int num2) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Do you want to Add, Subtract, Multiply or Divide? Enter A, S, M or D.");
		String userInput = keyboard.nextLine();
		
		switch(userInput.toUpperCase()) {
		case "A": {
			System.out.println(num1*num2);
			break;
		}
		case "S": {
			System.out.println(num1-num2);
			break;
		}
		case "M": {
			System.out.println(num1*num2);
			break;
		}
		case "D": {
			try {
				System.out.println(num1/num2);
		}
			catch(ArithmeticException e) {
				System.out.println("You cannot divide by zero. Try again.");
			}
			break;
			}
		}	
	}
}
