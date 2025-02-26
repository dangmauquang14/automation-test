package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CheckboxExercise {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("(//input[@id='checkBoxOption1'])[1]")).click();
        System.out.println(driver.findElement(By.xpath("(//input[@id='checkBoxOption1'])[1]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@id='checkBoxOption1'])[1]")).isSelected());
        driver.findElement(By.xpath("(//input[@id='checkBoxOption1'])[1]")).click();
        System.out.println(driver.findElement(By.xpath("(//input[@id='checkBoxOption1'])[1]")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@id='checkBoxOption1'])[1]")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
        driver.quit();
    }
}
