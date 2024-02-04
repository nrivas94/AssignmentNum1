//Noel Rivas
//nrivas11@toromail.csudh.edu
import java.util.*;

public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quarter = 0, dime = 0, nickel = 0, penny = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your amount in dollars: ");
		double dollar = scanner.nextDouble();
		
		int dollarDisplay = (int)dollar;
		
		System.out.println("Please enter your amount in cents: ");
		int cents = scanner.nextInt();
		
		System.out.println(dollarDisplay + " dollar(s) " + "and " + cents + " cent(s) are: ");
		
		for (double i = dollar; dollar > 0; dollar -= 0.25) {
			quarter++;
		}
		
		for (int i = cents; cents >= 25; cents -= 25) {
			quarter++;
		}
		
		for (int i = cents; cents >= 10; cents -= 10) {
			dime++;
		}
		
		for (int i = cents; cents >= 5; cents -= 5) {
			nickel++;
		}
		
		penny = cents;
		
		System.out.println(quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, and " + penny + " pennies");
		
		scanner.close();
	}

}
