package introselenium.webelement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        // Khởi tạo WebDriver
        WebDriver driver = new FirefoxDriver();
        // Mở trang web
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // Nhập "ind" vào ô tìm kiếm
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        // Chờ để danh sách gợi ý hiển thị
        Thread.sleep(3000);
        // Lấy danh sách các gợi ý
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        // Duyệt qua danh sách và chọn "India"
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }
        // Đóng trình duyệt
        driver.quit();
    }
}
