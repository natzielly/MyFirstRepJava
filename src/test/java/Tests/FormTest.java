package Tests;
import Steps.FormSteps;
import Utilities.Base;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FormTest {
    public EdgeDriver driver = new EdgeDriver();
    @BeforeSuite
    public void setting() {
        // ChromeDriver location set up in Utils class
        System.setProperty("web-driver.chrome.driver", Base.UtilsDriver.CHROME_DRIVER_LOCATION);
        driver.get(Base.UtilsDriver.BASE_URL);
    }
    @Test
    public void submitForm(){
        FormSteps actions = new FormSteps(driver);
        actions.enterFirstName();
        actions.click_level();
    }

    @AfterSuite
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
