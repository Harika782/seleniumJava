package day1test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frameworks {
	@Test
	public void Testgoogle() throws Exception{
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("filmemoji",Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println("add test");
		Thread.sleep(3000);
	}
		
	}

}
