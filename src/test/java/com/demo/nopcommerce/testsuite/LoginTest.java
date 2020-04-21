package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 1, groups = {"Regression"})
    public void verifyUserShouldNavigateToLoginPage() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(3000);
        loginPage.verifyWelcomeText("Welcome, Please Sign In!");
    }

    @Test(priority = 2, groups = {"Regression"})
    public void doLogin() {
        homePage.clickOnLoginLink();
        loginPage.loginToApplication("abc@gmail.com", "abc123");
    }
}
