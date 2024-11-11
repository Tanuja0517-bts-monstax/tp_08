package dummyPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop_Test {
	@Test
	public void loginToApp_Test() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
