package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Kiểm tra checkbox "Senior Citizen Discount" chưa được chọn
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Click vào checkbox "Senior Citizen Discount"
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        // In ra trạng thái checkbox
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Kiểm tra lại checkbox đã được chọn
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Mở dropdown chọn số lượng hành khách
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        // Click 4 lần để tăng số lượng hành khách (người lớn)
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // Đóng popup chọn số lượng hành khách
        driver.findElement(By.id("btnclosepaxoption")).click();

        // In ra số lượng hành khách đã chọn
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
