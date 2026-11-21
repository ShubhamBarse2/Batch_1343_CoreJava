package Abstraction_refcode_Abstract_class;

public abstract class Demo {
	
	String name;

	public Demo() {
		System.out.println("Cosntr of Demo abstract class ");
	}
	
	public void m1() {
		System.out.println("non abstract method");
	}
	
	public abstract void m2();
	
}
