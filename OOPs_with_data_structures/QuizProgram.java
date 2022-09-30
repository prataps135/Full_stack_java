package OOPs_with_data_structures;

import java.util.Scanner;
public class QuizProgram {
	public static void main(String[] args) {
		int n;
		
		System.out.println("Who found the Blue Origin?");
		System.out.println("1.Bill Gates\n2.Tim Cook\n3.Nadella\n4.Jeff Bezos");
		System.out.println("Enter your choice(1/2/3/4) = ");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if (n==4)
		{
			System.out.println("Congratulations you got it.");
		}
		else
		{
			System.out.println("Wrong answer");
		}
	}
}
