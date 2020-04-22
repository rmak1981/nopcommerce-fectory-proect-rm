package com.demo.nopcommerce.pages;


import com.demo.nopcommerce.utility.UtilityRM;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class RegistrationPage extends UtilityRM {

    public static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    @FindBy(xpath = "//div[@class='page-body']//strong[text()='Your Personal Details']")
    WebElement _textYourPersonalDetails;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement _maleGenderRadioBtn;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement _femaleGenderRadioBtn;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement _lastNameField;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _dayOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _monthOfBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _yearOfBirth;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement _companyNameField;

    @FindBy(css = "input#Newsletter")
    WebElement _newsLtrCheckBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement _confPasswordField;

    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerBtn;

    public void verifyYourPersonalDetail(String yourPrsnlDetail) {
        Reporter.log("verify massage" + yourPrsnlDetail + "displayd Msg" + _textYourPersonalDetails.toString() + "<br>");
        verifyTextAssertMethod(_textYourPersonalDetails, yourPrsnlDetail);
        log.info("verify massage" + yourPrsnlDetail + "displayd Msg" + _textYourPersonalDetails.toString());
    }

    public void selectmaleGenderRadioButton() {
        Reporter.log("select male gender btn :" + _maleGenderRadioBtn.toString() + "<br>");
        radioButtonClick(_maleGenderRadioBtn);
        log.info("select male gender btn :" + _maleGenderRadioBtn.toString());

    }

    public void selectFemaleGenderRadioButton() {
        Reporter.log("select female gender btn :" + _femaleGenderRadioBtn.toString() + "<br>");
        radioButtonClick(_femaleGenderRadioBtn);
        log.info("select female gender btn :" + _femaleGenderRadioBtn.toString());

    }

    public void enterTextToFirstNameField(String strFirstName) {
        Reporter.log("enter firstname" + strFirstName + "to the field " + _firstNameField.toString() + "<br>");
        sendTextToElement(_firstNameField, strFirstName);
        log.info("enter firstname" + strFirstName + "to the field " + _firstNameField.toString());

    }

    public void enterTextToLastNameField(String strLastName) {
        Reporter.log("enter lastname" + strLastName + "to the field" + _lastNameField.toString() + "<br>");
        sendTextToElement(_lastNameField, strLastName);
        log.info("enter lastname" + strLastName + "to the field" + _lastNameField.toString());
    }

    public void selectDayDOBFromDropDownMenu(String day) {
        Reporter.log("select day" + _dayOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(_dayOfBirth, day);
        log.info("select day" + _dayOfBirth.toString());
    }

    public void selectMonthDOBFromDropDownMenu(String month) {
        Reporter.log("select month" + _monthOfBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(_monthOfBirth, month);
        log.info("select month" + _monthOfBirth.toString());
    }

    public void selectYearDOBFromDropDownMenu(String year) {
        Reporter.log("selecct year" + _yearOfBirth.toString() + "<br>");
        selectByValueFromDropDown(_yearOfBirth, year);
        log.info("selecct year" + _yearOfBirth.toString());
    }

    public void enterTextToEmailField(String email) {
        Reporter.log("enter email" + email + "to email filed" + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, email);
        log.info("enter email" + email + "to email filed" + _emailField.toString());
    }

    public void enterTextToCompanyField(String strCompanyName) {
        Reporter.log("enter comapny name" + strCompanyName + "to company field" + _companyNameField.toString() + "<br>");
        sendTextToElement(_companyNameField, strCompanyName);
        log.info("enter comapny name" + strCompanyName + "to company field" + _companyNameField.toString());
    }

    public void selectNewsLetterCheckBox() {
        Reporter.log("select news letter box" + _newsLtrCheckBox.toString() + "<br>");
        elementIsSelected(_newsLtrCheckBox);
        log.info("select news letter box" + _newsLtrCheckBox.toString());
    }

    public void enterTextToPasswordField(String strPassword) {
        Reporter.log("enter password" + strPassword + "to field" + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, strPassword);
        log.info("enter password" + strPassword + "to field" + _passwordField.toString());
    }

    public void enterTextToConfirmPasswordField(String strPassword) {
        Reporter.log("enter confirm passwrod" + strPassword + "to the field" + _confPasswordField.toString() + "<br>");
        sendTextToElement(_confPasswordField, strPassword);
        log.info("enter confirm passwrod" + strPassword + "to the field" + _confPasswordField.toString());
    }

    public void clickOnRegisterButton() {
        Reporter.log("click on register"+_registerBtn.toString()+"<br>");
        clickOnElement(_registerBtn);
        log.info("click on register"+_registerBtn.toString());
    }
    public void fillTheRegistrationForm(String strFirstName,  String strLastName, String day, String month, String year, String email, String strCompanyName, String strPassword){
        enterTextToFirstNameField(strFirstName);
        enterTextToLastNameField(strLastName);
        selectDayDOBFromDropDownMenu(day);
        selectMonthDOBFromDropDownMenu(month);
        selectYearDOBFromDropDownMenu(year);
        enterTextToEmailField(email);
        enterTextToCompanyField(strCompanyName);
        selectNewsLetterCheckBox();
        enterTextToPasswordField(strPassword);
        enterTextToConfirmPasswordField(strPassword);
        clickOnRegisterButton();


    }


}
