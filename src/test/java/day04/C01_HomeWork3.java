package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_HomeWork3 {
    /*
            1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            2- Add Element butonuna 10 kez  basiniz
            3 Element Butonu na 10 kez basildigini test ediniz
            4 Delete butonuna görunmeyene kadar basiniz
            5 Delete butonunun gorunmedigini test ediniz
            6-Sayfayi kapatiniz
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        Thread.sleep(2000);
        for (int i = 1; i < 11; i++) {
            addElementButton.click();
            Thread.sleep(1000);
        }
        List<WebElement> deleteButon = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int ExpectedDeleteButton = 10;
        int ActualDeleteButton = deleteButon.size();
        if (ExpectedDeleteButton == ActualDeleteButton) {
            System.out.println("TEST PASSSED");
        } else System.out.println("TEST FAILED");
        Thread.sleep(2000);
        for (int i = 1; i < 11; i++) {
            driver.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();
            Thread.sleep(1000);
        }
        WebElement anaSayfa = driver.findElement(By.className("no-js"));
        String delete = "Delete";
        if (!(anaSayfa.getText().contains("delete"))) {
            System.out.println("SON TEST PASSED");
        } else System.out.println("SON TEST FAİLED");
        driver.close();

    }
}