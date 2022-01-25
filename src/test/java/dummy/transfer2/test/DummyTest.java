package dummy.transfer2.test;

import org.testng.annotations.Test;

public class DummyTest {
	@Test(groups="Smoke")
	public void dummyOne() {
		System.out.println("Dummy1-Project one");
	}
	
	@Test(groups="Regression")
	public void dummyTwo() {
		System.out.println("Dummy2 - project one");
	}

}
