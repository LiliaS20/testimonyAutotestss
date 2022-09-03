import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.MainPage;
import pages.SendPage;

public class ApplicationManager {
    protected WebDriver driver;
    public BasePage basePage;
    public MainPage mainPage;
    public SendPage sendPage;

    public MainPage getMainPage() {
        return mainPage;
    }

    public SendPage getSendPage() {
        return sendPage;
    }

    protected void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lamvrosenkova\\Documents\\PSA\\autotest\\Projects\\testimonyAutotests\\testmonyAutotestUI\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        mainPage = new MainPage(driver);
        sendPage = new SendPage(driver);
        Thread.sleep(1000);
    }

    protected void close() {
        driver.quit();
    }
}
