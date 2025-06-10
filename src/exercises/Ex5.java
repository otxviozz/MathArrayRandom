//5.Implement a code that simulates rolling a die (6 sides)
//100 times and counts the number of occurrences of each side.
package exercises;

import java.util.Random;

public class Ex5 {

	public static void main(String[] args) {
		Random random = new Random ();
		int numero= 0;
		int[] contagem = new int[6];
		
		System.out.println("Lançamento de dado!");
		
		for(int i=0; i<100; i++) {
			while(true) {
			numero= random.nextInt(6);
			if(numero!=0) {
				break;
			}
			}
			
			switch(numero) {
				case 1: 
				contagem[0]+= 1;
				break;

				case 2: 
				contagem[1]+= 1;
				break;
					
				case 3: 
				contagem[2]+= 1;
				break;
					
				case 4: 
				contagem[3]+= 1;
				break;
					
				case 5: 
				contagem[4]+= 1;
				break;
					
				case 6: 
				contagem[5]+= 1;
				break;
				}
		}
		for(int i=0; i<6; i++) {
			System.out.println("O dado caiu com o número "+(i+1)+" para cima "+contagem[i]+".");
		}
	}
}
