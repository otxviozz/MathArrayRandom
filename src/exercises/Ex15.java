//Create a program that checks whether a word or phrase is a palindrome (it reads the same way backwards, ignoring spaces and punctuation).
package exercises;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String invertido = ""; //crio a string que vai a palavra invertida
		String palavra =""; //cio a string que vai a palavra sem espaços
		
		System.out.print("Digite uma palavra: ");
		String palavrapura = scan.nextLine().trim().toLowerCase(); //salvo tudo sem espaço no fim e minusculo
		String[] frase = palavrapura.split(" "); //separo num array para tirar os espaços
		
		for(int i=0; i<frase.length; i++) {
		 palavra += frase[i]; // junto tudo sem espaços para comparar
		}
		
		for(int i=0; i<palavra.length();i++) { // guardo a palavra invertida
		 invertido += palavra.charAt(palavra.length() - 1 - i);
		}
		
		if(palavra .equalsIgnoreCase(invertido)) { //comparo
			System.out.println("Essa palavra/frase é palíndromo!");
			System.out.println("Palavra: "+palavrapura+".");
			System.out.println("Invertido: "+invertido+".");
		}
		else {
			System.out.println("Essa palavra/frase não é palíndromo!");
			System.out.println("Palavra: "+palavrapura+".");
			System.out.println("Invertido: "+invertido+".");
		}
		scan.close();
	}
}