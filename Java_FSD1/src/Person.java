
public class Person {
	int age = 10;
	float wieght = 60.4f;
	double wieght1 = 50.23;
	boolean isHUman = true;
	String name = "Sudha";
	
	void print() {
		System.out.println(age);
	}
	
	public static void main(String args[]) {
		Person objPer = new Person();
		objPer.print();
		int x = 10;
		int y = 10;
		x  = x+5;
		x+=5;
		System.out.println(x);
		System.out.println(x>=y);
		
		System.out.println((x<10)?"more":"less");
	}
}
