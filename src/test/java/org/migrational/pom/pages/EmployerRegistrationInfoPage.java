package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.migrational.pom.objects.RegisterEmployer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class EmployerRegistrationInfoPage extends BasePage {
    private final By employerRegistrationInfoTitle = By.xpath("//div[.='Register your account']");
    private final By typeOfServiceSelect = By.id("service_type");
    private final By institutionNameFld = By.id("institution_name");
    private final By institutionLocationSelect = By.id("institution_location");
    private final By institutionBusinessNumberFld = By.id("institution_number");
    private final By institutionTaxNumberFld = By.id("institution_tax_number");
    private final By employerFirstNameFd = By.id("first_name");
    private final By employerLastNameFd = By.id("last_name");
    private final By employerDivisionSelect = By.id("division_work");
    private final By employerPositionSelect = By.id("position");
    private final By employerPhoneNumberFld = By.id("phone");
    private final By employerEmailAddressFld = By.id("email");
    private final By employerPasswordFld = By.id("password");
    private final By employerRepeatPasswordFld = By.id("repeat_password");
    private final By termsAndConditionsCheckBox = By.id("terms_and_conditions");
    private final By submitCreateAccountButton = By.cssSelector("button[type='submit']");

    public EmployerRegistrationInfoPage(WebDriver driver) {
        super(driver);
    }

    public String getEmployerRegistrationInfoTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(employerRegistrationInfoTitle)).getText();
    }
    public EmployerRegistrationInfoPage selectTypeOfEmployerService(String typeOfService){
        Select selectTypeofEmployerService = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(typeOfServiceSelect)));
        selectTypeofEmployerService.selectByValue(typeOfService);
        return this;
    }
    public EmployerRegistrationInfoPage enterInstitutionName(String institution){
        wait.until(ExpectedConditions.visibilityOfElementLocated(institutionNameFld)).sendKeys(institution);
        return this;
    }
    public EmployerRegistrationInfoPage selectEmployerInstitutionLocation(String location){
        Select selectEmployerInstitutionLocation = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(institutionLocationSelect)));
        selectEmployerInstitutionLocation.selectByValue(location);
        return this;
    }
    public EmployerRegistrationInfoPage enterInstitutionBusinessNumber(String businessNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(institutionBusinessNumberFld)).sendKeys(businessNumber);
        return this;
    }
    public EmployerRegistrationInfoPage enterInstitutionTaxNumber(String taxNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(institutionTaxNumberFld)).sendKeys(taxNumber);
        return this;
    }
    public EmployerRegistrationInfoPage enterEmployerFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(employerFirstNameFd)).sendKeys(firstName);
        return this;
    }
    public EmployerRegistrationInfoPage enterEmployerLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(employerLastNameFd)).sendKeys(lastName);
        return this;
    }
    public EmployerRegistrationInfoPage selectEmployerDivision(String division){
        Select selectEmployerDivision = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(employerDivisionSelect)));
        selectEmployerDivision.selectByValue(division);
        return this;
    }
    public EmployerRegistrationInfoPage selectEmployerPosition(String position){
        Select selectEmployerPosition = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(employerPositionSelect)));
        selectEmployerPosition.selectByValue(position);
        return this;
    }
    public EmployerRegistrationInfoPage enterEmployerPhoneNumber(String phoneNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(employerPhoneNumberFld)).sendKeys(phoneNumber);
        return this;
    }
    public EmployerRegistrationInfoPage enterEmployerEmail(String employerEmail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(employerEmailAddressFld)).sendKeys(employerEmail);
        return this;
    }
    public EmployerRegistrationInfoPage enterEmployerPassword(String employerPassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(employerPasswordFld)).sendKeys(employerPassword);
        return this;
    }
    public EmployerRegistrationInfoPage enterEmployerRepeatPassword(String employerRepeatPassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(employerRepeatPasswordFld)).sendKeys(employerRepeatPassword);
        return this;
    }

    public EmployerRegistrationInfoPage setEmployerRegistrationInfo(RegisterEmployer employerRegistrationInfo){
        return selectTypeOfEmployerService(employerRegistrationInfo.getTypeOfService()).
        enterInstitutionName(employerRegistrationInfo.getInstitutionName()).
        selectEmployerInstitutionLocation(employerRegistrationInfo.getInstitutionLocation()).
        enterInstitutionBusinessNumber(employerRegistrationInfo.getInstitutionBusinessNumber()).
        enterInstitutionTaxNumber(employerRegistrationInfo.getInstitutionTaxNumber()).
        enterEmployerFirstName(employerRegistrationInfo.getEmployerFirstName()).
        enterEmployerLastName(employerRegistrationInfo.getEmployerLastName()).
        selectEmployerDivision(employerRegistrationInfo.getEmployerDivision()).
        selectEmployerPosition(employerRegistrationInfo.getEmployerPosition()).
        enterEmployerPhoneNumber(employerRegistrationInfo.getEmployerPhone()).
        enterEmployerEmail(employerRegistrationInfo.getEmployerEmail()).
        enterEmployerPassword(employerRegistrationInfo.getEmployerPassword()).
        enterEmployerRepeatPassword(employerRegistrationInfo.getEmployerRepeatPassword());

    }


    public EmployerRegistrationInfoPage clickTermsAndConditionsCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckBox)).click();
        return this;
    }
    public LoginPage clickSubmitCreateAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitCreateAccountButton)).click();
        return new LoginPage(driver);
    }



}
