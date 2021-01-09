/**
*  Create a class containing a method to create the mirror image of a String. 
*  The method should return the two Strings separated with a pipe(|) symbol .
*  @author Saravana prasath

*/
package lab3Exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		String string = getInputString();
		System.out.println("Mirror image of the string--> "+getImage(string));	
	}

	private static String getImage(String string) {
		
		StringBuilder sb = new StringBuilder(string);
		string+="|"+sb.reverse();
		return string;
	}

	private static String getInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String string = sc.next();
		return string;
	}

}
	

