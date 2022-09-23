package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManegeMehotlari {
    public static void main(String[] args) throws InterruptedException {
        //1. Amazon soyfasina gidelim. https://www.amazon.com/
        //2. Sayfanin konumunu ve boyutlarini yazdirin
        //3. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        //4. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //5. Sayfayi kapatin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu :"+driver.manage().window().getPosition());
        System.out.println("Syfanin Boyutu :"+driver.manage().window().getSize());
        Thread.sleep(3000);
        //3. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(80,0));
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(1350,365));
        //4. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Thread.sleep(3000);
        System.out.println("Sayfanin yeni konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni Boyutu :"+driver.manage().window().getSize());
        //5. Sayfayi kapatin
        driver.close();
    }
}
