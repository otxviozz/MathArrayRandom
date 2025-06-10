//Write a program that reverses the order of the characters in a string provided by the user.
package exercises;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String invertido = "";
		
		System.out.print("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		for(int i=0; i<palavra.length();i++) {
		 invertido += palavra.charAt(palavra.length() - 1 - i);
		}
		System.out.println("A palavra invertida é "+invertido+".");
	}
}
