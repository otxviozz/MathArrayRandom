//Create a program that compares two strings provided by the user and determines whether they are equal or different, ignoring differences in upper and lower case.
package exercises;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Comparador de palavras!");
		
		System.out.println("Digite uma palavra: ");
		String palavra1 = scan.nextLine().trim().toLowerCase();
		System.out.println("Digite outra palavra (ou igual): ");
		String palavra2 = scan.nextLine().trim().toLowerCase();
		
		if(palavra1 .equalsIgnoreCase(palavra2)) {
			System.out.println("As palavras são iguais!");
		}
		else {
			System.out.println("As palavras são diferentes!");
		}
		scan.close();
	}
}
