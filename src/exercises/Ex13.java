//Implement a program that counts the number of words in a sentence provided by the user. Consider that the words are separated by spaces.
package exercises;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = scan.nextLine();
		String[] palavras = frase.split(" ");
		System.out.println("O número de palavras dessa frase é "+palavras.length+".");
		
		scan.close();
	}
}
