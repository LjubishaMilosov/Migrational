package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterNewAccountPage extends BasePage {

    private final By registerNewAccountTitle = By.xpath("//h1[.='Register a new account']");
    private final By candidateButton = By.cssSelector("label[for='candidate']");
    private final By employerButton = By.cssSelector("label[for='employer']");
    private final By createCandidateAccountButton = By.cssSelector("a[href='/registration-info/candidate']");
    private final By createEmployerAccountButton =  By.cssSelector("a[href='/registration-info/employer']");


    public RegisterNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getRegisterNewAccountPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(registerNewAccountTitle)).getText();
    }

    public RegisterNewAccountPage clickCandidateButton(){
        wait.until(ExpectedConditions.elementToBeClickable(candidateButton)).click();
        return this;
}
    public RegisterNewAccountPage clickEmployerButton(){
        wait.until(ExpectedConditions.elementToBeClickable(employerButton)).click();
        return this;
    }

    public CandidateRegistrationInfoPage clickCreateCandidateAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(createCandidateAccountButton)).click();
        return new CandidateRegistrationInfoPage(driver);

    }
    public EmployerRegistrationInfoPage clickCreateEmployerAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(createEmployerAccountButton)).click();
        return new EmployerRegistrationInfoPage(driver);

    }

}
