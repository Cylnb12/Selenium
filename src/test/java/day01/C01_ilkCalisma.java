package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkCalisma {
    public static void main(String[] args) {
         /* En temel haliyle otomasyon yapmak icin
        Clasımıza otomasyon icin gerekli olan web driverin yerini göstermek gerekir
        Bunu da Java kütüphanesinden System.setProperty() metodunu kullanırız.
        ve ilk olarak driveri ikinci olarak bu driverin fiziki yolunu gösteririz.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Actual title :"+driver.getTitle()); //Gidilen sitenin baslıgını getirir.
        System.out.println("Actual Url :"+driver.getCurrentUrl()); //Gidilen sitenin url ini getirir.

    }

}
