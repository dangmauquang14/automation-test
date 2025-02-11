package com.qa.testcase;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.setProperty("webdriver.gecko.driver", "/Users/ttcenter/.cache/selenium/geckodriver/mac-arm64/0.35.0/geckodriver");
//
//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
//
//        FirefoxDriver driver = new FirefoxDriver(options);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/");
//		Thread.sleep(1500);
//		driver.quit();
	}

}
