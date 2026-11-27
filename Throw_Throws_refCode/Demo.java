package Throw_Throws_refCode;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

//		System.out.println("start");
//		System.out.println(2 / 2);
//		System.out.println(4 / 2);
//		System.out.println(6 / 2);
//		try {
//			System.out.println(9 / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("divide by zero not possible .... !");
//		}
//		System.out.println(10 / 5);
//		System.out.println(12 / 4);
//		System.out.println("End");

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter ur age ");
//		int age = sc.nextInt();
//
//		System.out.println(age);
//		
//	}

		try {
			System.out.println(1/0);
//			System.out.println("Class Loaded Successfully ...!");
		} catch (Throwable e) {
			System.out.println("Class No Found pass valid class ");
		}

//		String name = "Shubham barse";
//		System.out.println(name.length());
//		System.out.println(name.charAt(133));

//		VirtualMachineError

	}
}
