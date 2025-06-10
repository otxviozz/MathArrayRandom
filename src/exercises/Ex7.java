//7.Implement a game where the program generates a random number between 1 and 100,
//and the user has to guess. The program should provide hints ("higher" or "lower") until the user guesses correctly.
package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random = new Random();
		
		int numero = random.nextInt(100);
		System.out.println("Adivinhe o número!");
		
		while(true) {
			try {
				System.out.println("Digite um número:");
				int suposicao = scan.nextInt();
				
				if(suposicao > numero) {
					System.out.println("O seu número é maior que o número misterioso!");
				}
				if(suposicao < numero) {
					System.out.println("O seu número é menor que o número misterioso!");
				}
				if(suposicao == numero) {
					System.out.println("Correto! O número misterioso era "+numero+".");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Erro: Entrada inválida, digite um número inteiro.");
			}
		}
		scan.close();
	}
}
