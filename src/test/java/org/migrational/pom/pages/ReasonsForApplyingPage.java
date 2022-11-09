package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.List;

public class ReasonsForApplyingPage extends BasePage {

    private final By reasonsForApplyingTitle = By.xpath("//h1[.='Reasons for applying and expectations']");
    private  final By reasonsForWorkInGermanySelect = By.id("reasons");
    private final By reasonsForWorkTextArea = By.id(("reason_for_work_info"));
    private final By changeCurrentJobYesBtn = By.id("yes_work");
    private final By changeCurrentJobNoBtn = By.id("no_work");
    private final By reasonsToChangeCurrentJobTextArea = By.cssSelector("textarea[name='reason_for_job_change']");
    private final By currentlyWorkInGermanyYesBtn = By.id("yes_in_germany");
    private final By currentlyLocatedCitySelect = By.id("currently_in_city");
    private final By firstJobInGermanyYesBtn = By.cssSelector("input[id='yes_job']");
    private final By travelPreferenceByLandBtn = By.id("by_land");
    private final By accommodationPreferenceSelect = By.id("preferences");
    private final By communicationPreferenceSelect = By.id("communication");
    private final By takeFamilyWithYouSelect = By.id("fam");
    private final By haveChildrenYesBtn = By.id("yes_children");
    private final By childrenAgeSelect = By.cssSelector("select[name='children_age']");
    private final By howLongPlanToStaySelect = By.id("stay");
    private final By yesFamilyComeTextArea = By.id("family_come_info");
    private final By dependsFamilyComeTextArea = By.id("family_come_info_d");
    private final By preferredCitySelect = By.id("preferred_city");
    private final By yearsOfWorkExperienceSelect = By.id("years_of_work_experience");
    private final By howHeardAboutUsSelect = By.id("how_heard_about_us");
    private final By howHeardAboutUsSelectTextArea = By.id("how_heard_about_us_info");
    private final By saveAndCloseBtn = By.xpath("//a[.='Save & Close']");
    private final By confirmBtn = By.xpath("//button[.='Confirm']");
    private final By okBtn = By.xpath("//button[.='Ok']");




    public ReasonsForApplyingPage(WebDriver driver) {
        super(driver);
    }
    public String getReasonsForApplyingStepTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(reasonsForApplyingTitle)).getText();
    }
    public ReasonsForApplyingPage selectReasonForWorkInGermany(String reasonsSelect){
        Select selectReasonsForWorkInGermany =
                new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(reasonsForWorkInGermanySelect)));
        selectReasonsForWorkInGermany.selectByValue(reasonsSelect);
        return this;
    }
    public ReasonsForApplyingPage enterReasonsForWorkInGermanyText(String workReasons){
        WebElement workInGermany = wait.until(ExpectedConditions.visibilityOfElementLocated(reasonsForWorkTextArea));
        workInGermany.clear();
        workInGermany.sendKeys(workReasons);
        return this;
    }
   public ReasonsForApplyingPage clickChangeCurrentJobYesBtn(){
        WebElement currentJobYesBtn = wait.until(ExpectedConditions.elementToBeClickable(changeCurrentJobYesBtn));
            String btnId = currentJobYesBtn.getAttribute("id");
            if(btnId.equalsIgnoreCase("yes_work")){
                currentJobYesBtn.click();
            }
        return this;
    }

    public ReasonsForApplyingPage clickChangeCurrentJobNoBtn() {
       WebElement currentJobNoBtn = wait.until(ExpectedConditions.elementToBeClickable(changeCurrentJobNoBtn));
        String btnId = currentJobNoBtn.getAttribute("id");
        if(btnId.equalsIgnoreCase("no_work")){
            currentJobNoBtn.click();
        }
        return this;
    }
    /*public ReasonsForApplyingPage clickChangeCurrentJobYesBtn(){
       wait.until(ExpectedConditions.elementToBeClickable(changeCurrentJobYesBtn)).click();
        return this;
    }

    public ReasonsForApplyingPage clickChangeCurrentJobNoBtn() {
       wait.until(ExpectedConditions.elementToBeClickable(changeCurrentJobNoBtn)).click();

        return this;
    }*/
    public ReasonsForApplyingPage enterReasonsToChangeCurrentJobText(String changeJobReasons){
        WebElement changeCurrentJob = wait.until(ExpectedConditions.presenceOfElementLocated(reasonsToChangeCurrentJobTextArea));
        changeCurrentJob.clear();
        changeCurrentJob.sendKeys(changeJobReasons);
        return this;
    }
    public ReasonsForApplyingPage clickCurrentlyWorkInGermanyYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(currentlyWorkInGermanyYesBtn)).click();
        return this;
    }
    public ReasonsForApplyingPage selectCurrentlyLocatedCity(String currentCitySelect){
        Select selectCurrentlyLocatedCity = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(currentlyLocatedCitySelect)));
        selectCurrentlyLocatedCity.selectByValue(currentCitySelect);
        return this;
    }
    public ReasonsForApplyingPage clickFirstJobInGermanyYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(firstJobInGermanyYesBtn)).click();
        return this;
    }
    public ReasonsForApplyingPage clickTravelPreferenceByLandBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(travelPreferenceByLandBtn)).click();
        return this;
    }
    public ReasonsForApplyingPage selectAccommodationPreference(String accommodationSelect){
        Select selectAccommodationPreference = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(accommodationPreferenceSelect)));
        selectAccommodationPreference.selectByValue(accommodationSelect);
        return this;
    }
    public ReasonsForApplyingPage selectCommunicationPreference(String communicationSelect){
        Select selectCommunicationPreference = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(communicationPreferenceSelect)));
        selectCommunicationPreference.selectByValue(communicationSelect);
        return this;
    }
    public ReasonsForApplyingPage selectTakeFamilyWithYou(String familyWithYouSelect){
        Select selectTakeFamilyWithYou = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(takeFamilyWithYouSelect)));
        selectTakeFamilyWithYou.selectByValue(familyWithYouSelect);
        return this;
    }
    public ReasonsForApplyingPage enterYesFamilyComeText(String yesFamCome){
        wait.until(ExpectedConditions.visibilityOfElementLocated(yesFamilyComeTextArea)).sendKeys(yesFamCome);
        return this;
    }
    public ReasonsForApplyingPage enterDependsFamilyComeText(String dependsFamCome){
        wait.until(ExpectedConditions.visibilityOfElementLocated(dependsFamilyComeTextArea)).sendKeys(dependsFamCome);
        return this;
    }
    public ReasonsForApplyingPage clickDoYouHaveChildrenYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(haveChildrenYesBtn)).click();
        return this;
    }
    public ReasonsForApplyingPage selectChildrenAge(String childAgeSelect){
        Select selectChildrenAge = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(childrenAgeSelect)));
        selectChildrenAge.selectByValue(childAgeSelect);
        return this;
    }
    public ReasonsForApplyingPage selectHowLongPlanToStay(String stayLengthSelect){
        Select selectHowLongPlanToStay = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(howLongPlanToStaySelect)));
        selectHowLongPlanToStay.selectByValue(stayLengthSelect);
        return this;
    }
    public ReasonsForApplyingPage selectPreferredCityToWork(String cityPreferredSelect){
        Select selectPreferredCity = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(preferredCitySelect)));
        selectPreferredCity.selectByValue(cityPreferredSelect);
        return this;
    }
    public ReasonsForApplyingPage selectYearsOfWorkExperience(String workExpYearsSelect){
        Select selectYearsOfWorkExperience = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(yearsOfWorkExperienceSelect)));
        selectYearsOfWorkExperience.selectByValue(workExpYearsSelect);
        return this;
    }
    public ReasonsForApplyingPage selectHowHeardAboutUs(String heardAboutUsSelect){
        Select selectHowHeardAboutUs = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(howHeardAboutUsSelect)));
        selectHowHeardAboutUs.selectByValue(heardAboutUsSelect);
        return this;
    }
    public ReasonsForApplyingPage enterHowHeardAboutUsText(String heardAboutUs){
        wait.until(ExpectedConditions.visibilityOfElementLocated(howHeardAboutUsSelectTextArea)).sendKeys(heardAboutUs);

        return this;
    }
    public ReasonsForApplyingPage clickSaveAndCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
        return this;
    }
    public ReasonsForApplyingPage clickConfirmBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
        return this;
    }
    public ReasonsForApplyingPage clickOkBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
        return this;
    }







}
