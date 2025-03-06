import java.util.Scanner;

public class VariablesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Variables!\n");
		//define variables
		int n1 = 5;
		int n2=7;
		int sum = n1 + n2;
		System.out.println(sum);
		
		double p1 = 14.99;
		
		String name = "Bob";
		
		System.out.print(name);
		System.out.print(name);
		System.out.print(name);
		
		//get input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.println("You entered: "+name);
		//numeric values
		System.out.print("enter a number: ");
		n1 = sc.nextInt();
		System.out.println("you entered: "+ n1);
		
		sc.nextLine();
		//continue prompt? 
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("In the while  loop");
			System.out.print("Go again? ");
			choice = sc.nextLine();
		}
		if (n1 >= 10) {
			System.out.println("Greater than 10");
		}
		
		System.out.println("\nBye");
	}

}
