package housePainting;
import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Define Variables
		double lengthOfHouse = 0;
		double widthOfHouse = 0;
		double heightOfHouse = 0;
		double numberOfWindows = 0;
		double LengthOfWindow = 0;
		double widthOfWindow =  0;
		double numberOfDoors = 0;
		double lengthOfDoor = 0;
		double widthOfDoor = 0;
		double totalSurfaceArea = 0;
		double costPerSqFt = 0;
		double estimate = 0;
		
		
		
		//Inputs
		System.out.println("Please enter length of house: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter width of house: ");
		widthOfHouse = sc.nextDouble();
		System.out.println(widthOfHouse);
		System.out.println("Please enter height of house: ");
		heightOfHouse = sc.nextDouble();
		System.out.println(heightOfHouse);
		System.out.println("Please enter number of windows: ");
		numberOfWindows = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter main length of each window: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter main width of each window:: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter number of doors: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter main length of each door: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter main width of each door: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		System.out.println("Please enter cost per square foot: ");
		lengthOfHouse = sc.nextDouble();
		System.out.println(lengthOfHouse);
		//Calculations
		
		
		
		
		//Had difficulty finding calculation for outputting the total Surface Area within the assignment, this was my main and only issue as well unfortunately 
		
		totalSurfacArea = ();
		
		estimate = ((totalSurfaceArea)* (costPerSqFt));
		
		//Outputs
	    System.out.println(totalSurfaceArea);
	    totalSurfaceArea = sc.nextDouble();
	    System.out.println(estimate);
	    estimate = sc.nextDouble();
	}

}
