package Throw_Throws_refCode;

public class Dev2 {

	public void m2() throws InterruptedException {
		Dev1 d = new Dev1();
		try {
			d.m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
