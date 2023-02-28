package Steps;
import Pages.HomePage;

public class FormSteps extends HomePage{
    public void enterFirstName(){
        String FIRST_NAME = "Aide";
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void click_level(){
        this.college.click();
    }
}
