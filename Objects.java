package week3;

import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type main difference is JUST a piece of data, nothing else (int age = 34 vs. String name = "sally mae") string is an object with methods
		int age = 34;
		//primitive data types are lower-cased -- objects are Capitols! like String vs. int
		String name = "Sally Mae";
		// String phoneNumber = new String("12324567891");
		System.out.println(name.length());
		//array's are objects, the ints inside are primitive data types
		
		System.out.println(name.charAt(6));
		//as an example of using a method with strings (to find what character at a specific index)
		//java doc will be a great resource to utilizing different data types
		
		Scanner s = new Scanner(System.in);
		//the "new" key word in order to create a new instance with that object. an object with the parenthesis is called the constructor
		//however, String is special. the declaration of the string looks like a primitive when you assign it a literal -- however you can assign it a "new String" with a new literal see line 11.
		//continued, however never use the "new String" type because it's not memory efficient, don't declare a string like that. this special syntax is used so you don't have to use the "new" keyword.
		
		int[] numbers = new int [3];
		System.out.println(numbers.length);
		//on an array, length is a property not a method, so it doesn't not need the parenthesis.
		//however, it is not with a string, so it requires the parenthesis.
		//you can look up methods for a string by going to google java string (be aware of type/version and you can find all the variable types/methods for string
		
	}

}
