package FirstPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;


public class Jaspreet {
	
	@Test
	
	public void testcase001() {
		
   System.setProperty("webdriver.chrome.driver","C:\\Users\\arman\\eclipse-workspace\\MavenOnePar\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.facebook.com");
	
	String actualTitle = driver.getTitle();
    System.out.println("the title is = "+actualTitle);
      
    org.testng.Assert.assertEquals(actualTitle,"Facebook - Log In or Sign Up");
    
    driver.close();
	
	}
	
}
