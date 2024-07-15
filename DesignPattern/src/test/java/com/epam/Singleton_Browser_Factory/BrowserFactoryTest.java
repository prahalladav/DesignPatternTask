package com.epam.Singleton_Browser_Factory;

import org.openqa.selenium.WebDriver;

public class BrowserFactoryTest {
    public static void main(String[] args) {
        BrowserFactory browserFactory = BrowserFactory.getInstance();
        WebDriver driver = browserFactory.getDriver();
        String expectedTitle = "Formy";
        driver.get("https://formy-project.herokuapp.com/form");
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed! Browser navigated to the correct page.");
        } else {
            System.out.println("Test Failed! Actual title: " + actualTitle + ", Expected title: " + expectedTitle);
        }

        browserFactory.closeDriver();
    }
}
