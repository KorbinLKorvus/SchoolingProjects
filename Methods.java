package week3;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//methods are used in order to modular-ise code in order to reuse it by just referring to the name of it
	//String firstName = "Bob";
	//String lastName = "Ross";
	//String fullName = createFullName(firstName, lastName);
	//String fullName2 = createFullName("Sam", lastName);
	
	//System.out.println(fullName);
	//System.out.println(fullName2);
		// now part of method 2
	int [] myArray = new int[3];
	myArray[0] = 7;
	myArray[1] = 10;
	myArray[2] = 8;
	
	//int sum = sumArray(myArray);
	System.out.println(sumArray(myArray));
	
	double[] grades = new double[5];
	grades[0] = 88.7;
	grades[1] = 92.5;
	grades[2] = 100;
	grades[3] = 67.3;
	grades[4] = 78.9;
	
	System.out.println(calculateAverage(grades));
	System.out.println(multiplyString("Hello", 3));
	//or can be written as just system.out.println(sumArray(myArray)) as well
	//String [] strings = new String[1];
	//strings[0] = "test";
	//sumArray(Strings); -- wouldn't work because the array is set up for int not string variables
	
	}
//public static's are access modifiers. when you make a method you have to point out a few things on how that method works.
	//public static String createFullName(String x, String y) {
// ^ deals with accessibility, String (position) is the return type (what kind of data will it return), not all methods have to return something. If it doesn't, the type is called void
		//the next peace is called the name of the method (createFullName - similar to a variable - the name should be a verb. the () can be blank or have parameters - input the method takes in order to do something with it
		//the parameters are first string/second string in this example (doens't have to be string), separated/dilleanated by a comma.
			//return x + " " + y;
		//when you write a method, nothing may happen because when you declare a method it doesn't do anything. 
		//it's like writing instructions, you can write how to clean, doesn't mean things are clean. you have to call/invoke the method into action
	
	
	//METHOD 2 VIDEO -- 
	//takes an array of ints and returns the sum of all the ints
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	//takes an array of double and returns the average of all elements in the array
	
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length; 
	}
	
	//takes a string and int and returns the string concatenated with itself int number of times 
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for ( int i = 0; i < num; i++) {
			result += str;
			//remember += = result + str
		}
		return result;
	}
	
	}
	

