package Steps;
import Pages.*;
import org.openqa.selenium.edge.EdgeDriver;

public class FormSteps extends HomePage{
    public FormSteps(EdgeDriver driver) {
        super(driver);
    }
    public void enterFirstName(){
        String FIRST_NAME = "Aide";
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void click_level(){
        this.college.click();
    }
}
