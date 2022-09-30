package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_HomeWork2 {
    /*1- https://www.amazon.com/ adresine gidin
2- Browseri tam sayfa yapin
3- Sayfayi “refresh” yapin
4- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
5- Gift Cards sekmesine basin
6-Birthday butonuna basin
7-Best Seller bolumunden ilk urunu tiklayin
8- Gift card details’den 25 $’i secin
9--Urun ucretinin 25$ oldugunu test edin
10-Sayfayi kapatin*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();
        if(driver.getTitle().contains("Spend less")){
            System.out.println("Sayfa Basligi Testi: PASSED");
        }else System.out.println("Sayfa Basligi Testi: FAİLED");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@alt='Amazon.com eGift Card']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='a-button a-button-toggle']")).click();
        Thread.sleep(2000);
        WebElement ActualFiyat= driver.findElement(By.xpath("//*[@id='gc-buy-box-text']"));
        String ExpecdetFiyat="$25.00";
        if(ActualFiyat.equals(ExpecdetFiyat)){
            System.out.println("Fiyat TESTİ PASSED");
        }else System.out.println("Fiyat TESTİ FAİLED");
        Thread.sleep(2000);
       // driver.close();




    }


}
