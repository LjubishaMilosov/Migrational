package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AdminCandidatesPage extends BasePage {

    private final By adminCandidatesTitle = By.xpath("//h1[.='Candidates']");
    private final By selectCandidatesStatusDropdown = By.id("status");
    private final By selectCandidatesPriorityDropdown = By.id("priority");
    private final By selectCandidatesMessagesDropdown = By.id("messages");

    public AdminCandidatesPage(WebDriver driver) {
        super(driver);
    }

    public String getAdminCandidatesTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(adminCandidatesTitle)).getText();
}
    public AdminCandidatesPage selectByCandidatesStatus(String candidatesStatus){
        Select selectFilterByStatus =
                new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectCandidatesStatusDropdown)));
    selectFilterByStatus.selectByValue(candidatesStatus);
    return this;
    }
    public AdminCandidatesPage selectByCandidatesPriority(String candidatesPriority){
        Select selectFilterByPriority =
                new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectCandidatesPriorityDropdown)));
        selectFilterByPriority.selectByValue(candidatesPriority);
        return this;
    }
    public AdminCandidatesPage selectCandidateMessages(String candidateMessages){
        Select selectFilterByMessages =
                new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectCandidatesMessagesDropdown)));
        selectFilterByMessages.selectByVisibleText(candidateMessages);
        return this;
    }





}
