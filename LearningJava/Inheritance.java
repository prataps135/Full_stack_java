package LearningJava;

//Single level inheritance
class parentClass{
	//Declare instance method
	public void methodA() {
		System.out.println("Parent class called.");
	}
}
class childClass extends parentClass{
	public void methodB() {
		System.out.println("Child class called.");
	}
}
/*public class Inheritance {
	public static void main(String args[]) {
		childClass obj = new childClass();
		obj.methodA();
		obj.methodB();
	}

}*/

class childOne extends childClass{
	public void methodC() {
	System.out.println("ChildOne called.");
	}
}
public class Inheritance{
	public static void main(String agrs[]) {
		childOne obj = new childOne();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}
