package OOPs_with_data_structures;

import java.util.Scanner;
public class DisplayingContent {
	public static void main(String[] args) {
		//Factorial of given number
		//3! 1*2*3
		
		int num;
		int Fact_var=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		num = sc.nextInt();
		
		/*for(int i=1;i<=num;i++)
		{
			Fact_var*=i;
		}
		*/
		int i=1;
		while(i<=num) {
			Fact_var *=i;
			i++;
		}
		System.out.println("Factorial of number "+num+" is "+Fact_var);
		
	}
}
