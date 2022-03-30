package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;


public class LoginPage extends PageObject {
    private By usernameField(){
        return By.id("userName");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By loginButton(){
        return By.id("login");
    }
    private By adsButton(){
        return By.xpath("//*[@id=\"close-fixedban\"]/img");
    }
    private By errorMessage() {
        return By.id("name");
    }

    @Step
    public void openPage(){
        openAt("/login");
        $(adsButton()).click();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        to(loginButton());
        $(loginButton()).click();
    }
    @Step
    public boolean showErrorMessage(){
       return $(errorMessage()).isDisplayed();

    }
    @Step
    public boolean verify(String errorMessage){
        return $(errorMessage()).getText().equals(errorMessage);
    }
}
