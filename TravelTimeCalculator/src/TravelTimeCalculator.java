import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to Travel Time");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		
		System.out.print("Enter miles: ");
		double miles = sc.nextDouble();
		System.out.print("Enter miles per hour: ");
		double mph = sc.nextDouble();
		
		System.out.println("Estimated Travel Time");
		System.out.println("------------------------");
		
		int hours = (int)(miles / mph);
		double remainingTime = (double) miles / mph;
        
       
        double minutesDecimal = (remainingTime - hours) * 60;
        
     
        int minutes = (int) Math.round(minutesDecimal);
		
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		
		System.out.print("Go again? ");
		sc.nextLine();
		choice = sc.nextLine();
		}
		
		
		
		
		System.out.println("Bye");
	}

}
