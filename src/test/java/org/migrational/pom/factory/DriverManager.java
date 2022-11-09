package org.migrational.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.migrational.pom.constants.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    public WebDriver initializeDriver(){
        WebDriver driver;
        String browser = System.getProperty("browser", "CHROME");
        switch (BrowserType.valueOf(browser)) {
            case CHROME -> {
                WebDriverManager.chromedriver().cachePath("Drivers").setup();
                driver = new ChromeDriver();
            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
                driver = new FirefoxDriver();
            }
            default -> throw new IllegalStateException("Invali browser name: " + browser);
        }





        driver.manage().window().maximize();
    //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }


}
