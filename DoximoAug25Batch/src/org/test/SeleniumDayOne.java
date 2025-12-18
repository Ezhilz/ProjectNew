package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayOne {

	public static void main(String[] args) throws InterruptedException {
		//Browser configuration
		System.setProperty("webdriver.chrome.driver", "F:\\Doximo25Aug\\chromedriver-win64\\chromedriver.exe");

		//Launch browser-Chrome
		WebDriver driver=new ChromeDriver();  //ctrl+shift+o
		
		//To maximize window
				driver.manage().window().maximize();
		
		//To open the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//To wait for 2 seconds
		Thread.sleep(2000);
		
		
		WebElement txtUser = driver.findElement(By.className("oxd-input"));
		txtUser.sendKeys("Admin");
		
		WebElement txtPass = driver.findElement(By.name("password"));
		txtPass.sendKeys("admin123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		Thread.sleep(2000);
		
		WebElement css = driver.findElement(By.cssSelector("li[class='oxd-userdropdown']"));
		css.click();
		Thread.sleep(2000);
		WebElement tag = driver.findElement(By.tagName("a"));
		tag.click();
		
		WebElement linkText = driver.findElement(By.linkText("Book a Free Demo"));
		linkText.click();
		
		WebElement partLink = driver.findElement(By.partialLinkText("Contact"));
		partLink.click();
		
	}
	
}
