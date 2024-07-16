package com.epam.Builder_Patter_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class UserRegistrationTest {

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        BrowserFactory browserFactory = BrowserFactory.getInstance();
        driver = browserFactory.getDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void testUserRegistration() {

        User user = new User.UserBuilder("Prahallada", "V")
                .jobTitle("Software Engineer")
                .educationLevel("College")
                .sex("Male")
                .yearsOfExperience("1")
                .dateOfBirth("21/06/2000")
                .build();

        driver.findElement((By.id("first-name"))).sendKeys(user.getFirstName());
        driver.findElement((By.id("last-name"))).sendKeys(user.getLastName());
        driver.findElement((By.id("job-title"))).sendKeys(user.getJobTitle());
        driver.findElement(By.xpath("//input[@id=\"radio-button-3\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"checkbox-3\"]")).click();

        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id=\"select-menu\"]"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("2");
        driver.findElement(By.xpath("//input[@placeholder=\"mm/dd/yyyy\"]")).sendKeys(user.getDateOfBirth());
        driver.findElement(By.xpath("//a[text()='Submit']")).click();

    }

    @AfterClass
    public void teardown() {
        BrowserFactory.getInstance().quitDriver();
    }
}