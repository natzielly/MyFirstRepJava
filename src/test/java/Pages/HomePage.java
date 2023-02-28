package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//https://formy-project.herokuapp.com/form
public class HomePage {
    @FindBy(id = "first-name")
    public WebElement first_name;

    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement college;
}
