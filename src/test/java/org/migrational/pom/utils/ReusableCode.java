package org.migrational.pom.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableCode {

   /* List<WebElement> stepTitles = driver.findElements(By.cssSelector
            ("div[class='text-gray-color-500 font-medium text-base leading-19px mb-1']"));
        for (WebElement stepTitle : stepTitles) {
        String titleText =stepTitle.getText();
        if(titleText.equalsIgnoreCase("COVID-19 vaccination"))
        {
            driver.findElement(By.cssSelector("a[href='/prescreening/covid-vaccine']")).click();
        }
    }*/
    /*WebElement radioButton = driver.findElement(By.cssSelector("input[id='no']"));
    String yesButtonId = radioButton.getAttribute("id");
        if(yesButtonId.equalsIgnoreCase("no") && !radioButton.isSelected())
    {
        radioButton.click();
    }*/


    /*List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for(WebElement radioBtn : radioButtons){
        String buttonId = radioBtn.getAttribute("id");
        if(buttonId.equalsIgnoreCase("yes") && !radioBtn.isSelected())
        {
            radioBtn.click();
        }
    }*/


   /* int j;
    int deleteSvgCount = driver.findElements(By.cssSelector("div[class='cursor-pointer']")).size();
        System.out.println(deleteSvgCount);
        for (j = 0; j < deleteSvgCount; j++){
        String uploadText = driver.findElements(By.cssSelector("span[class='text-gray-color-300']")).get(j).getText();
        System.out.println(uploadText);
        if(uploadText.contains("COVID19Certificate.png")){
            driver.findElements(By.cssSelector("div[class='cursor-pointer']")).get(j).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//button[.='Confirm']")).click();
            Thread.sleep(4000);
                *//* driver.findElement(By.xpath("//button[.='Close']")).click();
                Thread.sleep(4000);*//*
            driver.findElement(By.xpath("//button[.='Ok']")).click();
            Thread.sleep(4000);
        }
    }*/

   /* List<WebElement> uploadLinks1 = driver.findElements(By.cssSelector("input[type='file']"));
        for(WebElement uploadLink : uploadLinks1){
        String linkId = uploadLink.getAttribute("id");
        if(linkId.equalsIgnoreCase("covid_cert_file"))
        {
            uploadLink.sendKeys("C:/Users/USER/Documents/MigrationalPngs/COVID19Certificate.png");
        }
    }*/


   /* int i;
    int count = driver.findElements(By.cssSelector("div[class='msglist-message row ng-scope']")).size();
        System.out.println(count);
        for (i = 0; i < count; i++) {
        String emailName = driver.findElements(By.cssSelector("div[class='ng-binding ng-scope']"))
                .get(i).getText();
        String emailDescription = driver.findElements(By.cssSelector("span[class='subject unread ng-binding']"))
                .get(i).getText();
        if (emailName.equalsIgnoreCase("lala@gmail.com") &&
                emailDescription.equalsIgnoreCase("Reset Password Notification")) {
            driver.findElements(By.cssSelector("div[class='msglist-message row ng-scope']")).get(i).click();
            Thread.sleep(3000);
            break;
        }
    }*/



    /*List<WebElement> certificateUploadCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for(WebElement certificateUploadCheckBox : certificateUploadCheckBoxes){
        String uploadLinkId = certificateUploadCheckBox.getAttribute("id");
        if(uploadLinkId.equalsIgnoreCase("checkSchool_high_school") && !certificateUploadCheckBox.isSelected())
        {
            certificateUploadCheckBox.click();
        }
    }*/


    /*List<WebElement> certificateuploadLinks =
            driver.findElements(By.cssSelector("input[type='file']"));
        for(WebElement certificateUploadLink : certificateuploadLinks){
        String uploadLinkId = certificateUploadLink.getAttribute("id");
        System.out.println(uploadLinkId);
        if(uploadLinkId.equalsIgnoreCase("level_high_school_file"))
        {
            certificateUploadLink.sendKeys("C:/Users/USER/Documents/MigrationalPngs/HighSchoolMedicalDegree.png");
        }
    }*/







}
