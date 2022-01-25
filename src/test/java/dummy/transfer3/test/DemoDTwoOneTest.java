package dummy.transfer3.test;

import org.testng.annotations.Test;

public class DemoDTwoOneTest {
	
	@Test(groups="Smoke")
	public void dummyOne() {
		System.out.println("Dummy1-Project two");
	}
	
	@Test(groups="Regression")
	public void dummyTwo() {
		System.out.println("Dummy2 - project two");
	}

}
