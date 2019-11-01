package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	WebDriver driver;
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://www.riskwizard.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  
  @Test
  public void verifyaddbook() {

  }
  
  @AfterMethod
  public void close(){
	  driver.close();
	  
  }
}


  
  