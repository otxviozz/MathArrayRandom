//Implement code that removes leading and trailing whitespace from a user-supplied string and displays the result.
package exercises;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma palavra com espaços no início e no fim: ");
		String palavra = scan.nextLine().trim();
		
		System.out.println("Palavra sem espaços:"+palavra);
		
		scan.close();
	}
}
