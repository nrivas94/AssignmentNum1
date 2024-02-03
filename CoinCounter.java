//Noel Rivas
//nrivas11@toromail.csudh.edu
import java.util.*;

public class CoinCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double penny, nickel, dime, quarter;
		penny = 1;
		nickel = 5;
		dime = 10;
		quarter = 25;
		
		double userPenny, userNickel, userDime ,userQuarter;
		double totalPenny, totalNickel, totalDime, totalQuarter; 
		
		System.out.println("Please enter the number of pennies: ");
		userPenny = scanner.nextDouble();
		totalPenny = userPenny * penny;
		
		System.out.println("Please enter the number of nickels: ");
		userNickel = scanner.nextDouble();
		totalNickel = userNickel * nickel;
		
		System.out.println("Please enter the number of dimes: ");
		userDime = scanner.nextDouble();
		totalDime = userDime * dime;
		
		System.out.println("Please enter the number of quarters: ");
		userQuarter = scanner.nextDouble();
		totalQuarter = userQuarter * quarter;
		
		double total = totalPenny + totalNickel + totalDime + totalQuarter;
		
		double totalDollars = total / 100;
		int justDollar = (int)totalDollars;
		double justCents = totalDollars - justDollar;
		long centsRounded = Math.round(justCents * 100);
			
		if (justDollar > 1 && centsRounded > 1) {
			System.out.println("You have " + justDollar + " dollars and " + centsRounded + " cents.");
		}
		
		if (justDollar > 1 && centsRounded == 1) {
			System.out.println("You have " + justDollar + " dollars and " + centsRounded + " cent.");
		}
		
		if (justDollar == 1 && centsRounded > 1) {
			System.out.println("You have " + justDollar + " dollar and " + centsRounded + " cents.");
		}
		
		if (justDollar == 1 && centsRounded == 1) {
			System.out.println("You have " + justDollar + " dollar and " + centsRounded + " cent.");
		}
		
		if (justDollar == 0 && centsRounded == 0) {
			System.out.println("No money!");
		}
		
		scanner.close();
		
	}

}
