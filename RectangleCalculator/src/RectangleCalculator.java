import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to Area and Perimeter Calculator, human!");
			Scanner sc = new Scanner(System.in);
			
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.print("Enter length: ");
				int length = sc.nextInt();
				System.out.print("Enter width: ");
				int width = sc.nextInt();
				
				System.out.println("Area: \t" + length * width);
				System.out.println("Perimeter: \t" + ((length + width)*2));
				
				System.out.print("Continue? (y/n): ");
				choice = sc.next();
			}
			System.out.println("Bye now!");
	}

}
