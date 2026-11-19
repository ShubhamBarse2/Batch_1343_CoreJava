package Overriding_Ref_Code;

public class Fb extends Meta {

	@Override
	public void loginAuth(String userName, String password) {
		System.out.println("Login through FB");
	}

}
