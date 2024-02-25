package com.base;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    
    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }


    public WebDriver chromeDriverConnection(){
        
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
    
        // Implicit wait 
        driver.manage().timeouts().implicitlyWait( 
             10, TimeUnit.SECONDS); 
             
        return driver;
    }


    public void endConnection() { 
        this.driver.quit();
    }


    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }


    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }


    public String getText(By locator){
        return driver.findElement(locator).getText();
    }


    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }


    public void click(By locator){
        driver.findElement(locator).click();
    }


    public Boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
        
    }


    public void visit(String url){
        driver.get(url);
    }


    public String getTitlePage(){
        return driver.getTitle();
    }


    public Boolean isEnabled(By locator){
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
        
    }
}
