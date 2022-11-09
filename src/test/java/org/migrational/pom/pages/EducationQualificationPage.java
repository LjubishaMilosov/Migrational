package org.migrational.pom.pages;

import org.migrational.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class EducationQualificationPage extends BasePage {

    private final By educationQualificationTitle = By.xpath("//h1[.='Education, qualifications and work experience']");
    private final By checkBoxHighSchoolMedicalDegree = By.id("checkSchool_high_school");
    private final By uploadHighSchoolMedicalDegreeBtn = By.id("level_high_school_file");
    private final By deleteHighSchoolMedicalDegree = By.id("level_high_school_delete_uploaded");
    private final By checkBoxMedicalSchoolPreQualification = By.id("checkSchool_medical_school");
    private final By uploadMedicalSchoolPreQualificationBtn = By.id("level_medical_school_file");
    private final By deleteMedicalSchoolPreQualification = By.id("level_medical_school_delete_uploaded");
    private final By checkBoxCollegeDegree = By.id("checkSchool_college_degree");
    private final By uploadCollegeDegreeBtn = By.id("level_college_degree_file");
    private final By deleteCollegeDegree = By.id("level_college_degree_delete_uploaded");
    private final By checkBoxCollegePlusSpecialization = By.id("checkSchool_college_specialization");
    private final By uploadCollegePlusSpecializationBtn = By.id("level_college_specialization_file");
    private final By deleteCollegePlusSpecialization = By.id("level_college_specialization_delete_uploaded");
    private final By checkBoxOtherSpecialization = By.id("checkSchool_other_specialization");
    private final By specializationInfoTextArea = By.cssSelector("textarea[name='other_spec_info']");
    private final By uploadOtherSpecializationBtn = By.id("level_other_specialization_file");
    private final By deleteOtherSpecialization = By.id("level_other_specialization_delete_uploaded");
    private final By currentlyInGermanyYesBtn = By.id("yes_working");
    private final By currentlyWorkingYesBtn = By.id("yes_working_g");
    private final By selectCurrentCityDpd = By.id("current_province");
    private final By currentEmployerInfoArea = By.id("current_employer");
    private final By saveAndCloseBtn = By.xpath("//a[.='Save & Close']");
    private final By confirmBtn = By.xpath("//button[.='Confirm']");
    private final By okBtn = By.xpath("//button[.='Ok']");

    public EducationQualificationPage(WebDriver driver) {
        super(driver);
    }

    public String getEducationQualificationStepTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(educationQualificationTitle)).getText();
    }
    public EducationQualificationPage clickCheckBoxHighSchoolMedicalDegree(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxHighSchoolMedicalDegree)).click();
        return this;
    }
    public EducationQualificationPage uploadHighSchoolMedicalDegree(String highSchoolMedicalDegreePath){
       wait.until(ExpectedConditions.presenceOfElementLocated(uploadHighSchoolMedicalDegreeBtn)).
               sendKeys(highSchoolMedicalDegreePath);
        return this;
    }
    public EducationQualificationPage deleteHighSchoolMedicalDegree(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteHighSchoolMedicalDegree)).click();
        return this;
    }
    public EducationQualificationPage clickMedicalSchoolPreQualification(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxMedicalSchoolPreQualification)).click();

        return this;
    }
    public EducationQualificationPage uploadMedicalSchoolPreQualification(String medicalSchoolPreQualificationPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadMedicalSchoolPreQualificationBtn)).
                sendKeys(medicalSchoolPreQualificationPath);
        return this;
    }
    public EducationQualificationPage deleteMedicalSchoolPreQualification(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteMedicalSchoolPreQualification)).click();
        return this;
    }
    public EducationQualificationPage clickCheckCollegeDegree(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxCollegeDegree)).click();
        return this;
    }
    public EducationQualificationPage uploadCollegeDegree(String collegeDegreePath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadCollegeDegreeBtn)).
                sendKeys(collegeDegreePath);
        return this;
    }
    public EducationQualificationPage deleteCollegeDegree(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteCollegeDegree)).click();
        return this;
    }
    public EducationQualificationPage clickCheckCollegePlusSpecialization(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxCollegePlusSpecialization)).click();
        return this;
    }
    public EducationQualificationPage uploadCollegePlusSpecialization(String collegePlusSpecializationPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadCollegePlusSpecializationBtn)).
                sendKeys(collegePlusSpecializationPath);
        return this;
    }
    public EducationQualificationPage deleteCollegePlusSpecialization(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteCollegePlusSpecialization)).click();
        return this;
    }
    public EducationQualificationPage clickCheckBoxOtherSpecialization(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxOtherSpecialization)).click();
        return this;
    }
    public EducationQualificationPage enterSpecializationInfoArea(String specializationDescription){
        wait.until(ExpectedConditions.visibilityOfElementLocated(specializationInfoTextArea)).
                sendKeys(specializationDescription);
        return this;
    }
    public EducationQualificationPage uploadOtherSpecialization(String otherSpecializationPath){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadOtherSpecializationBtn)).
                sendKeys(otherSpecializationPath);
        return this;
    }
    public EducationQualificationPage deleteOtherSpecialization(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteOtherSpecialization)).click();
        return this;
    }
    public EducationQualificationPage clickCurrentlyWorkingYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(currentlyWorkingYesBtn)).click();
        return this;
    }
    public EducationQualificationPage clickCurrentlyInGermanyYesBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(currentlyInGermanyYesBtn)).click();
        return this;
    }
    public EducationQualificationPage selectCurrentCity(String city){
        Select selectCurrentCity = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(selectCurrentCityDpd)));
        selectCurrentCity.selectByValue(city);
        return this;
    }
    public EducationQualificationPage enterCurrentEmployerInfo(String currEmpInfo){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentEmployerInfoArea)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentEmployerInfoArea)).sendKeys(currEmpInfo);
        return this;
    }
    public EducationQualificationPage clickSaveAndCloseBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
        return this;
    }
    public EducationQualificationPage clickConfirmBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(confirmBtn)).click();
        return this;
    }
    public EducationQualificationPage clickOkBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();
        return this;
    }














}