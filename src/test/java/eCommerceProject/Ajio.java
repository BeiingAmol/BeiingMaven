package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Openning ajio", true);
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.ajio.com/");
	 // Assert.fail();
	  Thread.sleep(5000);
	  driver.close();
  }
}
