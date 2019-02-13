package demo.jenkins;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsDemo1 {

@Test	
public void testDemo()
{
System.out.println("Hello Github");
 
//using on the chrome browser
File file = new File("./Drivers/chromedriver.exe");
System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

WebDriver driver = new ChromeDriver();
driver.get("https://learn-automation.com/");
Assert.assertTrue(driver.getTitle().contains("Selenium"));

driver.quit();

}
	
}
