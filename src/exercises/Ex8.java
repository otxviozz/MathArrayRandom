//8.Create a program that simulates flipping a coin 50 times and counts how many times it came up heads and how many times it came up tails.
package exercises;

import java.util.Random;

public class Ex8 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] contagem = new int[2];
		
		System.out.println("Cara ou coroa 50 vezes!");
		
		for(int i=0; i<50; i++) {
			int jogada = random.nextInt(2);
			
			if(jogada==1) {
				contagem[0]+= 1;
			}
			
			else {
				contagem[1]+= 1;
			}
		}
		System.out.println("Virou cara "+contagem[0]+" vezes.");
		System.out.println("Virou coroa "+contagem[1]+" vezes.");
	}

}
