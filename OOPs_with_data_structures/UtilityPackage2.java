package OOPs_with_data_structures;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UtilityPackage2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any sentence = ");
		String userString = sc.nextLine();
		//userString = userString.strip();
		
		StringTokenizer st = new StringTokenizer(userString," ");
		System.out.println(st);
		
		//loop to iterate ever each word in a string and identifying number of vowels in them
		System.out.println("\nVowel count for each word in given string are = ");
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("Processing words: "+ word);
			int vowelCount = 0;
			for(char c: word.toCharArray()) {
				c = Character.toLowerCase(c);
				if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
					vowelCount++;
				}
			}
			System.out.println("The word "+ word +" has "+ vowelCount+" vowels.");
		}
	}
}
