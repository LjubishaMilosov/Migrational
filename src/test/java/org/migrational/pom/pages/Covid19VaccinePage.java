package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Covid19VaccinePage extends BasePage {

    private final By covidVaccineTitle = By.xpath("//h1[.='Covid-19 vaccine']");
    private final By yesButton = By.id("yes");
    private final By numOfVaccines = By.id("vaccine_dose");
    private final By vaccineOne = By.id("vaccine_1");
    private final By vaccineTwo = By.id("vaccine_2");
    private final By vaccineThree = By.id("vaccine_3");
    private final By vaccineFour = By.id("vaccine_4");

    private final By deleteCovidCertificate = By.cssSelector("svg[id='covid_certificate_delete_uploaded']");
    private final By attachVaccinationCertificate = By.id("covid_cert_file");
    private final By saveAndCloseBtn = By.xpath("//a[.='Save & Close']");
    private final By confirmBtn = By.xpath("//button[.='Confirm']");
    private final By okBtn = By.xpath("//button[.='Ok']");

    private final By closeBtn = By.xpath("//button[.='Close']");
    public Covid19VaccinePage(WebDriver driver) {
        super(driver);
    }

    public String getCovidVaccinePageTitle(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(covidVaccineTitle)).getText();
    }
    public Covid19VaccinePage yesVaccinateButton(){
        wait.until(ExpectedConditions.elementToBeClickable(yesButton)).click();
        return this;
}
    public Covid19VaccinePage selectNumberOfVaccines(String numVaccines) {
        Select selectNumberOfVaccines = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(numOfVaccines)));
        selectNumberOfVaccines.selectByValue(numVaccines);
        return this;
    }
    public Covid19VaccinePage selectVaccineOne(String vaccine1) {
        Select selectVaccineOne = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(vaccineOne)));
        selectVaccineOne.selectByValue(vaccine1);
        return this;
    }
    public Covid19VaccinePage selectVaccineTwo(String vaccine2) {
        Select selectVaccineTwo = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(vaccineTwo)));
        selectVaccineTwo.selectByValue(vaccine2);
        return this;
    }
    public Covid19VaccinePage selectVaccineThree(String vaccine3) {
        Select selectVaccineThree = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(vaccineThree)));
        selectVaccineThree.selectByValue(vaccine3);
        return this;
    }
    public Covid19VaccinePage selectVaccineFour(String vaccine4) {
        Select selectVaccineFour = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(vaccineFour)));
        selectVaccineFour.selectByValue(vaccine4);
        return this;
    }
    public Covid19VaccinePage clickDeleteCovidCertificate() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteCovidCertificate)).click();
        return this;
    }
    public Covid19VaccinePage clickCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(closeBtn)).click();
        return this;
    }
    public Covid19VaccinePage deleteCovidCert() {
        WebElement deleteSvg = wait.until(ExpectedConditions.elementToBeClickable(deleteCovidCertificate));
            if (!deleteSvg.isSelected()) {
               clickDeleteCovidCertificate();
                clickConfirmBtn();
                clickCloseBtn();
            }
            return this;
        }

    public Covid19VaccinePage attachYourVaccinationCertificate(String certPath){
        driver.findElement(attachVaccinationCertificate).sendKeys(certPath);
        return this;
    }
    public Covid19VaccinePage clickSaveAndCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
        return this;
    }
    public Covid19VaccinePage clickConfirmBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
        return this;
    }
    public Covid19VaccinePage clickOkBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
        return this;
    }


}
