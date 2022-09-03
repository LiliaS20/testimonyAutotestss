import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SendPage;

public class PageNavigationTest {

    private WebDriver driver;


    @BeforeMethod
    public void setupPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lamvrosenkova\\Documents\\PSA\\autotest\\Projects\\testimonyAutotests\\testmonyAutotestUI\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        Thread.sleep(1000);
    }


    @Test
    public void FromMainToSendAndBack () throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        SendPage sendPage = new SendPage(driver);
        mainPage.clickSend();
        Assert.assertEquals(sendPage.getHeaderText(), "Передача показаний");
        Thread.sleep(1000);
        sendPage.clickBackButton();
        Assert.assertEquals(mainPage.getHeaderText(), "Neo ЖКХ");
    }


 /*   @Test
    public void FromMainToHistoryAndBack () throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickHistory();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "История показаний");
        driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
    }


    @Test
    public void FromMainToPriceAndBack () {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickPrice();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Справочник стоимости услуг");
        driver.findElement(By.xpath("//*[@id=\"back_button\"]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Neo ЖКХ");
    }*/


    @AfterMethod
    public void closePage() {
        driver.quit();
    }
}