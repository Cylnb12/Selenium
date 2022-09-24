package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ManegeMethotlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*İleri de wait konusunu daha genis olarak ele alacagiz
        bir sayfa açilirken ilk başta sayfanin icerisinde bulunan elenmentlere göre bir yükleme süresine
        ihtiyaç vardir veya bir webelementin kullanilabilmesi için zamana ihtiyac vardir.bu methot bekleme işine yarar.
        yani BEKLENECEK MAXİMUM SUREYİ SOYLER.
         */


    }
}
