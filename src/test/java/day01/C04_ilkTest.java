package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ilkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //amazon sayfasının baslıgının "Amazon" icerdigini test ediniz
        String actualtitle= driver.getTitle();
        String istenenKelime="Amazon";
        if(actualtitle.contains(istenenKelime)) {
            System.out.println("Title Amazon testi PASSED");
        }else System.out.println("Title Amazon testi FAILED");
        //Url nin amazon icerdigini test ediniz
        String actualurl= driver.getCurrentUrl();
        String arananKelime="amazon";
        if(actualurl.contains(arananKelime)) {
            System.out.println("ActualUrl testi PASSED");
        }else System.out.println("ActualUrl testi FAILED");
        //sayfayı kapatınız
        driver.close();
    }
}
