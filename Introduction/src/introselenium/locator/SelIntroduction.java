package introselenium.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome - ChromeDriver exten -> Methods close get
		// Firefox- FirefoxDriver -> methods close get
		// WebDriver close get
		// WebDriver methods + class methodsx

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
		
		// Safari
//		WebDriver driver1 = new SafariDriver();

//		WebDriver driver2 = new EdgeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Chạy trình duyệt ở chế độ không đầu
//        options.addArguments("--disable-gpu"); // Tắt GPU
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--disable-extensions"); // Tắt extension
//        options.addArguments("--disable-gpu"); // Tắt GPU để tiết kiệm tài nguyên
//        options.addArguments("--disable-dev-shm-usage"); // Giảm sử dụng bộ nhớ chia sẻ
//        options.addArguments("--no-sandbox"); // Tắt sandboxing
//        options.addArguments("--disable-web-security"); // Tắt bảo mật web
//        options.addArguments("--allow-running-insecure-content"); // Cho phép chạy nội dung không an toàn
		WebDriver driver = new ChromeDriver();

		// Bắt đầu đếm thời gian
		long startTime = System.nanoTime();

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// Kết thúc đếm thời gian
		long endTime = System.nanoTime();

		// Tính toán thời gian chạy và chuyển đổi sang giây
		double elapsedTimeInSeconds = (endTime - startTime) / 1_000_000_000.0;
		

		System.out.println("Elapsed time: " + elapsedTimeInSeconds + " seconds");
		driver.close();   
//		driver.quit();
	
	}
}
