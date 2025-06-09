//Write a program that receives a number from the user and calculates its square root using the Math.sqrt( ) method.
package exercises;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double numero = -1;
		
		System.out.println("Calculadora de raiz quadrada.");
		
		while (true) {
			try {
			System.out.println("Digite o número: ");
			numero = Double.parseDouble(scan.nextLine());
			
			
			if(numero<0) {
				System.out.println("Erro: raiz quadrada de número negativo não é real.");
			}
			
			else {
				double raiz= Math.sqrt(numero);
				System.out.printf("A raiz quadrada do número %.2f é igual a %.2f\n",numero,raiz);
				break;
			}
			} catch (NumberFormatException e ) {
				System.out.println("Erro: entrada inválida. Digite um número válido.");
			}
		}
		scan.close();
	}
}
