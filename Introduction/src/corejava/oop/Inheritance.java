package corejava.oop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Inheritance extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Giải thích: Class LoginTest kế thừa từ BaseTest, có thể sử dụng các phương thức setUp()
		// và tearDown() mà không cần viết lại.
		setUp();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahu!");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		tearDown();
	}
}