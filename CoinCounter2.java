
public class CoinCounter2 {
	private int total = 0;
	
	public CoinCounter2 (int quarters, int dimes, int nickels, int pennies) {
		total += quarters * 25;
		total += dimes * 10;
		total += nickels * 5;
		total += pennies * 1;
		
	}
	
	public int getDollarAmount() {
		return total / 100;
	}
	
	public double getCentsAmount() {
		return total % 100; 
	}
}
