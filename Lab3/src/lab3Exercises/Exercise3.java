/**
*  Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
*  Note: Consonant refers to all alphabets excluding vowels
*  @author Saravana prasath c
*  
*/

package lab3Exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		String str = getInputString();
		System.out.println("Altered string----> "+alterString(str));	
	}
	private static String alterString(String str) {
		String vowels ="aeiouAEIOU";
		int length = str.length();
		String str1="";
		char[]stringArray = str.toCharArray();
		for(int index=0;index<length;index++) {
			if(vowels.contains(stringArray[index]+"")) {
				str1+=stringArray[index]+"";
			}
			else {
				char ch =stringArray[index];
				if(ch=='z') {
					ch='a';
				}
				else if(ch=='Z') {
					ch='A';
				}
				else {
					ch++;
				}
				str1+=ch+"";
			}
		}
		return str1;
	}
	private static String getInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		return str;
	}

	}

