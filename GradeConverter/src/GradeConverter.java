import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to the Letter Grade Converter");
			
			Scanner sc = new Scanner(System.in);
			
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.print("Enter your grade, human: ");
				int n1 = sc.nextInt();
				if (n1 > 87) {
					System.out.println("Letter Grade: A");				
				}
				else if (n1 > 79) {
					System.out.println("Letter Grade: B");
				}
				else if (n1 > 66) {
					System.out.println("Letter Grade: C");
				}
				else if (n1 > 59) {
					System.out.println("Letter Grade: D");
				}
				else  {
					System.out.println("Epic Fail");
				}
				
				System.out.print("Continue? (y/n): ");
				sc.next();
			}
	
	}
}
