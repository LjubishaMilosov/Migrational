package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.migrational.pom.objects.RegisterCandidate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CandidateRegistrationInfoPage extends BasePage {

    private final By candidateRegistrationInfoTitle = By.xpath("//div[.='Register your account']");
    private final By firstNameField = By.id("first_name");
    private final By lastNameField = By.id("last_name");
    private final By selectDay = By.id("date_day");
    private final By selectMonth = By.id("date_mounth_desktop");
    private final By selectYear = By.id("date_of_birth");
    private final By selectCountry = By.id("country");
    private final By selectCity = By.id("city");
    private final By phoneNumberField = By.id("phone");
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By repeatPasswordField = By.id("repeat_password");
    private final By termsAndConditionsCheckBox = By.id("terms_and_conditions");
    private final By submitCreateAccountButton = By.cssSelector("button[type='submit']");


    public CandidateRegistrationInfoPage(WebDriver driver) {
        super(driver);
    }
    public String getCandidateRegistrationInfoTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(candidateRegistrationInfoTitle)).getText();
    }

    public CandidateRegistrationInfoPage enterFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys(firstName);
        return this;
    }

    public CandidateRegistrationInfoPage enterLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys(lastName);
        return this;
    }
    public CandidateRegistrationInfoPage selectDayOfBirth(String valueDay){
        Select selectDayOfBirth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectDay)));
        selectDayOfBirth.selectByValue(valueDay);
        return this;
    }
    public CandidateRegistrationInfoPage selectMonthOfBirth(String valueMonth){
        Select selectMonthOfBirth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectMonth)));
        selectMonthOfBirth.selectByValue(valueMonth);
        return this;
    }
    public CandidateRegistrationInfoPage selectYearOfBirth(String valueYear){
        Select selectYearOfBirth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectYear)));
        selectYearOfBirth.selectByValue(valueYear);
        return this;
    }
    public CandidateRegistrationInfoPage selectCountryOfBirth(String valueCountry){
        Select selectCountryOfBirth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountry)));
        selectCountryOfBirth.selectByValue(valueCountry);
        return this;
    }
    public CandidateRegistrationInfoPage selectCityOfBirth(String valueCity){
        Select selectCityOfBirth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectCity)));
        selectCityOfBirth.selectByValue(valueCity);
        return this;
    }
    public CandidateRegistrationInfoPage enterPhoneNumber(String phone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField)).sendKeys(phone);
        return this;
    }
    public CandidateRegistrationInfoPage enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
        return this;
    }
    public CandidateRegistrationInfoPage enterPassword(String pass){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(pass);
        return this;
    }
    public CandidateRegistrationInfoPage repeatPassword(String repeatPass){
        wait.until(ExpectedConditions.visibilityOfElementLocated(repeatPasswordField)).sendKeys(repeatPass);
        return this;
    }

    public CandidateRegistrationInfoPage setRegistrationInfoCandidate(RegisterCandidate registrationInfoCandidate){
         return enterFirstName(registrationInfoCandidate.getFirstName()).
                enterLastName(registrationInfoCandidate.getLastName()).
                selectDayOfBirth(registrationInfoCandidate.getDayOfBirth()).
                selectMonthOfBirth(registrationInfoCandidate.getMonthOfBirth()).
                selectYearOfBirth(registrationInfoCandidate.getYearOfBirth()).
                selectCountryOfBirth(registrationInfoCandidate.getCountryOfBirth()).
                selectCityOfBirth(registrationInfoCandidate.getCityOfBirth()).
                enterPhoneNumber(registrationInfoCandidate.getPhoneNumber()).
                enterEmail(registrationInfoCandidate.getEmail()).
                enterPassword(registrationInfoCandidate.getPassword()).
                repeatPassword(registrationInfoCandidate.getRepeatPassword());

    }

    public CandidateRegistrationInfoPage clickTermsAndConditionsCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckBox)).click();
        return this;
    }
    public LoginPage clickSubmitCreateAccountButton(){
        wait.until(ExpectedConditions.elementToBeClickable(submitCreateAccountButton)).click();
        return new LoginPage(driver);
    }

}
