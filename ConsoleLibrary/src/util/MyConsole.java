package util;

import java.util.Scanner;

public class MyConsole {
	private static Scanner scanner = new Scanner(System.in);

	public static int promptInt(String prompt) {
		int result = 0;
		boolean isValid = false;
		while (!isValid) {
			print(prompt);
			if (scanner.hasNextInt()) {
				result = scanner.nextInt();
				isValid = true;
			} else {
				printLine("Error - invalid int.");
				scanner.next(); // Consume invalid input
			}
		}
		return result;
	}

	public static int promptIntWithinRange(String message, int max, int min) {
		int result = 0;
		boolean isValid = false;
		while (!isValid) {
			result = promptInt(message);
			if (result <= min && result >= max) {
				isValid = true;
			} else {
				printLine("Error - int out of range. (" + min + " - " + max + ")");
			}
		}
		return result;
	}

	public static double promptDouble(String prompt) {
		double result = 0.0;
		boolean isValid = false;
		while (!isValid) {
			print(prompt);
			if (scanner.hasNextDouble()) {
				result = scanner.nextDouble();
				isValid = true;
			} else {
				printLine("Error - invalid double.");
				scanner.next(); // Consume invalid input
			}
		}
		return result;
	}

	public static String promptString(String prompt) {
		print(prompt);
		return scanner.nextLine();
	}

	public static String promptReqString(String prompt, String str1, String str2) {
		String result = "";
		boolean isValid = false;
		while (!isValid) {
			result = promptString(prompt);
			if (!result.trim().isEmpty()) {
				if (result.equals(str1) || result.equals(str2)) {
					isValid = true;
				} else {
					printLine("Error - string must be either " + str1 + " or " + str2);
				}
			} else {
				printLine("Error - entry is required.");
			}
		}
		return result;
	}

	public static void print(String msg) {
		System.out.print(msg);
	}

	public static void printLine(String msg) {
		System.out.println(msg);
	}
}
