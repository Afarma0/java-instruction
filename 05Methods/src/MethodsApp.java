import java.util.Scanner;

public class MethodsApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Methods!");

		// add 2 numbers

		int x = promptInt("Enter number x: ");
		int y = promptInt("Enter number y: ");

		int sum = x + y;
		System.out.println("Sum = " + sum);

		double d = promptDouble("Enter your worst number: ");
		double dd = promptDouble("Now enter an even worser one: ");

		double quotient = (d / dd);
		System.out.println("MUAHAHAHAHA = " + quotient);
		// divide two doubles
		// get two doubles, divide em print the quotient

		sc.close();
		System.out.println("Bye");
	}
//exception handling
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
//data validation
	private static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				result = Double.parseDouble(sc.nextLine());
				isValid = true;
			}
			else {
				System.err.println("Error, invalid entry, try again.");
				sc.nextLine();
			}
		}
		return result;
	
	}
}
