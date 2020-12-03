package test.java;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.net.MalformedURLException;
import java.net.URL;

public class TestBaseSetup {
    public WebDriver driver;

    @BeforeClass
    public void initializeBrowser(ITestContext iTestContext) {

        ChromeOptions chromeOptions = new ChromeOptions();
        FirefoxOptions ffOption = new FirefoxOptions();
        try {
            MutableCapabilities options = System.getProperty("browser").equals("chrome")
                    ? chromeOptions
                    : ffOption;
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        iTestContext.setAttribute("driver", driver);
    }

    @AfterClass
    public void finalizeBrowser() {
        driver.quit();
    }


}