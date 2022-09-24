package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_AmazonSearchTest {/*
1. Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.web sayfasına gidin. https://www.amazon.com/
b. Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //b. Search(ara) “city bike”
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("city bike", Keys.ENTER);
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonuc = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = sonuc.get(0).getText();
        System.out.println(sonucYazisi);
        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.*/
        List<WebElement> resim = driver.findElements(By.className("s-image"));
        resim.get(0).click();
        //e.Sadece sonuc yazisini yazdirin
        String[] sonucyazisiE = sonucYazisi.split(" ");
        System.out.println("Beklenen Sonuc : " + sonucyazisiE[2]);
        //f.Sonucu Lambda ile yazdiralim
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(t -> System.out.println(t));
        Thread.sleep(3000);
        driver.close();


    }
}
