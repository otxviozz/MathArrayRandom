//Write a program that splits a sentence into words based on a delimiter (e.g. comma) and displays each word on a new line.
package exercises;

public class Ex17 {

	public static void main(String[] args) {
		String txt = "São Paulo,Palmeiras,Coritiba";
		
		for(String s : txt.split(",")) {
		System.out.println(s);
		}
	}

}
