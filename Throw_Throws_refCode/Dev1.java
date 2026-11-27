package Throw_Throws_refCode;

public class Dev1 {

	public void m1() throws ClassNotFoundException, InterruptedException {
		Class.forName("Db Connection Class");
		System.out.println("Class loaded Successfully ...!");

		Thread.sleep(null);
	}

}
