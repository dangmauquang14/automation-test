package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import oop.BaseTest;

public class Locators extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		setUp();
//		driver.manage().window().maximize();
//		tearDown();
		long startTime = System.nanoTime();

		WebDriver driver = new FirefoxDriver();
		// Đợi overlay biến mất
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.)
	    
		long endTime = System.nanoTime();
		double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
		System.out.println("Elapsed time: " + elapsedTimeInSeconds + " seconds");
	}  
}