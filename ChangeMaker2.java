
public class ChangeMaker2 {
	private int quarters = 0;
	private int dimes = 0;
	private int nickels = 0;
	private int pennies = 0;
	
	public ChangeMaker2(int dollars, int cents) {
		for (double i = dollars; i > 0; i -= 0.25) {
			quarters++;
		}
		
		for (int i = cents; i >= 25; i -= 25) {
			quarters++;
		}
		
		for (int i = cents; i >= 10; i -= 10) {
			dimes++;
		}
		
		for (int i = cents; i >= 5; i -= 5) {
			nickels++;
		}
		
		pennies = cents;
	}
	
	public int getQuarters () {
		return quarters;
	}
	
	public int getDimes () {
		return dimes;
	}
	
	public int getNickels () {
		return nickels;
	}
	
	public int getPennies () {
		return pennies;
	}
}
