package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.objects.LoginEmployer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final  By emailField = By.id("email");
    private final  By passwordField = By.id("password");
    private  final  By rememberMeCheckBox = By.id("remember_me");
    private final  By submitButton = By.cssSelector("button[type='submit']");
    private final  By activateYourAccountMsg = By.cssSelector("span[class='leading-19px']");
    private final By loginPageTitle = By.xpath("//h1[.='Login to your account']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
        return  this;
    }

    public LoginPage enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
        return this;
    }

    public LoginPage clickRememberMeCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(rememberMeCheckBox)).click();
        return this;
    }
    public LoginPage setLoginCandidate(LoginCandidate loginCandidate){
        return enterEmail(loginCandidate.getEmail()).
                enterPassword(loginCandidate.getPassword());
    }

    public void clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public String getActivateYourAccountMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(activateYourAccountMsg)).getText();
    }

    public String getLoginPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loginPageTitle)).getText();
    }
    /*public Boolean assertLoginPageTitle(){
        return wait.until(ExpectedConditions.
                textToBePresentInElementLocated(loginPageTitle, "Login to your account"));
    }*/

    public LoginPage setEmployerLogin(LoginEmployer loginEmployer){
        return enterEmail(loginEmployer.getEmployerEmail()).
                enterPassword(loginEmployer.getEmployerPassword());
    }


}
