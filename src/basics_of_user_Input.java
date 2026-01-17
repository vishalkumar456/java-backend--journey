package Basics_of_java;
import java.util.Scanner;

public class basics_of_user_Input {

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		System.out.print("ENTER YOUR NAME:");
		String name = input.nextLine();
		System.out.println("Good Morning!" +name);
		System.out.print(name + ",Enter you age:");
		int age= input.nextInt();
		System.out.println("your age is: " + age);
		input.close();
	}

}
