import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter first number");
		int num1=scanner.nextInt();
		System.out.print("Enter second number");
		int num2=scanner.nextInt();
		basicCalculation(num1,num2);
	}

	public  static void  basicCalculation(int num1,int num2) {
		int result1=num1 + num2;
		System.out.println("Addition of two numbers ="+result1);
		int result2=num1 - num2;
		System.out.println("Subtraction of two numbers ="+result2);
		float result3=num1 / num2;
		System.out.println("Division of two numbers ="+result3);
		int result4=num1 * num2;
		System.out.println("Multiplication of two numbers="+result4);
	}
}
