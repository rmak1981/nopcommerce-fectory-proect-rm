package com.demo.nopcommerce.pages;


import com.demo.nopcommerce.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
 * Ravi's Creation
 * Date of Creation
 */

public class LoginPage extends UtilityRM {

    public static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(css = "input#Email")
    WebElement _emailField;

    @FindBy(css = "input.password")
    WebElement _passwordField;

    @FindBy(css = "input.button-1.login-button")
    WebElement _loginBtnSubmit;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;



    public void enterEmailToField(String email){
        Reporter.log("Enter email:" + email + " to email filed " + _emailField.toString() + "<br>");
        sendTextToElement(_emailField,email);
        log.info("Enter email:" + email + " to email filed " + _emailField.toString());
    }
    public void enterPasswordToField(String password){
        Reporter.log("Enter Passwrod" + password + " to password field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField,password);
        log.info("Enter Passwrod" + password + " to password field " + _passwordField.toString());
    }
    public void clickOnLoginSubmitBtn(){
        Reporter.log("click on Login Submit Btn" + _loginBtnSubmit.toString() + "<br>");
        clickOnElement(_loginBtnSubmit);
        log.info("click on Login Submit Btn" + _loginBtnSubmit.toString());
    }
    public void verifyWelcomeText(String welcomeText){
        Reporter.log("verify Welcome Text" +welcomeText+ "displayed msg " + _welcomeText.toString()+ "<br>");
        verifyTextAssertMethod(_welcomeText,welcomeText);
        log.info("verify Welcome Text" +welcomeText+ "displayed msg " + _welcomeText.toString());
    }
    public void loginToApplication(String username, String password) {
        enterEmailToField(username);
        enterPasswordToField(password);
        clickOnLoginSubmitBtn();
    }

}
