package week3;

public class Equality {
	
	public static void main(String[] args) {
	
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		//or written as System.out.println("equals() method: " + a.equals(b));
		//system says false because string a is not string b because they're different objects
		//we use a.equals(b) method (calling the equals method onto a (not b)) in order to compare if objects have the same values.
		//notice the == which recalls from memory (primitive value) is false, but with the .equal it compares object value making it true.
		//anytime you run a object with a method, the method is called the OPERATOR.
		int x = 5;
		int y = 5;
		
		//the == boolean system to declare if they are the same/equal to each other
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
		//system says true because the integer (primitive) value of x and y does equal 5 
		
		String c = new String("Hello");
		String d = c;
		
		//this will equate to true BECAUSE the value of d has been set to C "IN MEMORY!"
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
	}

}
