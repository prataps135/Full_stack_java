package OOPs_with_data_structures;

import java.util.*;
import java.util.function.*;

class MyConsumer<T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the number "+ ctask);
		System.out.println("Result after adding 5 in number is: "+((int)ctask+5));
	}
}
public class UtilityPackage {
	public static void main(String[] args) {
		ArrayList myList;
		
		MyConsumer mcons;
		
		myList = new ArrayList<>(5);
		
		mcons = new MyConsumer();
		
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(400);
		myList.add(500);
		
		myList.forEach(mcons);
	}

}
