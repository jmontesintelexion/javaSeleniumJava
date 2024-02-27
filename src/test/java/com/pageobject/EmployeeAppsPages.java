package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeAppsPages extends LoginPage{
     /*
     * EJEMPLOS:
     * 
     * @FindBy(id = "foobar") By foobar;
     * @FindBy(className = "foobar") By foobar;
     * @FindBy(css = "foobar") By foobar;
     * @FindBy(linkText = "foobar") By foobar;
     * @FindBy(name = "foobar") By foobar;
     * @FindBy(partialLinkText = "foobar") By foobar;
     * @FindBy(tagName = "foobar") By foobar;
     * @FindBy(using = "foobar") By foobar;
     * @FindBy(xpath = "foobar") By foobar;
     * 
     */



     private By EA_Asistencia = By.cssSelector("#container > div > div > div > div > div > div:nth-child(1) > div:nth-child(5) > ul > li:nth-child(8) > span");
     private By title_EA_Asistencia = By.cssSelector("#container > div > div > div > div > div > div:nth-child(1) > div:nth-child(5) > ul > li:nth-child(8) > aside > header > h2");
     private By close_EA_Asistencia = By.cssSelector("#container > div > div > div > div > div > div:nth-child(1) > div:nth-child(5) > ul > li:nth-child(8) > aside > header > div > button > i");
     private By asidePanel_EA_Asistencia = By.cssSelector("#container > div > div > div > div > div > div:nth-child(1) > div:nth-child(5) > ul > li:nth-child(8) > aside");
     private By subTitleApp_EA_Asistencia = By.cssSelector("#HeaderCard > div > div > div.card-body > div.header-card-container > div.header-card-small-title");
     private By titleRegistrarAsistencia_EA_Asistencia = By.cssSelector("#RegistrarAsistencia > div > div > div.card-header > div");
     
    
     

    //@FindBy(id = "Username") By Username;
    //@FindBy(id = "btnSubmit") By btnSubmit;
    //@FindBy(id = "pwd") By pwd;
    //@FindBy(id = "login") By login;


     private final String USER_SEARCHED = "jorge pruebas soporte";



    public EmployeeAppsPages(WebDriver driver){
        super(driver);

    }


   public Boolean homeAbrirEmployeeAppAsistencia() throws InterruptedException{
       loginUser();
       click(EA_Asistencia);
       Thread.sleep(10000);
       return isDisplayed(asidePanel_EA_Asistencia);
    }

    public Boolean homeCerrarEmployeeAppAsistencia() throws InterruptedException{
        loginUser();
        click(EA_Asistencia);
        Thread.sleep(10000);
        click(close_EA_Asistencia);
        return isDisplayed(asidePanel_EA_Asistencia);
     }

    public String homeTitleEmployeeAppAsistencia(){
        return getText(title_EA_Asistencia);
    }

    public String homeSubtitleAppEmployeeAppAsistencia(){
        return getText(subTitleApp_EA_Asistencia);
    }

    public String homeTitleRegistroAsistenciaEmployeeAppAsistencia(){
        return getText(titleRegistrarAsistencia_EA_Asistencia);
    }
    

}

