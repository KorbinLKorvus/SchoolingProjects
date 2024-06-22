package week3;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String[] students = new String[3];
		
		// to acccess the elements in array
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";	
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		// when you loop an array, you don't need to sysout multiple times
		// use i instead of number to print out the list of names, not the individual name
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("Enhanced for loop:");
		//an enhanced for loop allows us to print out every element in an array, will be a different variable declaration than that in the original loop
		for (String student : students) {
			//"for each student -- in ":" -- my students array students, what do I want to do?
			System.out.println(student);
		}
		
		
	}

}
