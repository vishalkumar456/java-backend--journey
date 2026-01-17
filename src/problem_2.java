package java_challenging_problems;
import java.util.Scanner;
public class problem_2 {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		System.out.println();
		 System.out.println("WELCOME TO MY FIRST JAVA CALCULATOR");
		System.out.print("ENTER THE VALUE OF a= ");
		int a= input.nextInt();
		System.out.print("ENTER THE VALE OF b= ");
		int b= input.nextInt();
		int sum=a+b;
		
		System.out.print("SUM OF a and b= " +sum);
		 
		input.close();
		

	}

}
