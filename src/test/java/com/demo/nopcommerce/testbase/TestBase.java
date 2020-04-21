package com.demo.nopcommerce.testbase;

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod (groups = {"Regression"})
    public void openBrowser(){

        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
    }
    @AfterMethod (groups = {"Regression"})
    public void tearDown(){
        driver.quit();
    }

}
