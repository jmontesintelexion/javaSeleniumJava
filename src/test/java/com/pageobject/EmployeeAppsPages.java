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
     private By ubicacionesRegistrarAsistencia_EA_Asistencia = By.cssSelector("#RegistrarAsistencia > div > div > div.card-body > div");
     private By titleBitacoraDeMiAsistencia_EA_Asistencia = By.cssSelector("#MiBitacora > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleBitacoraDeMiAsistencia_EA_Asistencia = By.cssSelector("#MiBitacora > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By titleTurnoActual_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleTurnoActual_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By txtNombreDelTurno_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(1) > td > span > div.generalData-ColumnName > div");
     private By subTxtNombreDelTurno_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(1) > td > span > div.generalData-ColumnValue > div");
     private By txtFecha_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(2) > td > span > div.generalData-ColumnName > div");
     private By subTxtFecha_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(2) > td > span > div.generalData-ColumnValue > div");
     private By txtHorario_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(3) > td > span > div.generalData-ColumnName > div");
     private By subTxtHorario_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(3) > td > span > div.generalData-ColumnValue > div");
     private By txtUbicacion_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(4) > td > span > div.generalData-ColumnName > div");
     private By subTxtUbicacion_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(4) > td > span > div.generalData-ColumnValue > div");
     private By txtNip_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(5) > td > span > div.generalData-ColumnName > div");
     private By subTxtNip_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(1) > div > div.card-body > table > tbody > tr:nth-child(5) > td > span > div.generalData-ColumnValue > div");
     private By mapa_EA_Asistencia = By.cssSelector("#MiTurnoActual > div > div > div.card-body > div > div > div:nth-child(2) > div");
     private By titleMiAusentismo_EA_Asistencia = By.cssSelector("#MiAusentismo > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleMiAusentismo_EA_Asistencia = By.cssSelector("#MiAusentismo > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By graficosMiAusentismo_EA_Asistencia = By.cssSelector("#MiAusentismo > div > div > div.card-body > div > div");
     private By titleCalendarioAsistencia_EA_Asistencia = By.cssSelector("#MiCalendarioDeAsistencia > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleCalendarioAsistencia_EA_Asistencia = By.cssSelector("#MiCalendarioDeAsistencia > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By calendariosAsistencia_EA_Asistencia = By.cssSelector("#MiCalendarioDeAsistencia > div > div > div.card-body.has-footer");
     private By titleTarjetaAsistencia_EA_Asistencia = By.cssSelector("#MiTarjeta > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleTarjetaAsistencia_EA_Asistencia = By.cssSelector("#MiTarjeta > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By tarjetaAsistencia_EA_Asistencia = By.cssSelector("#MiTarjeta > div > div > div.card-body");
     private By titleHomeOffice_EA_Asistencia = By.cssSelector("#MiHomeOffice > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleHomeOffice_EA_Asistencia = By.cssSelector("#MiHomeOffice > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By btnHomeOffice_EA_Asistencia = By.cssSelector("#MiHomeOffice > div > div > div.card-header.header-subtitle > div.right-actions > button");
     private By mapaHomeOffice_EA_Asistencia = By.cssSelector("#MiHomeOffice > div > div > div.card-body > div > div > div:nth-child(2) > div > div.card-body > div > div > div > div > div.gm-style > div:nth-child(1) > div:nth-child(2)");
     private By titleAsistenciaEquipo_EA_Asistencia = By.cssSelector("#MiEquipoAsistencias > div > div > div.card-header.header-subtitle > div.card-title");
     private By subtitleAsistenciaEquipo_EA_Asistencia = By.cssSelector("#MiEquipoAsistencias > div > div > div.card-header.header-subtitle > div.card-subtitle");
     private By btnAsistenciaEquipo_EA_Asistencia = By.cssSelector("#MiEquipoAsistencias > div > div > div.card-header.header-subtitle > div.right-actions > button");
     private By tablaAsistenciaEquipo_EA_Asistencia = By.cssSelector("#MiEquipoAsistencias > div > div > div.card-body.has-footer > div > div > div");
    
     

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
    
    public Boolean homeUbicacionesRegistroAsistenciaEmployeeAppAsistencia(){
        return isDisplayed(ubicacionesRegistrarAsistencia_EA_Asistencia);
    }

    public String homeTitleBitacoraDeMiAsistenciaEmployeeAppAsistencia(){
        return getText(titleBitacoraDeMiAsistencia_EA_Asistencia);
    }

    public String homeSubtitleBitacoraDeMiAsistenciaEmployeeAppAsistencia(){
        return getText(subtitleBitacoraDeMiAsistencia_EA_Asistencia);
    }

    public String homeTitleTurnoActualEmployeeAppAsistencia(){
        return getText(titleTurnoActual_EA_Asistencia);
    }

    public String homeSubtitleTurnoActualEmployeeAppAsistencia(){
        return getText(subtitleTurnoActual_EA_Asistencia);
    }

    public String homeTxtNombreDelTurnoEmployeeAppAsistencia(){
        return getText(txtNombreDelTurno_EA_Asistencia);
    }

    public String homeSubTxtNombreDelTurnoEmployeeAppAsistencia(){
        return getText(subTxtNombreDelTurno_EA_Asistencia);
    }

    public String homeTxtFechaEmployeeAppAsistencia(){
        return getText(txtFecha_EA_Asistencia);
    }

    public String homeSubTxtFechaEmployeeAppAsistencia(){
        return getText(subTxtFecha_EA_Asistencia);
    }

    public String homeTxtHorarioEmployeeAppAsistencia(){
        return getText(txtHorario_EA_Asistencia);
    }

    public String homeSubTxtHorarioEmployeeAppAsistencia(){
        return getText(subTxtHorario_EA_Asistencia);
    }

    public String homeTxtUbicacionEmployeeAppAsistencia(){
        return getText(txtUbicacion_EA_Asistencia);
    }

    public String homeSubTxtUbicacionEmployeeAppAsistencia(){
        return getText(subTxtUbicacion_EA_Asistencia);
    }

    public String homeTxtNipEmployeeAppAsistencia(){
        return getText(txtNip_EA_Asistencia);
    }

    public String homeSubTxtNipEmployeeAppAsistencia(){
        return getText(subTxtNip_EA_Asistencia);
    }

    public Boolean homeMapaEmployeeAppAsistencia(){
        return isDisplayed(mapa_EA_Asistencia);
    }

    public String homeTitleMiAusentismoEmployeeAppAsistencia(){
        return getText(titleMiAusentismo_EA_Asistencia);
    }

    public String homeSubTitleMiAusentismoEmployeeAppAsistencia(){
        return getText(subtitleMiAusentismo_EA_Asistencia);
    }

    public Boolean homeGraficosMiAusentismoEmployeeAppAsistencia(){
        return isDisplayed(graficosMiAusentismo_EA_Asistencia);
    }

    public String homeTitleMiCalendarioAsistenciaEmployeeAppAsistencia(){
        return getText(titleCalendarioAsistencia_EA_Asistencia);
    }

    public String homeSubTitleMiCalendarioAsistenciaEmployeeAppAsistencia(){
        return getText(subtitleCalendarioAsistencia_EA_Asistencia);
    }

    public Boolean homeCalendariosAsistenciaEmployeeAppAsistencia(){
        return isDisplayed(calendariosAsistencia_EA_Asistencia);
    }

    public String homeTitleTarjetaAsistenciaEmployeeAppAsistencia(){
        return getText(titleTarjetaAsistencia_EA_Asistencia);
    }

    public String homeSubTitleTarjetaAsistenciaEmployeeAppAsistencia(){
        return getText(subtitleTarjetaAsistencia_EA_Asistencia);
    }

    public Boolean homeTarjetaAsistenciaEmployeeAppAsistencia(){
        return isDisplayed(tarjetaAsistencia_EA_Asistencia);
    }

    public String homeTitleHomeOfficeEmployeeAppAsistencia(){
        return getText(titleHomeOffice_EA_Asistencia);
    }

    public String homeSubTitleHomeOfficeEmployeeAppAsistencia(){
        return getText(subtitleHomeOffice_EA_Asistencia);
    }

    public String homeBtnHomeOfficeEmployeeAppAsistencia(){
        return getText(btnHomeOffice_EA_Asistencia);
    }
    
    public Boolean homeMapaHomeOfficeEmployeeAppAsistencia(){
        return isDisplayed(mapaHomeOffice_EA_Asistencia);
    }

    public String homeTitleAsistenciaEquipoEmployeeAppAsistencia(){
        return getText(titleAsistenciaEquipo_EA_Asistencia);
    }

    public String homeSubTitleAsistenciaEquipoEmployeeAppAsistencia(){
        return getText(subtitleAsistenciaEquipo_EA_Asistencia);
    }

    public String homeBtnAsistenciaEquipoEmployeeAppAsistencia(){
        return getText(btnAsistenciaEquipo_EA_Asistencia);
    }

    public Boolean homeTablaAsistenciaEquipoEmployeeAppAsistencia(){
        return isDisplayed(tablaAsistenciaEquipo_EA_Asistencia);
    }
}

