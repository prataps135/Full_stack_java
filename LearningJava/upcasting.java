package LearningJava;

class A{
	public void methodA(){
		System.out.println("In class A");
	}
}

class B extends A{
	public void methodA(){
		System.out.println("In class B");
	}
}
public class upcasting {
	public static void main(String args[]) {
		B objB = new B();
		A objA = new B();
		objA.methodA();
	}
}
