//Write a code that receives a sentence from the user and extracts a substring based on the given indexes (starting and ending).
package exercises;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Extrator de início e fim de palavras!");
		System.out.print("Digite uma palavra: ");
		String palavra = scan.nextLine();
		System.out.println("Substring: "+palavra.substring(0, 1)+" e "+palavra.substring(palavra.length()-1)+".");
	}

}
