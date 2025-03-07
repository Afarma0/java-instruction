import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the GCD");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			System.out.print("Give me numba1, human: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Give me numba2, human: ");
			int y = Integer.parseInt(sc.nextLine());
			
			//x=12
			//y=8
			
			while (x!=0) {
				while (y >= x) {
						y-=x;				
			}
				int hold = y;
				y=x;
				x=hold;
			}
			System.out.println("\n Greatest Common Divisor: " +y);
			
			
				//while y>=x
					//y-x
					//x stays the same, y = y-x
				//swap x and y ( x = 8, y = 12)
			
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		
		
		
		
		
		System.out.println("Bye!");
	}

}
