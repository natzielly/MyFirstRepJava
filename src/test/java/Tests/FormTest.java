package Tests;

import Steps.FormSteps;

public class FormTest {
    public void submitForm(){
        FormSteps actions = new FormSteps();
        actions.enterFirstName();
        actions.click_level();
    }
}
