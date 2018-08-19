package testing.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Judu\\Desktop\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	 WebDriver d= new FirefoxDriver();
	 d.get("https://www.google.com");
	 d.close();
	 
  }
}
