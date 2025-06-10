//Implement a code that replaces all occurrences of a specific word in a sentence with another word, both provided by the user.
package exercises;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean encontrado=false; // identificador se encontrou a palavra que substituirá no array
		
		System.out.print("Escreva uma frase sem vírgulas: ");
		String frase = scan.nextLine();
		String[] palavras = frase.split(" "); // guarda as palavras num array para eliminar espaços
		System.out.print("Escreva uma palavra dessa frase: ");
		String palavraescolhida= scan.nextLine(); 
		System.out.print("Escreva a palavra que deseja escrever que substituirá essa: ");
		String palavranova = scan.nextLine();
		
		for(int i=0; i<palavras.length; i++) {
			if(palavraescolhida .equalsIgnoreCase(palavras[i])) { // procuro no array se tem a palavra escolhida
				palavras[i]= palavranova; // atribuo a nova palavra naquela posição
				encontrado = true;
				break;
			}
		}
		
		if(encontrado == true) {
		System.out.print("Frase reescrita: ");
		for (String palavra : palavras) {
		    System.out.print(palavra + " ");
		}
		}
		else {
			System.out.println("Essa palavra não está na frase.");
		}
	}
}
