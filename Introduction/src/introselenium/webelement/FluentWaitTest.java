package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitTest {

    public static void main(String[] args) {
        // Khởi tạo trình duyệt Chrome
        WebDriver driver = new FirefoxDriver();

        // Mở trang web
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Nhấn vào nút "Start" để bắt đầu tải nội dung động
        driver.findElement(By.cssSelector("[id='start'] button")).click();

        // Thiết lập FluentWait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Thời gian chờ tối đa 30 giây
                .pollingEvery(Duration.ofSeconds(3))  // Cứ mỗi 3 giây kiểm tra điều kiện một lần
                .ignoring(NoSuchElementException.class);  // Bỏ qua ngoại lệ nếu phần tử chưa xuất hiện

        // Chờ đợi phần tử xuất hiện và lấy nội dung
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.cssSelector("[id='finish'] h4"));
                if (element.isDisplayed()) {
                    return element;
                }
                return null;
            }
        });

        // In ra nội dung của phần tử sau khi đã load xong
        System.out.println(foo.getText());

        // Đóng trình duyệt
        driver.quit();
    }
}
