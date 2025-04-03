package introselenium.webelement;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Khởi tạo WebDriverWait với thời gian chờ tối đa là 5 giây
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Danh sách các sản phẩm cần mua
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        // Mở trang web
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000); // Đợi 3 giây để trang load

        // Gọi hàm để thêm sản phẩm vào giỏ hàng
        addItems(driver, itemsNeeded);

        // Mở giỏ hàng
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();

        // Nhấn nút "PROCEED TO CHECKOUT"
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        // Chờ đến khi ô nhập mã giảm giá xuất hiện
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        // Nhập mã giảm giá
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        // Nhấn nút "Apply"
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        // Chờ đến khi kết quả áp dụng mã giảm giá hiển thị
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        // In ra kết quả thông báo mã giảm giá
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

        // Đóng trình duyệt
        driver.quit();
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;

        // Lấy danh sách tất cả sản phẩm hiển thị trên trang
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        // Duyệt qua danh sách sản phẩm
        for (int i = 0; i < products.size(); i++) {
            // Lấy tên sản phẩm, format để lấy đúng tên (bỏ phần số lượng)
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            // Chuyển danh sách sản phẩm cần mua thành danh sách để tìm kiếm nhanh hơn
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            // Nếu sản phẩm có trong danh sách cần mua
            if (itemsNeededList.contains(formattedName)) {
                j++;

                // Click nút "Add to cart"
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                // Nếu đã thêm đủ tất cả sản phẩm cần thiết thì thoát khỏi vòng lặp
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
