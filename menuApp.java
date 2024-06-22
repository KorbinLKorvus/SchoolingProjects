package week3;

import java.util.Scanner;

public class menuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add team member
		//view team member
		//view all team members
		//delete team member by position
		//delete all team members
		//-- this will be handled by an array -- team members will be strings (names)
		
		String[] team = new String [5];
		//to start we need an array, named team set to 5 members on the team
		
		Scanner s = new Scanner(System.in);
		//we need a way for user input (scanner), be sure to import scanner
		
		int decision = 0;
		//we need a way to store the user input
		
		//a while loop will keep the application running while the user hasn't exited, we set the exit option equal to -1
		//we will use a top down approach to implement methods
		while(decision != -1) {
			showMenu();
			//first we want the user to see menu
			decision = s.nextInt();
			//based on decision we want to do something, so we'll create a method that handles the decision differentiator.
			//performAction(decision);
			
		}
		
	}
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("3) Delete Member");
		System.out.println("4) Delete All Members");
	}
}
