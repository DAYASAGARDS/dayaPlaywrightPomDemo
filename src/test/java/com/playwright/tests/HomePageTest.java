package com.playwright.tests;

import com.playwright.constants.AppConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void homePageTitleTest() {
        String actualTitle = homepage.login();
        Assert.assertEquals(actualTitle, AppConstants.LOGIN_PAGE_TITLE);
    }

    @Test
    public void homePageUrlTest() {
        String actualTitle = homepage.getHomePageUrl();
        Assert.assertEquals(actualTitle,properties.getProperty("url"));
        homepage.navigateToEDCPage();
    }

}
