//Noel Rivas
//nrivas11@toromail.csudh.edu

import java.util.*;

public class Gravity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the initial position (height) in meters from where the object was dropped: ");
		double x = scanner.nextDouble();
		
		System.out.println("Enter the observation time in seconds: ");
		double t = scanner.nextDouble();
		
		double result = 0.5 * -9.81 * t * t + 0.0 * t + x; 
		double distance = x - result;
		
		System.out.println("The distance in meters that the object has fallen to in the given time,  e.g. The object was dropped from " + x + " meters and has fallen " + result + " in " + t + " seconds");
		System.out.println("The distance of the object from the ground at the given time, e.g. having fallen " + result + " the distance from the ground now is " + distance);
	}

}
