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
import com.pageobject.LoginPage;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginPage_Test {

    WebDriver driver;
    LoginPage login;
    private final String URL_LOGIN = "https://login.workbeat.com/";

    @BeforeEach
    public void setUp() throws Exception{
        login = new LoginPage(driver);
        driver = login.chromeDriverConnection();
        login.visit(URL_LOGIN);
    }

    @AfterEach
    public void tearDown() throws Exception{
        driver.close();
    }

    
    @Test
    @Order(1)
    public void EmptyInputUsername(){
        assertFalse(login.loginEmptyInputUsername());
    }
    
    @Test
    @Order(2)
    public void CorrectLogin() throws InterruptedException{
        login.loginUser();
        Thread.sleep(10000);
        assertEquals("Workbeat", login.getTitlePage());
    }

    @Test
    @Order(3)
    public void IncorrectUsername(){
        assertEquals("Usuario o Contraseña Incorrecto", login.loginIncorrectUsername());
    }

    @Test
    @Order(4)
    public void IncorrectPassword(){
        assertEquals("Usuario o Contraseña Incorrecto", login.loginIncorrectPassword());
    }
    
    @Test
    @Order(5)
    public void BackButton(){
        assertFalse(login.loginBackButton());
    }
}
