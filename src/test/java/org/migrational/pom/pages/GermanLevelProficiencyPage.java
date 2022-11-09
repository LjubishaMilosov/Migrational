package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class GermanLevelProficiencyPage extends BasePage {

    private final By germanLevelTitle = By.xpath("//h1[.='German language proficiency levels']");
    private final By yesKnowGermanBtn = By.id("yes_know_german");
    private final By knowledgeLevelSelect = By.id("level_knowledge");
    private final By checkBoxCEFRCert = By.id("checkCerf_CEFR");
    private final By uploadCEFRCertBtn = By.id("cert_CEFR_file");
    private final By checkBoxTELCCert = By.id("checkCerf_TELC");
    private final By b2PflegeBtn = By.id("yes_B2");
    private final By uploadTELCertBtn = By.id("cert_TELC_file");
    private final By checkBoxOSDCert = By.id("checkCerf_ÖSD");
    private final By uploadOSDCertBtn = By.id("cert_ÖSD_file");
    private final By checkBoxECLCer = By.id("checkCerf_ECL");
    private final By uploadECLCertBtn = By.id("cert_ECL_file");
    private final By checkBoxNoCert = By.id("checkCertificate");
    private final By yesRecommendCourseBtn = By.id("yes_course");
    private final By noRecommendCourseBtn = By.id("no_course");
    private final By yesFinancialSupportBtn = By.id("yes_financial");
    private final By noFinancialSupportBtn = By.id("no_financial");
    private final By saveAndCloseBtn = By.xpath("//a[.='Save & Close']");
    private final By confirmBtn = By.xpath("//button[.='Confirm']");
    private final By okBtn = By.xpath("//button[.='Ok']");

    public GermanLevelProficiencyPage(WebDriver driver) {
        super(driver);
    }

    public String getGermanLevelStepTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(germanLevelTitle)).getText();
    }
    public GermanLevelProficiencyPage clickYesIKnowGermanBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(yesKnowGermanBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage selectLevelOfGermanKnowledge(String level){
        Select selectLevelOfGermanKnowledge = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(knowledgeLevelSelect)));
        selectLevelOfGermanKnowledge.selectByValue(level);
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadCEFRCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxCEFRCert)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadCEFRCert(String cefrPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadCEFRCertBtn)).sendKeys(cefrPath);
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadTELCCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxTELCCert)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickOnB2PflegeCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(b2PflegeBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadTELCCert(String telcPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadTELCertBtn)).sendKeys(telcPath);
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadOSDCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxOSDCert)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadOSDCert(String osdPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadOSDCertBtn)).sendKeys(osdPath);
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadECLCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxECLCer)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickOnUploadECLCert(String eclPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadECLCertBtn)).sendKeys(eclPath);
        return this;
    }
    public GermanLevelProficiencyPage clickOnNoCertificateCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxNoCert)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickYesRecommendCourseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(yesRecommendCourseBtn)).click();
        return this;
    }public GermanLevelProficiencyPage clickNoRecommendCourseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(noRecommendCourseBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickYesFinancialSupportBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(yesFinancialSupportBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickYNoFinancialSupportBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(noFinancialSupportBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickSaveAndCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickConfirmBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
        return this;
    }
    public GermanLevelProficiencyPage clickOkBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
        return this;
    }






}
