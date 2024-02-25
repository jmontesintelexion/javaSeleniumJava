package com.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pageobject.LoginPage;

public class LoginPage_Test {

    private WebDriver driver;
    LoginPage login;
    private final String URL_LOGIN = "https://login.workbeat.com/";

    @Before
    public void setUp() throws Exception{
        login = new LoginPage(driver);
        driver = login.chromeDriverConnection();
        login.visit(URL_LOGIN);
    }

    @After
    public void tearDown() throws Exception{
        driver.close();
    }


    @Test
    public void EmptyInputUsername(){
        assertFalse(login.loginEmptyUsername());
    }

    @Test
    public void CorrectLogin() throws InterruptedException{
        login.loginUser();
        Thread.sleep(20000);
        assertEquals("Workbeat", login.getTitlePage());
    }

    @Test
    public void IncorrectUsername(){
        assertEquals("Usuario o Contraseña Incorrecto", login.loginIncorrectUsername());
    }

    @Test
    public void IncorrectPassword(){
        assertEquals("Usuario o Contraseña Incorrecto", login.loginIncorrectPassword());
    }

    @Test
    public void BackButton(){
        assertFalse(login.loginBackButton());
    }
}
