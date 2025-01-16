package day1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String operation = sc.next();
		
		switch(operation) {
			case "+":
				System.out.println("Addition of two number " +  num1 + " and " + num2 + " is : " + (num1 + num2));
				break;
			case "-":
				System.out.println("Addition of two number " +  num1 + " and " + num2 + " is : " + (num1 - num2));
				break;
			case "*":
				System.out.println("Addition of two number " +  num1 + " and " + num2 + " is : " + (num1 * num2));
				break;
			case "/":
				System.out.println("Addition of two number " +  num1 + " and " + num2 + " is : " + (num1 / num2));
				break;
			default:
				System.out.println("Invalid Operations");
		}
		
		int []nums = new int[5];
		for(int i = 0;i < nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		
		sc.close();
	}

}
