package dummy.transfer2.test;

import org.testng.annotations.Test;

public class DummySampleTest {
	@Test(groups="Smoke")
	public void sampleOneTest() {
		System.out.println("sample 1 - Project one");;
	}
	
	@Test(groups="Regression")
	public void sampleTwo() {
		System.out.println("sample 2 - Project one");
	}

}
