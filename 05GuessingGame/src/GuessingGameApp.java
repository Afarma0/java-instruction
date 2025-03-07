import java.util.Scanner;

public class GuessingGameApp {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to the Guessing Game");
			System.out.println("++++++++++++++++++++++++++++");
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("I'm thinknig of a number from 1 to 100. \nTry to guess it.");
				int theNumber = (int) (Math.random()* 100)+1;
				int guess = 0;
				int count = 0;
				while (guess != theNumber) {
					guess = promptInt("Enter number: ");
					count++;
					if (guess + 10 < theNumber)
					{System.out.println("Way too low.");}
					else if (guess < theNumber)
					{System.out.println("Too low.");}
					else if (guess - 10 > theNumber)
					{System.out.println("Way too high.");}					
					else if (guess > theNumber)
					{System.out.println("Too high.");}
					else {System.out.println("Nice one");}
				}
				
				System.out.println("Continue (y/n): ");
				choice = sc.next();
				
			}
			sc.close();	
			System.out.println("Bye");
	}
	private static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			try {
				System.out.print(prompt);
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} catch (Exception e) {
				System.err.println("Error - Invalid int.");
			}
		}

		return result;
	}

}
