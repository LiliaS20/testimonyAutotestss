import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeMethod
    public void setupPage() throws InterruptedException {
        applicationManager.init();
    }

    @AfterMethod
    public void closePage() {
        applicationManager.close();
    }

    public ApplicationManager getApplicationManager() {
        return applicationManager;
    }
}
