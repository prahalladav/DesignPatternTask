package com.epam.Builder_Patter_Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private static BrowserFactory instance;
    private WebDriver driver;

    private BrowserFactory() {
        driver = new ChromeDriver();
    }

    public static BrowserFactory getInstance() {
        if (instance == null) {
            synchronized (BrowserFactory.class) {
                if (instance == null) {
                    instance = new BrowserFactory();
                }
            }
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        driver.quit();
        driver = null;
        instance = null;
    }
}

