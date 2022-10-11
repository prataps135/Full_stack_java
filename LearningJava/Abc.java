package LearningJava;

import java.util.Calendar;
import java.util.Date;
//import java.util.*;
public class Abc {
	/*static void minimum(int a[])
	{
		int value = a[0];
		int m;
		for(m =1; m<a.length; m++)
			if(value>a[m]);
			value = a[m];
		System.out.println(value);
	}
	public static void main(String[] args)
	{
		int x[] = {94,3,93,20};
		minimum(x);
	}*/
	
	/*static int add(int x, int y)
	{
		return x+y;
	}
	static int add(int x, int y, int z)
	{
		return x+y+z;
	}
	
	public static void main(String agrs[]) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
	}*/
	
	/*static int add(int x, int y)
	{
		return x+y;
	}
	static double add(double x,double y)
	{
		return x+y;
	}
	
	public static void main(String agrs[]) {
		Abc obj = new Abc();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10.10,20));
	}*/
	
	/*static void display(String...values)
	{
		System.out.println(values.hashCode());
	}
	public static void main(String args[])
	{
		display();
		display("my", "name", "is", "JAVA");
	}*/
	
	/*public static void main(String[] args) {
		int a []= {10,20,30,40,50};
		for(int x:a)
		{
			System.out.println(x);
		}
	}*/
	
	public static void main(String args[])
	{
		Date objDate = new Date();
		System.out.println(objDate);
		System.out.println(objDate.toString());
	}
	
}
