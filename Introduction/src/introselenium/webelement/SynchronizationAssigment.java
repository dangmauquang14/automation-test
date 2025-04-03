package introselenium.webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationAssigment {
    public static void main(String[] args) throws InterruptedException {
        // Khởi tạo WebDriver
        WebDriver driver = new ChromeDriver();

        // Mở trang web
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Nhập thông tin đăng nhập
        driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");

        // Chọn radio button thứ hai
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

        // Khởi tạo WebDriverWait để chờ phần tử xuất hiện
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

        // Nhấn vào nút "OK"
        driver.findElement(By.id("okayBtn")).click();

        // Chọn giá trị từ dropdown
        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(options);
        dropdown.selectByValue("consult");

        // Nhấn nút đăng nhập
        driver.findElement(By.id("signInBtn")).click();

        // Chờ cho đến khi nút "Checkout" hiển thị
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

        // Lấy danh sách các sản phẩm và thêm tất cả vào giỏ hàng
        List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for (WebElement product : products) {
            product.click();
        }

        // Nhấn vào nút "Checkout"
        driver.findElement(By.partialLinkText("Checkout")).click();

        // Đóng trình duyệt sau khi hoàn thành (tùy chọn)
        driver.quit();
    }
}