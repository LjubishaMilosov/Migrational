package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationPage extends BasePage {
    private final By personalInfoTitle = By.xpath("//h1[.='Personal Information']");

    private final By countryOfBirthSelect = By.id("birth_country");
    private final By cityOfBirthSelect = By.id("birth_city");
    private final By currentCountry = By.id("current_country");
    private final By currentCity = By.id("current_city");
    private final By marriedBtn = By.id("married");
    private final By genderSelect = By.id("cust_gender");
    private final By photoUploadFBtn = By.id("user_image");
    private final By cvUploadBtn = By.id("user_cv_file");
    private final By saveAndCloseBtn = By.xpath("//a[.='Save & Close']");
    private final By confirmBtn = By.xpath("//button[.='Confirm']");
    private final By okBtn = By.xpath("//button[.='Ok']");
    private final By deleteProfilePhoto = By.cssSelector("svg[id='customer_photo_delete_uploaded']");
    private final By deleteCVFile = By.cssSelector("svg[id='cv_doc_delete_uploaded']");



    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }

    public String getPersonalInformationTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(personalInfoTitle)).getText();
    }
    public String selectCountryOfBirth() {
        Select selectCountryOfBirth =
                new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(countryOfBirthSelect)));
       return selectCountryOfBirth.getFirstSelectedOption().getText();

    }
    public String selectCityOfBirth() {
        Select selectCityOfBirth =
                new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(cityOfBirthSelect)));
        return selectCityOfBirth.getFirstSelectedOption().getText();

    }


    public PersonalInformationPage selectCurrentCountry(String currCountry) {
        Select selectCurrentCountry = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(currentCountry)));
        selectCurrentCountry.selectByValue(currCountry);
        return this;
    }
    public PersonalInformationPage selectCurrentCity(String currCity) {
        Select selectCurrentCity = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(currentCity)));
        selectCurrentCity.selectByValue(currCity);
        return this;
    }
    public PersonalInformationPage clickYesMarriedBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(marriedBtn)).click();
        return this;
    }
    public PersonalInformationPage selectGender(String gender) {
        Select selectGender = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(genderSelect)));
        selectGender.selectByValue(gender);
        return this;
    }
    public PersonalInformationPage uploadYourPhoto(String photoPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(photoUploadFBtn)).sendKeys(photoPath);
        return this;
    }
    public PersonalInformationPage uploadYourCV(String cvPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(cvUploadBtn)).sendKeys(cvPath);
        return this;
    }
    public PersonalInformationPage clickSaveAndCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
        return this;
    }
    public PersonalInformationPage clickConfirmBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
        return this;
    }
    public PersonalInformationPage clickOkBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
        return this;
    }
    public PersonalInformationPage clickDeleteProfilePhoto() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteProfilePhoto)).click();
        return this;
    }
    public PersonalInformationPage deleteProfilePhoto() {
        WebElement deleteSvg = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteProfilePhoto));
        if (deleteSvg.isEnabled()) {
            clickDeleteProfilePhoto();
            clickConfirmBtn();
            clickOkBtn();
        }
        return this;
    }
    public PersonalInformationPage clickDeleteCVFile() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteCVFile)).click();
        return this;
    }
    public PersonalInformationPage deleteCVFile() {
        WebElement deleteSvg = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteCVFile));
        if (deleteSvg.isEnabled()) {
            clickDeleteCVFile();
            clickConfirmBtn();
            clickOkBtn();
        }
        return this;
    }


}
