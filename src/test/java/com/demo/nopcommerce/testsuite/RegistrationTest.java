package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.pages.RegistrationCompletePage;
import com.demo.nopcommerce.pages.RegistrationPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.demo.nopcommerce.utility.UtilityRM.getRandomString;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class RegistrationTest extends TestBase {

    static String email = null;
    String password = "abc123";

    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    RegistrationCompletePage registrationCompletePage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registrationPage = new RegistrationPage();
        registrationCompletePage = new RegistrationCompletePage();
    }
    //assigning random value for email every time test cases run
    @BeforeTest(groups = {"Regression","Sanity","Smoke"})
    public static void setUp1() {
        email = "xyz" + getRandomString(5) + "@gmail.com";
    }

    /*
      Test Case 1
      User should navigate to register page successfully.
      Click on Register Link
      Message   “Your Personal Details“
      Assert above message.
    */
    @Test(priority = 0,groups = {"Sanity","Regression"})
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on Register link on HomePage
        homePage.clickOnRegistrationLink();
        //Assert text on RegistrationPage
        registrationPage.verifyYourPersonalDetail("Your Personal Details");
    }
    /*
        Test Case 2
        User should register successfully.
        Click on Register
        Enter correct details in field
        Click on register  button.
        Expected Result:
        Success Message  “Your registration completed”
        Assert above message.
    */

    @Test (priority = 1,groups = {"Smoke","Regression"})
    public void userShouldRegisterSuccessfullyAndLoginUsingSameCredentials() {
        //click on Register link on HomePage
        homePage.clickOnRegistrationLink();

        //select Male gender radio button
        registrationPage.selectmaleGenderRadioButton();

        //select Female gender radio button
        //registerPage.selectFemaleGenderRadioButton();

        //send text to First Name field
        registrationPage.sendTextToFirstNameField("Lucky");

        //send text to Last Name field
        registrationPage.sendTextToLastNameField("mak");

        //select day from DOB drop down menu
        registrationPage.selectDayDOBFromDropDownMenu("1");

        //select month from DOB drop down menu
        registrationPage.selectMonthDOBFromDropDownMenu("May");

        //select year from DOB drop down menu
        registrationPage.selectYearDOBFromDropDownMenu("1980");

        //send text to Email field
        registrationPage.sendTextToEmailField(email);

        //send text to Company name field
        registrationPage.sendTextToCompanyField("L M Test");

        //check Newsletter checkbox is selected
        registrationPage.selectNewsLetterCheckBox();

        //send text to Password field
        registrationPage.sendTextToPasswordField(password);

        //send text to Confirm password field
        registrationPage.sendTextToConfirmPasswordField(password);

        //click Register button
        registrationPage.clickOnRegisterButton();

        //Assert text Registration complete page
        registrationCompletePage.verifyTextYourRegistrationCompleted("Your registration completed");

    }


}
