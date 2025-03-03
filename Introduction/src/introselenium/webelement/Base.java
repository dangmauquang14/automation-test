package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Base {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Danh sách các sản phẩm cần thêm vào giỏ hàng
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        // Mở trang web
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        // Đợi trang load xong
        Thread.sleep(3000);

        // Gọi hàm thêm sản phẩm vào giỏ hàng
        addItems(driver, itemsNeeded);
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;

        // Lấy danh sách tất cả sản phẩm trên trang
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            // Lấy tên sản phẩm, ví dụ: "Brocolli - 1 Kg"
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim(); // Lấy tên sản phẩm mà không có đơn vị tính

            // Chuyển danh sách itemsNeeded thành List để tìm kiếm dễ dàng
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            // Kiểm tra nếu sản phẩm có trong danh sách cần mua
            if (itemsNeededList.contains(formattedName)) {
                j++;

                // Click vào nút "Add to cart"
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                // Nếu đã thêm đủ số lượng sản phẩm mong muốn thì thoát vòng lặp
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
