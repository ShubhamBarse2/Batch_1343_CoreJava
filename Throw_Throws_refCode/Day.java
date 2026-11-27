package Throw_Throws_refCode;

public class Day {

	public static void main(String[] args) {

//		int a = 5, b = 0;
//		
//		if (b == 0) {
//          throw new DivideByZero("divide by zero(ex --> 2/0) is not possible in java ");
//		}
//		System.out.println(a/b);
//		
		
		try {
			String name = "java.lang.String";
			if(name =="java.lang.String") {
			throw new NotValidClass("this is not found by JVM");
			}
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
