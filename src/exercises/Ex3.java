//Create a program that receives the values ​​of the legs of a right triangle and calculates the hypotenuse using the Math.hypot( ) method.
package exercises;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double cateto1= -1;
		double cateto2= -1;
		
		System.out.println("Calculadora de hipotenusa.");
		
		while (true) {
			try {
				
			System.out.printf("Digite o primeiro cateto: ");
			cateto1 = Double.parseDouble(scan.nextLine());
			System.out.printf("Digite o segundo cateto: ");
			cateto2 = Double.parseDouble(scan.nextLine());
			
			if (cateto1 < 0 || cateto2 < 0) {
				System.out.println("Erro: os catetos devem ser maiores que zero.");
			}
			
			else {
				double hipotenusa= Math.hypot(cateto1, cateto2);
				System.out.printf("A hipotenusa de catetos com lados iguais a %.2f e %.2f é igual a %.2f.\n", cateto1, cateto2, hipotenusa);
				break;
			}
				
			} catch (NumberFormatException e) {
				System.out.println("Erro: entrada inválida. Digite um número válido.");
			}
		}
		scan.close();
	}
}
