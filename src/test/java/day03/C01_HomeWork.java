package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_HomeWork {/*1. Bir class oluşturun: LoginTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. http://a.testaddressbook.com adresine gidiniz.
b. Sign in butonuna basin
c. email textbox,password textbox, and signin button elementlerini locate ediniz..
d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//        a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
//        b. Sign in butonuna basin
        Thread.sleep(2000);
        driver.findElement(By.id("sign-in")).click();
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement kullaniciAdi = driver.findElement(By.id("session_email"));
        WebElement Password = driver.findElement(By.id("session_password"));
        WebElement Buton = driver.findElement(By.name("commit"));
//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
        Thread.sleep(4000);
        kullaniciAdi.sendKeys("testtechproed@gmail.com");
//        ii. Password : Test1234!
        Thread.sleep(4000);
        Password.sendKeys("Test1234!");
        Thread.sleep(4000);
        Buton.click();
//                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement ExpectedUserİd = driver.findElement(By.className("navbar-text"));
        if (ExpectedUserİd.isDisplayed()) {
            System.out.println("Girilen Adres testi PASSED");
        } else System.out.println("Girilen Adres Testi FAİLED");
//                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement Adresses = driver.findElement(By.linkText("Addresses"));
        WebElement SignOut = driver.findElement(By.linkText("Sign out"));
        if (Adresses.isDisplayed()) {
            System.out.println("Adresses textleri görüntüleniyor Test PASSED");
        } else System.out.println("Adresses textleri görüntülenmiyor Test FAİLED");
        if (SignOut.isDisplayed()) {
            System.out.println("SingOut textleri görüntüleniyor Test PASSED");
        } else System.out.println("SingOut textleri görüntülenmiyor Test FAILED");
//        3. Sayfada kac tane link oldugunu bulun.*/
        List<WebElement> linkListeleri = driver.findElements(By.tagName("a"));
        System.out.println("Link lerin sayisi :" + linkListeleri.size());
        //linkleri yazdirin
        linkListeleri.stream().forEach(t-> System.out.println(t.getText()));
        Thread.sleep(2000);
        driver.close();

    }
}
