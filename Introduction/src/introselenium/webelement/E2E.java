package introselenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class E2E {
    public static void main(String[] args) throws InterruptedException {
        // Cấu hình WebDriver cho Chrome
        WebDriver driver = new FirefoxDriver();

        // Mở trang web
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Chọn chế độ "One Way Trip"
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        // Chọn điểm đi (Departure)
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);

        // Chọn điểm đến (Destination)
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        // Chọn ngày hiện tại trên lịch
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

        // Kiểm tra xem element Div1 có bị disable không
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("It's disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        // Chọn tùy chọn giảm giá cho người cao tuổi
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        // Chọn số lượng hành khách
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        // Kiểm tra xem số hành khách đã được cập nhật đúng không
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option[3]")).click();

        // Nhấn nút tìm kiếm chuyến bay
        driver.findElement(By.cssSelector("input[value='Search']")).click();
    }
}
