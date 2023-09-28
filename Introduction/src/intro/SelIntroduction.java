package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome - ChromeDriver exten->Methods close get
		// Firefox- FirefoxDriver ->methods close get
		// WebDriver  close  get
		// WebDriver methods + class methods
		
		// Chrome
//		ChromeOptions option=new ChromeOptions();
//		option.setPageLoadStrategy(PageLoadStrategy.NONE);
//		System.setProperty("webdriver.chrome.driver", "/Users/ttcenter/Study/Automation-Test/chromedriver-mac-arm64/chromedriver");
//		WebDriver driver = new ChromeDriver();

		// Firefox
//		System.setProperty("webdriver.gecko.driver", "/Users/ttcenter/Study/Automation-Test/geckodriver");
//		WebDriver driver1 = new FirefoxDriver();

		// Microsoft Edge
//		System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//		WebDriver driver2 = new EdgeDriver();
		
		// Safari
		WebDriver driver = new SafariDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}
}
