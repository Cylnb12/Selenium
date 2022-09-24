package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethotlari {/*
               1-Amazon sayafasina gidiniz
               2-Arama kutusunu locate ediniz
               3-Arama kutusunun tagName inin input oldugunu test ediniz
               4-Arama kutusunun name atributunun degerinin fields-keyworld oldugunu test ediniz
               5-Sayfayi kapatiniz*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1.cozum:
        driver.get("https://www.amazon.com");
        //2.cozum:
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //3.cozum:
        String ExpectedTagName="input";
        String ActualTagName=aramaKutusu.getTagName();
        if (ActualTagName.equals(ExpectedTagName)){
            System.out.println("AArama kutusu TagName testi PASSED : "+ActualTagName);
        }else System.out.println("Arama kutusu TagName testi FAILED : "+ActualTagName);
        //4.cozum:
        String ExpectedAtributeName="field-keywords";
        String ActualAtributeName=aramaKutusu.getAttribute("name");
        if (ActualAtributeName.equals(ExpectedAtributeName)){
            System.out.println("Arama kutusu atributun name testi PASSED : "+ActualAtributeName);
        }else System.out.println("Arama kutusu atributun name testi FAILED : "+ActualAtributeName);
        driver.close();




    }


}
