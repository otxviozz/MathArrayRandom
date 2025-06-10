//10.Write a program that takes two names as input and concatenates them into a single string, displaying the result.
package exercises;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Concatenação de nome!");
				
			System.out.print("Digite o primeiro nome: ");
			String nome= scan.nextLine().trim();
			System.out.print("Digite o segundo nome: ");
			String sobrenome= scan.nextLine().trim();
			
			String nomeFormatado = nome.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();
	        String sobrenomeFormatado = sobrenome.substring(0,1).toUpperCase() + sobrenome.substring(1).toLowerCase();
			
			String nomecompleto = nomeFormatado+" "+sobrenomeFormatado;
			
			System.out.println("O nome completo é "+nomecompleto+".");
			
		scan.close();
	}
}
