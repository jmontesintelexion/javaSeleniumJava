package com.tests;

import static org.junit.Assert.*;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import com.pageobject.EmployeeAppsPages;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeAppsPages_Test {

    private WebDriver driver;
    EmployeeAppsPages home;
    private final String URL_HOME = "https://shell.workbeat.com/";


    @BeforeEach
    public void setUp() throws Exception{
        home = new EmployeeAppsPages(driver);
        driver = home.chromeDriverConnection();
        home.visit(URL_HOME);
    }

    @AfterEach
    public void tearDown() throws Exception{
        driver.close();
    }


    @Test
    @Order(1)
    public void AbrirAsidePanelEmployeeAppAsistencia() throws InterruptedException{
        assertTrue(home.homeAbrirEmployeeAppAsistencia());
        assertEquals("Asistencia", home.homeTitleEmployeeAppAsistencia());
        assertEquals("Apps", home.homeSubtitleAppEmployeeAppAsistencia());
        assertEquals("Registrar Asistencia", home.homeTitleRegistroAsistenciaEmployeeAppAsistencia());
    }

    @Test
    @Order(2)
    public void CerrarAsidePanelEmployeeAppAsistencia() throws InterruptedException{
        assertFalse(home.homeCerrarEmployeeAppAsistencia());
        
    }


}
