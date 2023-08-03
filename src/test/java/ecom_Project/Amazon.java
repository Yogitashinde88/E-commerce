package ecom_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazontest(){
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opening cromebrowser", true);
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  
	  driver.quit();
	  }
}
