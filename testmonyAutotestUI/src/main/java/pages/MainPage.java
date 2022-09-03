package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Element {

    public MainPage(WebDriver driver) { super(driver);}
    private By dataSend = By.xpath("//*[@id=\"send_button\"]");
    private By dataHistory = By.xpath("//*[@id=\"history_button\"]");
    private By catalog = By.xpath("//*[@id=\"catalog_button\"]");



    public void clickSend() {
        click(driver.findElement(dataSend));
    }

    /*
  public HistoryPage clickHistory() {
        driver.findElement(dataHistory).click();
        return new HistoryPage(driver);
    }

    public PricePage clickPrice() {
        driver.findElement(catalog).click();
        return new PricePage(driver);
    }*/
}
