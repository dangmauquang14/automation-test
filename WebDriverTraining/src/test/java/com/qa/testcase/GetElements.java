package com.qa.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

public class GetElements {
    WebDriver driver;

    @Test
    public void testGetElements() {
        // Set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize the WebDriver
        driver = new ChromeDriver();
        
        // Navigate to the specified URL
		driver.get("https://rahulshettyacademy.com/");
        
        // Get element by ID
        driver.findElement(By.id("username"));
        
        // Add any additional actions or assertions here
        
        // Close the driver
        driver.quit();
    }
}