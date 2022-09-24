package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //Amazon sayfasindaki tag'lari  Link(a) olanlarin sayisini yazdirin
        List<WebElement> tag =driver.findElements(By.tagName("a"));
        System.out.println("a Taglarinin sayisi :"+tag.size());

    }
}
