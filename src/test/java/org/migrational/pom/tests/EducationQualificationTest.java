package org.migrational.pom.tests;

import org.migrational.pom.base.BaseTest;
import org.migrational.pom.objects.LoginCandidate;
import org.migrational.pom.pages.EducationQualificationPage;
import org.migrational.pom.pages.LandingPage;
import org.migrational.pom.pages.LoginPage;
import org.migrational.pom.pages.PreScreeningPage;
import org.migrational.pom.utils.JacksonUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class EducationQualificationTest extends BaseTest {


    @Test
    public void educationQualificationTest() throws InterruptedException, IOException {
        LoginCandidate loginCandidate =
                JacksonUtils.deserializeJson("loginCandidate.json", LoginCandidate.class);

        LandingPage landingPage = new LandingPage(driver).load();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        LoginPage loginPage = landingPage.clickLoginLink();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Login to your account");
        loginPage.
                setLoginCandidate(loginCandidate).
                clickRememberMeCheckBox().
                clickSubmitButton();
        PreScreeningPage preScreeningPage = new PreScreeningPage(driver);
        Assert.assertEquals(preScreeningPage.getPreScreeningWelcomeTitle(), "Welcome, SelenuimTest");
        js.executeScript("window.scrollBy(0,500)");
        EducationQualificationPage educationQualificationPage = preScreeningPage.navigateToEducationQualificationStep();
        js.executeScript("window.scrollBy(0,-500)");

        Assert.assertEquals(educationQualificationPage.getEducationQualificationStepTitle(), "Education, qualifications and work experience");
        educationQualificationPage.clickCheckBoxHighSchoolMedicalDegree();
        educationQualificationPage.uploadHighSchoolMedicalDegree("C:/Users/USER/Documents/MigrationalPngs/HighSchoolMedicalDegree.png");
        educationQualificationPage.deleteHighSchoolMedicalDegree();
        educationQualificationPage.clickConfirmBtn();
        educationQualificationPage.clickOkBtn();
        educationQualificationPage.clickCheckBoxHighSchoolMedicalDegree();
        educationQualificationPage.clickMedicalSchoolPreQualification();
        educationQualificationPage.uploadMedicalSchoolPreQualification("C:/Users/USER/Documents/MigrationalPngs/HighMedicalSchoolPrequalification.png");
        educationQualificationPage.deleteMedicalSchoolPreQualification();
        educationQualificationPage.clickConfirmBtn();
        educationQualificationPage.clickOkBtn();
        educationQualificationPage.clickMedicalSchoolPreQualification();
        educationQualificationPage.clickCheckCollegeDegree();
        educationQualificationPage.uploadCollegeDegree("C:/Users/USER/Documents/MigrationalPngs/CollegeDegree.png");
        educationQualificationPage.deleteCollegeDegree();
        educationQualificationPage.clickConfirmBtn();
        educationQualificationPage.clickOkBtn();
        educationQualificationPage.clickCheckCollegeDegree();
        js.executeScript("window.scrollBy(0,400)");
        educationQualificationPage.clickCheckCollegePlusSpecialization();
        educationQualificationPage.uploadCollegePlusSpecialization("C:/Users/USER/Documents/MigrationalPngs/College+Specialization.png");
        educationQualificationPage.deleteCollegePlusSpecialization();
        educationQualificationPage.clickConfirmBtn();
        educationQualificationPage.clickOkBtn();
        educationQualificationPage.clickCheckCollegePlusSpecialization();
        educationQualificationPage.clickCheckBoxOtherSpecialization();
        educationQualificationPage.enterSpecializationInfoArea("BioPharmacy");
        educationQualificationPage.uploadOtherSpecialization("C:/Users/USER/Documents/MigrationalPngs/OtherSpecialization.png");
        educationQualificationPage.deleteOtherSpecialization();
        educationQualificationPage.clickConfirmBtn();
        educationQualificationPage.clickOkBtn();
        educationQualificationPage.clickCheckBoxOtherSpecialization();
        educationQualificationPage.clickCurrentlyInGermanyYesBtn();
        js.executeScript("window.scrollBy(0,500)");
        educationQualificationPage.clickCurrentlyWorkingYesBtn();
        educationQualificationPage.selectCurrentCity("Leipzig");
        educationQualificationPage.enterCurrentEmployerInfo("PharmaBox");
        educationQualificationPage.clickSaveAndCloseBtn();
        educationQualificationPage.clickConfirmBtn();
        educationQualificationPage.clickOkBtn();

    }


}


