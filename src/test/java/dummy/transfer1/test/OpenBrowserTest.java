package dummy.transfer1.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest {
	@Test(groups="Smoke")
	public void openBrowser() {
		
		System.out.println("Getting data from cmd");
		String brw = System.getProperty("BROWSER");
		String url = System.getProperty("URL");
		WebDriver driver=null;
		if (brw.equals("chrome")) {
			driver=new ChromeDriver();
		}else if (brw.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.navigate().back();
		driver.close();		
	}
	
	@Test(groups="Regression")
	public void navigateBrowser() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.navigate().refresh();
		driver.get("http://localhost:8888");
		driver.close();	
		
	}

}
