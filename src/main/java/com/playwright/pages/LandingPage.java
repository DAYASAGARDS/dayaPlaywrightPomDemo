package com.playwright.pages;

import com.microsoft.playwright.Page;

import java.util.Properties;

public class LandingPage {

    Page page;
    Properties properties;



    //constructor
    public LandingPage(Page page, Properties properties) {
        this.page = page;
        this.properties = properties;
    }

    public String searchForStudy(){
        page.getByPlaceholder("Search for Study").click();
        page.getByPlaceholder("Search for Study").fill("R2M");
        page.getByPlaceholder("Search for Study").press("Enter");
        return page.title();
    }




}
