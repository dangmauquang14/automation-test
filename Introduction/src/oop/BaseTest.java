package oop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    static WebDriver driver;

    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        driver.quit();
    }
}