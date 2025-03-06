package introselenium.ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Điều hướng đến trang web
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        // Nhấp vào phần tử có class 'blinkingText' để mở cửa sổ mới
        driver.findElement(By.cssSelector(".blinkingText")).click();

        // Lấy danh sách tất cả cửa sổ đang mở
        Set<String> windows = driver.getWindowHandles(); // [parentid, childid, subchildId]

        // Duyệt qua danh sách các cửa sổ bằng Iterator
        Iterator<String> it = windows.iterator();
        String parentId = it.next(); // Lấy ID của cửa sổ cha
        String childId = it.next();  // Lấy ID của cửa sổ con

        // Chuyển hướng WebDriver sang cửa sổ con
        driver.switchTo().window(childId);

        // Lấy và in ra nội dung văn bản của phần tử có class '.im-para.red'
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

        // Trích xuất email từ đoạn văn bản
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText()
                .split("at")[1] // Tách chuỗi tại "at"
                .trim()         // Xóa khoảng trắng đầu và cuối
                .split(" ")[0]; // Lấy phần đầu tiên của chuỗi còn lại (email)

        // Quay lại cửa sổ cha
        driver.switchTo().window(parentId);

        // Nhập email vào ô có id 'username'
        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
