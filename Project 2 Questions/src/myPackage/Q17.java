package myPackage;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Q17 {

	public float principal;
	public float rate;
	public float years;
	public float interest;
	
	Scanner input = new Scanner(System.in);
	
	
	public void Calculation() {
		
		System.out.println("Enter the principal amount: ");
		principal = input.nextFloat();
		
		System.out.println("Enter the rate of interest: ");
		rate = input.nextFloat();
		
		System.out.println("Enter the number of years: ");
		years = input.nextFloat();
		
		System.out.println("The amount of interest is ");
		System.out.println(principal * (Math.pow(rate, years)));
		
	}
	
	
	public static void main(String[] args) {
		
	Q17 Calculator = new Q17();
	Calculator.Calculation();
	
	}
	
}
