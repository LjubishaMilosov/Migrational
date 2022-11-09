package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmployerSearchForCandidatesPage extends BasePage {

    private final By employerSearchForCandidatesPageTitle = By.xpath("//h1[.='Search for Candidates']");

    public EmployerSearchForCandidatesPage(WebDriver driver) {
        super(driver);
    }
    public String getEmployerSearchForCandidatesPageTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(employerSearchForCandidatesPageTitle)).getText();
    }





}
