package myPackage;

import myPackage2.*;
import myPackage2.Q15b;

public class Q15 extends Q15b{


	    public static void main(String[] args) {

	        Q15b calculator = new Q15b();
	        float a = 3;
	        float b = 4;

	        System.out.println("Numbers are: " + a + " and " + b);
	        System.out.println("Addition: ");  calculator.addition(a,b);
	        System.out.println("Subtraction: ");  calculator.subtraction(a,b);
	        System.out.println("Multiplication: ");  calculator.multiplication(a,b);
	        System.out.println("Division: ");  calculator.division(a,b);
	    }

}
