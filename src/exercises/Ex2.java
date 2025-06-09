//Implement a code that calculates the value of a base raised to an exponent (both provided by the user) using the Math.pow( ) method.
package exercises;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double base= -1;
		double expoente= -1;
		
		System.out.println("Calculadora de números elevados.");
		
		while (true) {
			try {
				
			System.out.println("Digite a base: ");
			base = Double.parseDouble(scan.nextLine());
			System.out.println("Digite o expoente: ");
			expoente = Double.parseDouble(scan.nextLine());
			
			if (base < 0 && expoente % 1 != 0) {
				System.out.println("Erro: expoente fracionário não é aceito com base negativa.");
			}
			
			else {
				double quociente= Math.pow(base, expoente);
				System.out.printf("A potência de %.2f elevado a %.2f é igual a %.2f.\n", base, expoente, quociente);
				break;
			}
				
			} catch (NumberFormatException e) {
				System.out.println("Erro: entrada inválida. Digite um número válido.");
			}
		}
		scan.close();
	}
}
