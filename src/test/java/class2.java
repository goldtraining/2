import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class class2 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Profile class!!!");
	  Thread.sleep(5000);
	  driver.quit();
  }


@Test
public void f1() throws InterruptedException, MalformedURLException {
	  
	  DesiredCapabilities DC = new DesiredCapabilities();
	  DC.setBrowserName("chrome");
	  WebDriver driver = new RemoteWebDriver (new URL( "http://localhost:4444/wd/hub/" ), DC);
	  System.out.println("Profile class!!!");
	  Thread.sleep(5000);
	  driver.quit();
}
}

