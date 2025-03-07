import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Welcome to FizzBuzz!");
			
			Scanner sc = new Scanner(System.in);
			
			String choice = "y";
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Enter number, human: ");
				int n = Integer.parseInt(sc.nextLine());
				for (int i = 1; i<= n; i++) {
					if (i % 3 == 0 && i % 5 ==0) {
						System.out.println("fizzbuzz!");
					}
					else if (i % 3 ==0)
					{
						System.out.println("fizz!");
					}
					else if (i % 5 ==0) {
						System.out.println("buzz!");
					}
					else {
						System.out.println(i);
					}
				}
				
				
				
				
				System.out.println("Continue (y/n): ");
				choice = sc.nextLine();
				
			}
			
			
			
			
			
			
			System.out.println("\nBye");
	}

}
