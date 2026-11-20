package Abstraction_Using_Interface;

public class Insta implements LogAuth {

	@Override
	public void login(String username, String password) {

		if (username == "ram@gmail.com" && password == "Ram@123") {
			System.out.println("Insta Login succeessfully ... ! ");
		} else {
			System.err.println("Invalid Credentials...");
		}

	}

}
