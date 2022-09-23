package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        // driver.navigate().to() methodu broeser da sayfayı ileri geri almak için kullanılır
        // aydı zaman da driver.get() methodu gibi web sayfasına götürür.
        driver.navigate().to("http://www.techproeducation.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.close();

    }
}
