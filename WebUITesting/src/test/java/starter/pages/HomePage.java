package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By logoutButton(){
        return By.id("submit");
    }

    @Step
    public void validateOnHomePage(){
        $(logoutButton()).isDisplayed();
    }
}
