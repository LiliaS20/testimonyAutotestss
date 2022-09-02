import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lamvrosenkova\\Documents\\PSA\\autotest\\Projects\\testimonyAutotests\\testmonyAutotestUI\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/index.html");
        WebElement header = driver.findElement(By.xpath("/html/body/h1"));
        System.out.println(header.getText());
        driver.quit();
    }
}
