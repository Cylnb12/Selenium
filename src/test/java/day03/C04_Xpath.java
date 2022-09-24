package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Xpath {/*
            1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            2- Add Element butonuna basin
            3 Delete butonu’nun gorunur oldugunu test edin
            4 Delete tusuna basin
            5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement buton =driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        Thread.sleep(3000);
        buton.click();
        WebElement ExpectedDeleteButton= driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (ExpectedDeleteButton.isDisplayed()){
            System.out.println("Test 1 PASSED");
        }else System.out.println("Test FAILED");
        Thread.sleep(3000);
        ExpectedDeleteButton.click();
        WebElement ExpectedAddRemoveElements = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        if (ExpectedAddRemoveElements.isDisplayed()){
            System.out.println("Test 2 PASSED");
        }else System.out.println("Test 2 FAİLED");
        Thread.sleep(   3000    );
        driver.close();




    }
}
