package org.migrational.pom.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class MyFirstTest {
// css selector for login button = : ".ml-5 div > a"

    /*@Test
    public void registerCandidateTest() throws InterruptedException {
        //  System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://develop.migrational.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create Account")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("label[for='candidate'] ")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/registration-info/candidate']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first_name")).sendKeys("bla");
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("bla");
        Thread.sleep(1000);
        driver.findElement(By.id("date_day")).click();

        Select days = new Select(driver.findElement(By.id("date_day")));
        *//*
        List<WebElement> optionsDay = days.getOptions();
         System.out.println("The dropdown options are:");
        for(WebElement options : optionsDay)
            System.out.println(options.getText());
        System.out.println("Select the Option by value 19");
        days.selectByValue("19");
        System.out.println("Select value is: " + days.getFirstSelectedOption().getText());
         *//*

        Select months = new Select(driver.findElement(By.id("date_mounth_desktop")));
        // WebElement yearDropdown = driver.findElement(By.id("date_of_birth"));
        Select years = new Select(driver.findElement(By.id("date_of_birth")));

        days.selectByValue("29");
        Thread.sleep(2000);
        months.selectByValue("October");
        Thread.sleep(2000);
        years.selectByValue("1983");
        Thread.sleep(2000);

        Select countries = new Select(driver.findElement(By.id("country")));
        List<WebElement> optionsCountry = countries.getOptions();
        System.out.println("The dropdown options are:");
        for (WebElement options : optionsCountry)
            System.out.println(options.getText());
        Thread.sleep(2000);
        System.out.println("Select the Option by value Macedonia");
        countries.selectByVisibleText("Macedonia");
        Thread.sleep(2000);
        System.out.println("Select value is: " + countries.getFirstSelectedOption().getText());

        Select cities = new Select(driver.findElement(By.id("city")));
        List<WebElement> optionsCity = countries.getOptions();
        System.out.println("The dropdown options are:");
        for (WebElement options : optionsCity)
            System.out.println(options.getText());
        Thread.sleep(2000);
        System.out.println("Select the Option by value Probishtip");
        cities.selectByVisibleText("Probishtip");
        Thread.sleep(2000);
        System.out.println("Select value is: " + countries.getFirstSelectedOption().getText());

        driver.findElement(By.id("phone")).sendKeys("9876543");
        Thread.sleep(1000);

        driver.findElement(By.id("email")).sendKeys("bla123@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("blabla1234");
        Thread.sleep(1000);

        driver.findElement(By.id("repeat_password")).sendKeys("blabla1234");
        Thread.sleep(1000);

        driver.findElement(By.id("terms_and_conditions")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);

        driver.quit();
    }*/

    //    Check why this didn't work   !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // cause it's a simple select
        /*
        WebElement dayPicker = driver.findElement(By.id("date_day"));
        List<WebElement> days = dayPicker.findElements(By.linkText("19"));

        for (WebElement d:days)
        {

            if(d.getText().equals("19"))
            {
                d.click();
            }
            Thread.sleep(3000);
        }
        */


    /*@Test
    public void activateCandidateAccountTest () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://mailhog.migrational.com/#");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        int i;
        int count = driver.findElements(By.cssSelector("div[class='msglist-message row ng-scope']")).size();
        System.out.println(count);
        for (i = 0; i < count; i++) {
            String emailName = driver.findElements(By.cssSelector("div[class='ng-binding ng-scope']"))
                    .get(i).getText();
            String emailDescription = driver.findElements(By.cssSelector("span[class='subject unread ng-binding']"))
                    .get(i).getText();

            if (emailName.equalsIgnoreCase("bla123@gmail.com") &&
                    emailDescription.equalsIgnoreCase("Activate Your Account")) {
                driver.findElements(By.cssSelector("div[class='msglist-message row ng-scope']")).get(i).click();
                Thread.sleep(3000);
                break;
            }
        }

        Thread.sleep(3000);
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number of iframes are " + iframeElements.size());
        //Switch by frame name
        driver.switchTo().frame("preview-html");

        //Switch by frame ID
        //  driver.switchTo().frame("preview-html");
        System.out.println(driver.findElement(By.linkText("Activate Account")).getText());
        driver.findElement(By.linkText("Activate Account")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        //switch to frame by web element
        //WebElement iframeElement = driver.findElement(By.id("IF1"));
        // driver.switchTo().frame(iframeElement);

        //String text = driver.findElement(By.cssSelector("span[class='leading-19px']")).getText();
        // String text = driver.findElement(By.cssSelector("span[class='leading-19px'] svg")).getText();
        // System.out.println(text);




        //driver.findElement(By.id("email")).sendKeys("bibi@gmail.com");

    }*/


   /* @Test
    public void loginCandidateTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://develop.migrational.com");
        driver.manage().window().maximize();

        //String text = driver.findElement(By.cssSelector("span[class='leading-19px']")).getText();
        // String text = driver.findElement(By.cssSelector("span[class='leading-19px'] svg")).getText();
        // System.out.println(text);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("bla123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("blabla1234");
        driver.findElement(By.id("remember_me")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);
        driver.quit();
    }*/

   /* @Test
    public void sendResetPasswordMailTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://develop.migrational.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("mbmb@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);
        String text = driver.findElement(By.xpath("//h1[contains(text(),'Check in your email')]")).getText();
        Thread.sleep(3000);
        System.out.println(text);*/

        /*   code to check the 'click here' link in case reset password mail wasn't sent the first time

        driver.findElement(By.linkText("click here")).click();
        driver.findElement(By.id("email")).sendKeys("mbmb@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(3000);
        */

    //}

    /*@Test
    public void passwordResetTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://mailhog.migrational.com/#");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        int i;
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
        }

        Thread.sleep(3000);
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number of iframes are " + iframeElements.size());
        //Switch by frame name
        driver.switchTo().frame("preview-html");

        //Switch by frame ID
        //  driver.switchTo().frame("preview-html");
        System.out.println(driver.findElement(By.linkText("Reset Password")).getText());
        driver.findElement(By.linkText("Reset Password")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();*/


        // following code fail because the driver is out of scope or something:
       /*
       String resetMsg = driver.findElement(By.xpath("//h1[contains(text(),'Reset your password')]")).getText();
        System.out.println(resetMsg);
        driver.findElement(By.id("new-password")).sendKeys("mbmb12345@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("confirm-password")).sendKeys("mbmb12345@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        */
















}