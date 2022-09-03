import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SendPage;

public class PageNavigationTest extends TestBase {

    @Test
    public void FromMainToSendAndBack () throws InterruptedException {
        applicationManager.getMainPage().clickSend();
        Assert.assertEquals(applicationManager.getSendPage().getHeaderText(), "Передача показаний");
        Thread.sleep(1000);
        applicationManager.getSendPage().clickBackButton();
        Assert.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
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


}