package OOPs_with_data_structures;

public class ExceptionHandling {
	public static void main(String args[]) {
		System.out.println("Exception Handling starts from here...");
		
		try {
			//unconnection below will throw ArithmeticException
			//int num = 20/0;
			int arr[] = {10,20,40,50,60};
			//unconnection below will throw ArrayIndexOutOfBoundsExecption
			//System.out.println(arr[10]);
			String str = null;
			//uncoonection below will throw NullPointerException
			System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator should not divide by 0...");
			System.out.println("Error: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("User is trying to access index location outside the array boundary.");
			System.out.println("Error: "+e);
		}
		catch(NullPointerException e) {
			System.out.println("User is trying to perform operation on null value.");
			System.out.println("Error: "+e);
		}
		finally {
			System.out.println("This Block is always executes.....");
		}
		System.out.println("Exception Handling ends here...");
	}
}
