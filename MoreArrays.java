package week3;

public class MoreArrays {

	public static void main(String[] args) {
		// String -- element -- then name to declare an arrray of String types
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		//remember that arrays area always total number - 1 = last number of array (5 strings with an array of 0-4).
		// if we want to print each element in the array, we will use an enhanced for loop. while each element is a string, and each element is a string. So while we will call each element a product in products. 
		
		for (String product : products) {
			System.out.println("product: " + product);
		}
		//next is an array of integers -- names multiples of 3 and we set it equal to a new int array with 10 elements
		// we could type out manually the integers of 3, however, we know the mathematical increment of 3, so we will write a loop system
		
		int [] multiplesOf3 = new int[10]; 
		
		//for int i = 1 while i is less than or equal to our length array (multiple of 3.length), i++ to add until condition is met.
		//normally we would say i = 0, and then i < array.length, this time we start at 1 in order to use i as another factor in our product of multiples of 3. ex: each element i * 3: remember i starts at 1 all the way up to the length = each element in the array needs to be i - 1.
		
		for(int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i*3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		//now, an easier way to type this (when we use i - 1 things can get crazy) - lets use a different loop
		int[] multiplesOf5 = new int[10];
		
		//we get multiples of 5 here and we will start at 0, if we do instead "multiplesOf5 [i] = (i + 1) * 5;" we will start with 1 instead of 0 and get increments of 5-50 instead of 0-45.
		for(int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5 [i] = i * 5;  
			System.out.println(multiplesOf5[i]);
		}
	}

}
