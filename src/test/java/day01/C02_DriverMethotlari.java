package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethotlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasına gidin
        driver.get("https://www.amazon.com");
        //Kaynak kodlarının içinde "Gateway" kelimesinin oldugunu tese ediniz
        String istenenKelime="Gateway";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSources testi PASSED");
        }else System.out.println("PageSources testi FAİLED");
    }

}
