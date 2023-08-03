package ecom_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
  @Test
  public void flipcarttest(){
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening cromebrowser", true);
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	 // Reporter.("opening Amazon");
	  driver.quit();
	  }
}
