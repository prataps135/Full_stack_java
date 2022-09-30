package OOPs_with_data_structures;

import java.util.Scanner;

public class QuizProgramV2 {
	public static void main(String[] args) {
		int n;
		
		while(true) {
		System.out.println("Who found the Blue Origin?");
		System.out.println("1.Bill Gates\n2.Tim Cook\n3.Nadella\n4.Jeff Bezos\n5.Exit program");
		System.out.println("Enter your choice(1/2/3/4/5) = ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if (n==4)
		{
			System.out.println("Congratulations you got it.");
			break;
		}
		else if(n==5)
		{
			break;
		}
		else
		{
			System.out.println("Wrong answer");
		}
	}
	}
}
