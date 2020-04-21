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
public class RegistrationTestWithDataProvider extends TestBase {


    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    RegistrationCompletePage registrationCompletePage;

    static String email = null;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})

    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registrationPage = new RegistrationPage();
        registrationCompletePage = new RegistrationCompletePage();

        String email = "xyz" + getRandomString(5) + "@gmail.com";
    }
    //assigning random value for email every time test cases run

    @Test(groups = {"Regression","Sanity","Smoke"})
    public void userShouldRegisterSuccessfully(){

    }


}
