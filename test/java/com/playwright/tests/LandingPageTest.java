package com.playwright.tests;

import com.playwright.constants.AppConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {

    @Test
    public void landingPageTest() {
        homepage.login();
        landingPage = homepage.navigateToEDCPage();
        String actualTitle = landingPage.searchForStudy();
        Assert.assertEquals(actualTitle, AppConstants.LANDING_PAGE_TITLE);
    }
}
