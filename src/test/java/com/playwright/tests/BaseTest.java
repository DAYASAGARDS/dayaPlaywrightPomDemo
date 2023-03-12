package com.playwright.tests;

import com.microsoft.playwright.Page;
import com.playwright.factory.PlayWrightFactory;
import com.playwright.pages.Homepage;
import com.playwright.pages.LandingPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Properties;

public class BaseTest {

    PlayWrightFactory playWrightFactory;
    Page page;
    protected Homepage homepage;
    protected LandingPage landingPage;
    protected Properties properties = new Properties();
    @Parameters({"browser"})
    @BeforeTest
    public void setup(String browserName){
        playWrightFactory = new PlayWrightFactory();
        properties = playWrightFactory.initProperties();
        if (browserName != null){
            properties.setProperty("imedidata.browser", browserName);
        }
        page = playWrightFactory.initBrowser(properties);
        homepage = new Homepage(page,properties);
    }

    @AfterTest
    public void tearDown()  {
        page.context().browser().close();
    }
}
