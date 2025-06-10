//6.Write a program that generates a random 10-character password, combining
//uppercase, lowercase letters, and numbers.
package exercises;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		Random random = new Random();
		String password = "";
		int numero=0;
		
		for(int i=0; i<11; i++) {
		if(i<3) {
		password += random.nextInt(9); //parte numérica
		}
		else if (i<6) {
		numero = 65 + random.nextInt(26); //gero um número entre 65-90
        char letra = (char) numero; // converto pra ascii
        password += letra; //adiciono ele na string
		}
		else if(i>6) {
		numero = 97 + random.nextInt(26); //gero um número entre 65-90
	    char letra = (char) numero; // converto pra ascii
	    password += letra; //adiciono ele na string
		}
		}
		
		System.out.println("Senha: "+password);
	}
}
