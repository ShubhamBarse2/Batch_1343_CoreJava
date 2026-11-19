package Overriding_Ref_Code;

public class MainClass {

	public static void main(String[] args) {
//		Fb fb = new Fb();
//		System.out.println(fb.loginAuth("ram@gmail.com", "Ram@123"));
//		
//		Insta i = new Insta();
//		System.out.println(i.loginAuth("ramesh@gmail.com", "Ramesh@123"));

//		Meta m = new Fb();
//		m.loginAuth("asdfg", "asdfg");
//
//		Meta m1 = new Insta();
//		m1.loginAuth(null, null);

		Animal a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();

	}

}
