//Write code that uses the ‘SecureRandom’ class to generate a sequence of 10 random integers and display them.
package exercises;

import java.security.SecureRandom;

public class Ex9 {

	public static void main(String[] args) {
		SecureRandom secureRandom = new SecureRandom();
		
		for(int i=0; i<10; i++) {
			int numero = secureRandom.nextInt();
			System.out.print("| "+numero+" |");
		}
	}
}
