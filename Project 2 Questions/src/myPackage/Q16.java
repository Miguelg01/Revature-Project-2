package myPackage;

import java.util.Scanner;

public class Q16 {
	
	public static void main(String[] args) {
	
	Q16 commandline = new Q16();
	commandline.numOfCharacters();
		
	}
	
	public void numOfCharacters() {

		char[] str2;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string for the number of characters: ");
		String str = input.next();
		str2 = str.toCharArray();

		System.out.println(str2.length);

		input.close();
	
		
	}
}
