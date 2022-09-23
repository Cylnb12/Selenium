package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowsHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());//gidilen sayfanın has kodunu verir her yeni sayfanın has kodu farklıdır
        //dolayısıyla sayfalarda gezinme yapmak icin kullanılır.

    }
}
