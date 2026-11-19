package Overriding_Ref_Code;

public class Insta extends Meta {

	@Override
	public void loginAuth(String userName, String password) {
		System.out.println("Login throguh Insta");
	}
}
