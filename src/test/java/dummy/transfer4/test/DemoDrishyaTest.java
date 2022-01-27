package dummy.transfer4.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoDrishyaTest {
	@Test(groups="Smoke")
	public void createOrgaTest()
	{

		String browser = System.getProperty("BROWSER");
		String url=System.getProperty("URL");
		System.out.println("create organization");		
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.navigate().back();
		driver.close(); 
		/*System.out.println("excute create organization test "+System.getProperty("browser"));*/
	}

	@Test(groups="Regression")
	public void modifyOrgaTest()
	{
		System.out.println(" modify  organization2");
	}

}
