package Abstraction_Using_Interface;

public class Son implements Father, Mother {

	@Override
	public void cook() {
		System.out.println("F M cook method ");
	}

	public static void main(String[] args) {
		Father s = new Son();
		s.cook();
		Mother m = new Son();
		m.cook();
	}
}
