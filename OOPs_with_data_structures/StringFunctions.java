package OOPs_with_data_structures;

public class StringFunctions {
	public static void main(String[] args) {
		String var1 ="string functions program";
		String var2 ="string functions";
		
		//Commonly used string function
		System.out.println("String functions are = ");
		
		//getting character of specific position
		System.out.println(var1.charAt(3));
		
		//Getting unicode of character at specific position
		System.out.println(var1.codePointAt(3));
		
		//Getting unicode of character before the specific index
		System.out.println(var1.codePointBefore(3));
		
		//counting number of unicode characters between the indexed values
		System.out.println(var1.codePointCount(0, 5));
		
		System.out.println("String comparion functions :- ");
		//compare two strings lexicographically
		System.out.println(var1.compareTo(var2));
		
		//compare two strings lexicographically ignoring the case
		System.out.println(var1.compareToIgnoreCase(var2));
		
		//Appends the strings
		System.out.println("Concatenated functions");
		System.out.println(var1.concat(var2));
		
		//checks whether the string contains another string
		System.out.println(var1.contains(var2));
		
		//checks whether the string ends with specific characters
		System.out.println(var1.endsWith("gram"));
		
		//compare and return true if the strings are equals 
		System.out.println(var1.equals(var2));
		
		//compare and return true if the strings are equals ignoring the case
		System.out.println(var1.equalsIgnoreCase(var2));
		
		//hash code of the string
		System.out.println(var1.hashCode());
		
		//gets position of first occurrence of specific character
		System.out.println(var1.indexOf("program"));
		
		//checks if string are empty
		System.out.println(var1.isEmpty());
		
		//gets position of the last occurrence of specific characters
		System.out.println("\nLast occurrence position");
		System.out.println(var1.lastIndexOf("function"));
		
		//gets the length of the string
		System.out.println(var1.length());
		
		//search string for a specific values and replace with it
		String var3 ="functions of functions";
		System.out.println(var3.replace("functions", "java"));
		
		//checks the string start with given string
		System.out.println(var1.startsWith("string"));
		
		//convert string to lower case
		String var4 ="JAVA";
		System.out.println(var4.toLowerCase());
		
		//convert string to upper case
		System.out.println(var1.toUpperCase());
		
		//trims space before and after the string
		String var5 = "		JAVA	";
		System.out.println(var5);
		System.out.println(var5.trim());
		
	}
}
