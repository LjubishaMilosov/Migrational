package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.*;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReasonsForApplyingTest extends BaseTest {

    @Test
    public void reasonsForApplyingTest() throws IOException{

        LoginCandidate loginCandidate =
                JacksonUtils.deserializeJson("loginCandidate.json", LoginCandidate.class);

        LandingPage landingPage = new LandingPage(driver).load();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        LoginPage loginPage = landingPage.clickLoginLink();
        Assert.assertEquals(loginPage.
                getLoginPageTitle(), "Login to your account");
        loginPage.
                setLoginCandidate(loginCandidate).
                clickRememberMeCheckBox().
                clickSubmitButton();
        PreScreeningPage preScreeningPage = new PreScreeningPage(driver);
        Assert.assertEquals(preScreeningPage.
                getPreScreeningWelcomeTitle(), "Welcome, SelenuimTest");
        js.executeScript("window.scrollBy(0,500)");

        ReasonsForApplyingPage reasonsForApplyingPage = preScreeningPage.navigateToReasonsForApplyingStep();
        js.executeScript("window.scrollBy(0,-300)");

        Assert.assertEquals(reasonsForApplyingPage.
                getReasonsForApplyingStepTitle(), "Reasons for applying and expectations");
        reasonsForApplyingPage.
                selectReasonForWorkInGermany("other_reason").
                enterReasonsForWorkInGermanyText("Other, other reasons");
        js.executeScript("window.scrollBy(0,200)");
        reasonsForApplyingPage.clickChangeCurrentJobNoBtn();
        //   error:
        /*org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <input class="peer absolute left-5 pl-5 w-4 h-4" type="radio" id="no_work" name="change_current_job" value="no"> is not clickable at point (607, 40). Other element would receive the click: <a href="/job-seekers" class="flex items-center leading-19px px-2 2xl:px-4" data-v-1911fab2="">...</a>
                (Session info: chrome=104.0.5112.81)
        Build info: version: '4.3.0', revision: 'a4995e2c09*'
        System info: host: 'DESKTOP-OUPB4CA', ip: '10.0.0.3', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '18.0.1.1'
        Driver info: org.openqa.selenium.chrome.ChromeDriver
        Command: [89cf750c80abfdc2903db5aeda54a390, clickElement {id=25aa351d-3408-4fce-bf7d-0157da0b0adb}]
        Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\Users\USER\AppData\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57514}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:57514/devtoo..., se:cdpVersion: 104.0.5112.81, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}
        Element: [[ChromeDriver: chrome on WINDOWS (89cf750c80abfdc2903db5aeda54a390)] -> id: no_work]
            Session ID: 89cf750c80abfdc2903db5aeda54a390*/


        reasonsForApplyingPage.clickChangeCurrentJobYesBtn();
        //  error:
        /*org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <input class="peer absolute left-5 pl-5 w-4 h-4" type="radio" id="yes_work" name="change_current_job" value="yes"> is not clickable at point (403, 40). Other element would receive the click: <a href="/" class="flex items-center leading-19px px-2 2xl:px-4" data-v-1911fab2="">...</a>
                (Session info: chrome=104.0.5112.81)
        Build info: version: '4.3.0', revision: 'a4995e2c09*'
        System info: host: 'DESKTOP-OUPB4CA', ip: '10.0.0.3', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '18.0.1.1'
        Driver info: org.openqa.selenium.chrome.ChromeDriver
        Command: [48f0349c5711c8ff7483858755126325, clickElement {id=a8015a1a-562a-4760-8178-8b492f0e0a76}]
        Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\Users\USER\AppData\Local...}, goog:chromeOptions: {debuggerAddress: localhost:56911}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56911/devtoo..., se:cdpVersion: 104.0.5112.81, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}
        Element: [[ChromeDriver: chrome on WINDOWS (48f0349c5711c8ff7483858755126325)] -> id: yes_work]
            Session ID: 48f0349c5711c8ff7483858755126325*/


        reasonsForApplyingPage.enterReasonsToChangeCurrentJobText("Better development opportunities");
        //error:
        /*org.openqa.selenium.ElementNotInteractableException: element not interactable
                (Session info: chrome=104.0.5112.81)
        Build info: version: '4.3.0', revision: 'a4995e2c09*'
        System info: host: 'DESKTOP-OUPB4CA', ip: '10.0.0.3', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '18.0.1.1'
        Driver info: org.openqa.selenium.chrome.ChromeDriver
        Command: [b381a211ea5b7c837c86ce617d254b07, sendKeysToElement {id=75fb2157-3afe-40da-8a1a-9f8273e159b4, value=[Ljava.lang.CharSequence;@f9b5552}]
        Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\Users\USER\AppData\Local...}, goog:chromeOptions: {debuggerAddress: localhost:63582}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63582/devtoo..., se:cdpVersion: 104.0.5112.81, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}
        Element: [[ChromeDriver: chrome on WINDOWS (b381a211ea5b7c837c86ce617d254b07)] -> id: current_employer]
            Session ID: b381a211ea5b7c837c86ce617d254b07*/
        js.executeScript("window.scrollBy(0,300)");
        reasonsForApplyingPage.
                clickCurrentlyWorkInGermanyYesBtn().
                selectCurrentlyLocatedCity("Leipzig");
        js.executeScript("window.scrollBy(0,300)");
        reasonsForApplyingPage.
                clickFirstJobInGermanyYesBtn().
                clickTravelPreferenceByLandBtn();
        js.executeScript("window.scrollBy(0,200)");
                reasonsForApplyingPage.selectAccommodationPreference("platform_to_assist").
                selectCommunicationPreference("the_platform");
        js.executeScript("window.scrollBy(0,300)");
        reasonsForApplyingPage.
                selectTakeFamilyWithYou("yes").
                enterYesFamilyComeText("We are travelling together").
                selectTakeFamilyWithYou("depends").
                enterDependsFamilyComeText("If the company provides visas");
        js.executeScript("window.scrollBy(0,300)");
        reasonsForApplyingPage.
                clickDoYouHaveChildrenYesBtn().
                selectChildrenAge("above_and_under_16");
        js.executeScript("window.scrollBy(0,200)");
        reasonsForApplyingPage.selectHowLongPlanToStay("three_to_10_years").
                selectPreferredCityToWork("Bremen");
        js.executeScript("window.scrollBy(0,300)");
        reasonsForApplyingPage.
                selectYearsOfWorkExperience("three_plus_years").
                selectHowHeardAboutUs("other").
                 enterHowHeardAboutUsText("A friend recommended you").
                clickSaveAndCloseBtn().
                clickConfirmBtn().
                clickOkBtn();
    }



}
