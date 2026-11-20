package Abstraction_Using_Interface;

public class Goolge implements LogAuth {

	@Override
	public void login(String username, String password) {
		if (username == "shyam@gmail.com" && password == "Shyam@123") {
			System.out.println("Google Login succeessfully ... ! ");
		} else {
			System.err.println("Invalid Credentials...");
		}
	}
}
