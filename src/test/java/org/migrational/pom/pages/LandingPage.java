package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {

    private final By loginLink = By.linkText("Login");
    private final By registerAccountLink = By.linkText("Create Account");


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public LandingPage load(){
        load("/");
        return this;
    }

    public LoginPage clickLoginLink(){
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
        return new LoginPage(driver);
    }

    public RegisterNewAccountPage clickCreateAccountLink(){
        wait.until(ExpectedConditions.elementToBeClickable(registerAccountLink)).click();
        return new RegisterNewAccountPage(driver);
    }



}
