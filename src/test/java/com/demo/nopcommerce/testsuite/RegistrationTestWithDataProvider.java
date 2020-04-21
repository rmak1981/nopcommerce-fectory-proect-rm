package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.pages.RegistrationCompletePage;
import com.demo.nopcommerce.pages.RegistrationPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
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

    @Test(groups = {"Regression","Sanity","Smoke"}, dataProvider = "RegistrationCredential",dataProviderClass = TestData.class)

    public void userShouldRegisterSuccessfully(String strFirstName,String strLastName,String day,String month,String year,String strCompanyName,String strPassword){
        homePage.clickOnRegistrationLink();
        registrationPage.fillTheRegistrationForm(strFirstName,strLastName,day,month,year,email,strCompanyName,strPassword,strPassword);
    }


}
