package Overriding_Ref_Code;

public  class Parent {

	public Parent() {
		System.out.println("Constr parent");
	}

	public final int m1() {
		return 3;
	}
	public int m1(int a) {
		return 3;
	}
}
