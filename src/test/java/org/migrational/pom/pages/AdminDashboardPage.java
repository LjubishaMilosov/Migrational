package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminDashboardPage extends BasePage {

    private final By adminDashboardTitle = By.xpath("//h2[.='Dashboard']");
    private final By adminSearchFld = By.id("search_field");
    private final By candidatesDashboardSubtitle = By.xpath("//p[.='Candidates']");
    private final By numDashboardCandidatesDisplayed = By.xpath("//p[.='6']");
    //private final By candidatesLink = By.cssSelector("div[class='flex flex-col w-full pt-7 bg-gray-sidebar'] a[href='/admin/candidates']");
    private final By candidatesLink =By.id("candidates");
    private final By clientsLink = By.id("clients");
    private final By adminsLink = By.id("admins");
    private final By invoicesLink = By.id("invoices");
    private final By promoCodesLink = By.id("promo-codes");
    private final By paymentsLink = By.id("payments");
    private final By serviceProvidersLink = By.id("service-providers");
    private final By messagesLink = By.id("messages");
    private final By historyLink = By.id("history");
    public AdminDashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getDashboardTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(adminDashboardTitle)).getText();
    }
    public AdminDashboardPage enterTextInSearchField(String txt){
        wait.until(ExpectedConditions.presenceOfElementLocated(adminSearchFld)).sendKeys(txt);
        return this;
    }
    public String getDashboardCandidatesSubtitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(candidatesDashboardSubtitle)).getText();
    }
    public String getNumberOfDashboardCandidatesDisplayed(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(numDashboardCandidatesDisplayed)).getText();
    }






    public AdminCandidatesPage navigateToAdminCandidates(){
        wait.until(ExpectedConditions.elementToBeClickable(candidatesLink)).click();
        return new AdminCandidatesPage(driver);
    }
    public AdminClientsPage navigateToAdminClientsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(clientsLink)).click();
        return new AdminClientsPage(driver);
    }
    public AdminAdminsPage navigateToAdminAdminsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(adminsLink)).click();
        return new AdminAdminsPage(driver);
    }
    public AdminInvoicesPage navigateToAdminInvoicesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(invoicesLink)).click();
        return new AdminInvoicesPage(driver);
    }
    public AdminPromoCodesPage navigateToAdminPromoCodesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(promoCodesLink)).click();
        return new AdminPromoCodesPage(driver);
    }
    public AdminPaymentsPage navigateToAdminPaymentsPage(){
        wait.until(ExpectedConditions.elementToBeClickable(paymentsLink)).click();
        return new AdminPaymentsPage(driver);
    }
    public AdminServiceProvidersPage navigateToAdminServiceProvidersPage(){
        wait.until(ExpectedConditions.elementToBeClickable(serviceProvidersLink)).click();
        return new AdminServiceProvidersPage(driver);
    }
    public AdminMessagesPage navigateToAdminMessagesPage(){
        wait.until(ExpectedConditions.elementToBeClickable(messagesLink)).click();
        return new AdminMessagesPage(driver);
    }
    public AdminHistoryPage navigateToAdminHistoryPage(){
        wait.until(ExpectedConditions.elementToBeClickable(messagesLink)).click();
        return new AdminHistoryPage(driver);
    }







}
