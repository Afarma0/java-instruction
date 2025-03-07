import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Welcome to Squares or Cubes Table!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter a number: ");
			int n = Integer.parseInt(sc.nextLine());
			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t======= ======");
			for (int i = 1; i <= n; i++) {
				System.out.println(i + "\t" + (i*i)+"\t"+(i*i*i) );
			}
			
			
			System.out.println();
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		
		
		
		System.out.println("");
		
	}

}
