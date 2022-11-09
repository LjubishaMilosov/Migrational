package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PreScreeningPage extends BasePage {

    private final By preScreeningWelcomeTitle =
            By.xpath("//h1[.='Welcome,  SelenuimTest']");

   // private final By getStartedBtn = By.cssSelector("//a[.='Get Started']");
     private final By getStartedBtn = By.id("first_step");
   // private final By getStartedBtn = By.xpath("//a[text()='Get Started']");
    //private final By covidStepLink = By.xpath("//div[text()='COVID-19 vaccination']");
    private final By covidStepLink = By.id("covid_vaccine");
    private final By personaInfoLink = By.cssSelector("a[href='/prescreening/personal-information']");
    private final By germanLangLink = By.cssSelector("a[href='/prescreening/german-level']");
    private final By educationLink = By.cssSelector("a[href='/prescreening/education']");
    private final By reasonsForApplyingLink = By.cssSelector("a[href='/prescreening/reasons-for-applying']");
    private final By nostrificationLink = By.cssSelector("a[href='/prescreening/nostrification']");

    public PreScreeningPage(WebDriver driver) {
        super(driver);
    }

    public String getPreScreeningWelcomeTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(preScreeningWelcomeTitle)).getText();
    }
    public Boolean assertPreScreeningWelcomeTitle() {
        return wait.until(ExpectedConditions.
                textToBePresentInElementLocated(preScreeningWelcomeTitle, "Welcome, SelenuimTest"));
    }

    /*public Covid19VaccinePage navigateToCovidVaccineStep() {
        List<WebElement> stepTitles = driver.findElements(covidStepLink);
        for (WebElement stepTitle : stepTitles) {
            String titleText = stepTitle.getText();
            if (titleText.equalsIgnoreCase("COVID-19 vaccination")) {
                stepTitle.click();
            }
        }
        return new Covid19VaccinePage(driver);
    }*/

    public Covid19VaccinePage navigateToCovidVaccineStep(){
        wait.until(ExpectedConditions.elementToBeClickable(covidStepLink)).click();
        return new Covid19VaccinePage(driver);
    }

    public PersonalInformationPage navigateToPersonalInfoStep() {
        wait.until(ExpectedConditions.elementToBeClickable(personaInfoLink)).click();
        return new PersonalInformationPage(driver);

    }
    public GermanLevelProficiencyPage navigateToGermanLanguageStep() {
        wait.until(ExpectedConditions.elementToBeClickable(germanLangLink)).click();
        return new GermanLevelProficiencyPage(driver);

    }
    public EducationQualificationPage navigateToEducationQualificationStep() {
        wait.until(ExpectedConditions.elementToBeClickable(educationLink)).click();
        return new EducationQualificationPage(driver);

    }
    public ReasonsForApplyingPage navigateToReasonsForApplyingStep() {
        wait.until(ExpectedConditions.elementToBeClickable(reasonsForApplyingLink)).click();
        return new ReasonsForApplyingPage(driver);

    }
    public NostrificationPage navigateToNostrificationStep() {
        wait.until(ExpectedConditions.elementToBeClickable(nostrificationLink)).click();
        return new NostrificationPage(driver);

    }
    /*public Covid19VaccinePage clickGetStatedToNavigateToCovidVaccineStep() {
        List<WebElement> stepTitles = driver.findElements(getStartedBtn);
        for (WebElement stepTitle : stepTitles) {
            String titleText = stepTitle.getText();
            System.out.println(titleText);
            if (titleText.equalsIgnoreCase("Get Started")) {
                driver.findElement(getStartedBtn).click();
            }
        }
        return new Covid19VaccinePage(driver);
    }*/
    public Covid19VaccinePage clickGetStatedToNavigateToCovidVaccineStep(){
        wait.until(ExpectedConditions.elementToBeClickable(getStartedBtn)).click();
        return new Covid19VaccinePage(driver);
    }


}