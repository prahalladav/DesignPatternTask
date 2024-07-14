package com.epam.Singleton_Browser_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private static BrowserFactory instance = null;

    private WebDriver driver;

    private BrowserFactory() {
       this.driver = new ChromeDriver();
    }

    public static BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public void closeDriver() {
        this.driver.quit();
        instance = null;
    }
}

