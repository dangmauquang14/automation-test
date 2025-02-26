package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UIAssignment {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
//        driver.findElement(By.cssSelector("input[class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Quang");
        driver.findElement(By.name("email")).sendKeys("dangmauquang@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Quang123");
        driver.findElement(By.cssSelector("#exampleCheck1")).click();
        driver.findElement(By.cssSelector("#inlineRadio1")).click();
        driver.close();
    }
}
