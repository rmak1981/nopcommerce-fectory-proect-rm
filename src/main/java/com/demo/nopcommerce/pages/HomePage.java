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
public class HomePage extends UtilityRM{

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    // list of element and locators
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement _loginLink;

    @FindBy(xpath = "//div[@class='header-links-wrapper']//a[contains(text(),'Register')]")
    WebElement _registrationLink;

    public void clickOnLoginLink() {
        Reporter.log("clicking on login link" + _loginLink.toString() + "<br>");
        // <br> is to brake line
        clickOnElement(_loginLink); //  using web element method form utility for this for log 4 j
        log.info("clicking on login link" + _loginLink.toString());
    }
    public void clickOnRegistrationLink(){
        Reporter.log("cliking on registration link" + _registrationLink.toString() + "<br>");
        clickOnElement(_registrationLink);
        log.info("cliking on registration link" + _registrationLink.toString());
    }

}
