package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//https://formy-project.herokuapp.com/form
public class HomePage {
    protected EdgeDriver driver;
    public HomePage(EdgeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    public WebElement first_name;

    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement college;
}
