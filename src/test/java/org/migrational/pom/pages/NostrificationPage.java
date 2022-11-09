package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class NostrificationPage extends BasePage {

    private final By nostrificationStepTitle = By.xpath("//h1[.='Nostrification']");
    private final By startedNostrificationYesBtn = By.id("n_yes");
    private final By startedNostrificationNoBtn = By.id("n_no");
    private final By gatheringDocsCheckBox = By.id("process_of_gathering");
    private final By startedAndAwaitingCheckBox = By.id("started_and_avaiting");
    private final By daySelect = By.id("date_of_submission_day");
    private final By monthSelect = By.id("date_of_submission_month");
    private final By yearSelect = By.id("date_of_submission_year");
    private final By provinceSelect = By.id("select_province");
    private final By submittedAndReceivedCheckBox = By.id("submitted_and_received");
    private final By nostrificationDocumentUpload = By.id("nostrification_document_file");
    private final By nostrificationHelpYesBtn = By.id("yes_help");
    private final By nostrificationHelpNoBtn = By.id("no_help");
    private final By saveAndCloseBtn = By.xpath("//a[.='Save & Close']");
    private final By confirmBtn = By.xpath("//button[.='Confirm']");
    private final By okBtn = By.xpath("//button[.='Ok']");

    public NostrificationPage(WebDriver driver) {
        super(driver);
    }

    public String getNostrificationStepTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(nostrificationStepTitle)).getText();
    }
    public NostrificationPage clickStartedNostrificatioYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(startedNostrificationYesBtn)).click();
        return this;
    }
    public NostrificationPage clickGatheringDocsCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(gatheringDocsCheckBox)).click();
        return this;
    }
    public NostrificationPage clickStartedAndAwaitingCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(startedAndAwaitingCheckBox)).click();
        return this;
    }
    public NostrificationPage selectDay(String day){
        Select selectDay = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(daySelect)));
        selectDay.selectByValue(day);
        return this;
    }
    public NostrificationPage selectMonth(String month){
        Select selectMonth = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(monthSelect)));
        selectMonth.selectByValue(month);
        return this;
    }
    public NostrificationPage selectYear(String year){
        Select selectYear = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(yearSelect)));
        selectYear.selectByValue(year);
        return this;
    }
    public NostrificationPage selectProvince(String province){
        Select selectProvince = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(provinceSelect)));
        selectProvince.selectByValue(province);
        return this;
    }
    public NostrificationPage clickSubmittedAndReceivedCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(submittedAndReceivedCheckBox)).click();
        return this;
    }
    public NostrificationPage uploadNostrificationDocument(String nostrificationDocPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(nostrificationDocumentUpload)).sendKeys(nostrificationDocPath);
        return this;
    }
    public NostrificationPage clickNostrificationHelpYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(nostrificationHelpYesBtn)).click();
        return this;
    }
    public NostrificationPage clickNostrificationHelpNoBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(nostrificationHelpNoBtn)).click();
        return this;
    }
    public NostrificationPage clickStartedNostrificationNoBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(startedNostrificationNoBtn)).click();
        return this;
    }
    public NostrificationPage clickSaveAndCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
        return this;
    }
    public NostrificationPage clickConfirmBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
        return this;
    }
    public NostrificationPage clickOkBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
        return this;
    }





}
