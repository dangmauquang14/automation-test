package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UIAssignment {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Quang");
        driver.findElement(By.name("email")).sendKeys("dangmauquang@gmail.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Quang123");
        driver.findElement(By.cssSelector("#exampleCheck1")).click();

//      Cach 1
//        Tìm phần tử select
//        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//
//        Dùng Select để chọn "Male"
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Male");

//      Cach 2 xpath
//        driver.findElement(By.id("exampleFormControlSelect1")).click();
//        driver.findElement(By.xpath("//option[text()='Male']")).click(); // xpath cach 1

//        driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[1]")).click(); // xpath cach 2

//      Cach 3 cssselector
        driver.findElement(By.cssSelector("#exampleFormControlSelect1 option:nth-child(1)"));

        driver.findElement(By.cssSelector("#inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();
//        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("31122023");
        driver.findElement(By.name("bday")).sendKeys("02-02-1992");
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
    }
}
