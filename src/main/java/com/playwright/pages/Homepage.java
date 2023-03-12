package com.playwright.pages;

import com.microsoft.playwright.Page;
import com.playwright.utilities.Utils;

import java.util.Properties;

public class Homepage{

    Page page;
    Properties properties;

    //Locators
    public String edc = "//*[@id='app_type_1']/div[4]/a";

    public Homepage(Page page, Properties properties) {
        this.page = page;
        this.properties = properties;
    }

    public String getHomePageTitle(){
        return page.title();
    }

    public String getHomePageUrl(){
        return page.url();
    }

    public String login(){
        // Read property values
        page.getByTestId("username").click();
        page.getByTestId("username").fill(properties.getProperty("imedidata.username"));
        page.getByTestId("username").press("Tab");
        page.getByTestId("password").fill(properties.getProperty("imedidata.password"));
        page.getByTestId("sign_in_button").click();
        return page.title();
    }

    public LandingPage navigateToEDCPage(){
        page.locator(edc).click();
        return new LandingPage(page,properties);
    }

}
