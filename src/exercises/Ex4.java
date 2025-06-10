//4.Write a program that converts an angle from degrees to radians and calculates
//the sine, cosine, and tangent using the Math.sin( ), Math.cos( ), and Math.tan( ) methods.
package exercises;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
double numero = -1;
		
		System.out.println("Calculadora de seno, cosseno e tangente.");
		
		while (true) {
			try {
			System.out.println("Digite o ângulo: ");
			numero = Double.parseDouble(scan.nextLine());
			double radianos = Math.toRadians(numero);
			
			
			if(numero<0) {
				System.out.println("Erro: o ângulo precisa ser positivo.");
			}
			
			else {
				double sen= Math.sin(radianos);
				double cos= Math.cos(radianos);
				double tg= Math.tan(radianos);
				System.out.printf("O seno do ângulo de %.2f° é igual a %.3f\n",numero,sen);
				System.out.printf("O cosseno do ângulo de %.2f° é igual a %.3f\n",numero,cos);
				System.out.printf("A tangente do ângulo de %.2f° é igual a %.3f\n",numero,tg);
				break;
			}
			} catch (NumberFormatException e ) {
				System.out.println("Erro: entrada inválida. Digite um número válido.");
			}
		}
		scan.close();
	}
}
