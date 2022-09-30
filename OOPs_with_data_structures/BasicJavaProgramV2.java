package OOPs_with_data_structures;

import java.util.Scanner;
public class BasicJavaProgramV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter your first number = ");
		num1 = sc.nextInt();
		System.out.println("Enter your second number = ");
		num2 = sc.nextInt();
        System.out.println("Arihtematic operation on numbers are = ");
		
		System.out.println("Addition of numbers is = "+(num1+num2));
		System.out.println("Subtraction of numbers is = "+(num1-num2));
		System.out.println("Multiplication of numbers is = "+(num1*num2));
		System.out.println("Division of numbers is = "+(num1/num2));
		System.out.println("Modulus of numbers is = "+(num1%num2));
	}
}
