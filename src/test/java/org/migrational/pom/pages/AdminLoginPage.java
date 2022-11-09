package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.migrational.pom.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminLoginPage extends BasePage {

    private final By emailFld = By.id("email");
    private final By passwordFld = By.id("password");
    private final By rememberMeCheckBox = By.id("remember_me");
    private final By loginBtn = By.cssSelector("button[type='submit']");

    public AdminLoginPage(WebDriver driver) {
        super(driver);
    }

    public AdminLoginPage loadAdmin(){
        loadAdminPanel("/");
        return this;
    }

    public AdminLoginPage enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailFld)).sendKeys(email);
        return this;
    }
    public AdminLoginPage enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordFld)).sendKeys(password);
        return this;
    }

    public AdminLoginPage clickRememberMeCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(rememberMeCheckBox)).click();
        return this;
    }
    public AdminDashboardPage clickLoginBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
        return new AdminDashboardPage(driver);
    }



}
