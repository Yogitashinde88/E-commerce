package ecom_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ebay {
  @Test
  public void ebaytest(){
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening cromebrowser", true);
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	 
	  driver.quit();
	  }
}
