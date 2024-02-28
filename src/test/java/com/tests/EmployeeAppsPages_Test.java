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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
        assertTrue(home.homeUbicacionesRegistroAsistenciaEmployeeAppAsistencia());
        assertEquals("Bitácora de mi asistencia hoy", home.homeTitleBitacoraDeMiAsistenciaEmployeeAppAsistencia());
        assertEquals("Registro de asistencia al día", home.homeSubtitleBitacoraDeMiAsistenciaEmployeeAppAsistencia());
        assertEquals("Turno actual", home.homeTitleTurnoActualEmployeeAppAsistencia());
        assertEquals("Horario de asistencia regular", home.homeSubtitleTurnoActualEmployeeAppAsistencia());
        assertEquals("NOMBRE DEL TURNO", home.homeTxtNombreDelTurnoEmployeeAppAsistencia());
        assertEquals("Nocturno", home.homeSubTxtNombreDelTurnoEmployeeAppAsistencia());
        assertEquals("FECHA", home.homeTxtFechaEmployeeAppAsistencia());

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd", Locale.getDefault());
        String day = dayFormat.format(calendar.getTime());
        String month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy", Locale.getDefault());
        String year = yearFormat.format(calendar.getTime());
        assertEquals(day+"/"+month+"/"+year, home.homeSubTxtFechaEmployeeAppAsistencia());
        assertEquals("HORARIO", home.homeTxtHorarioEmployeeAppAsistencia());
        assertEquals("Noche", home.homeSubTxtHorarioEmployeeAppAsistencia());
        assertEquals("UBICACIÓN", home.homeTxtUbicacionEmployeeAppAsistencia());
        assertEquals("Casa", home.homeSubTxtUbicacionEmployeeAppAsistencia());
        assertEquals("NIP", home.homeTxtNipEmployeeAppAsistencia());
        assertEquals("0392", home.homeSubTxtNipEmployeeAppAsistencia());
        assertTrue(home.homeMapaEmployeeAppAsistencia());
        assertEquals("Mi ausentismo", home.homeTitleMiAusentismoEmployeeAppAsistencia());
        assertEquals("Estadística de ausentismo de los últimos 30 días", home.homeSubTitleMiAusentismoEmployeeAppAsistencia());
        assertTrue(home.homeGraficosMiAusentismoEmployeeAppAsistencia());
        assertEquals("Mi calendario de asistencia", home.homeTitleMiCalendarioAsistenciaEmployeeAppAsistencia());
        assertEquals("Estadísticas de asistencia de los últimos 3 meses", home.homeSubTitleMiCalendarioAsistenciaEmployeeAppAsistencia());
        assertTrue(home.homeCalendariosAsistenciaEmployeeAppAsistencia());
        assertEquals("Tarjeta de asistencia", home.homeTitleTarjetaAsistenciaEmployeeAppAsistencia());
        assertEquals("Kardex de asistencia semanal", home.homeSubTitleTarjetaAsistenciaEmployeeAppAsistencia());
        assertTrue(home.homeTarjetaAsistenciaEmployeeAppAsistencia());
        assertEquals("Home office (trabajo remoto)", home.homeTitleHomeOfficeEmployeeAppAsistencia());
        assertEquals("En donde estoy trabajando remotamente", home.homeSubTitleHomeOfficeEmployeeAppAsistencia());
        assertEquals("Cambiar ubicación", home.homeBtnHomeOfficeEmployeeAppAsistencia());
        //assertTrue(home.homeMapaHomeOfficeEmployeeAppAsistencia());
        assertEquals("Asistencia de mi equipo", home.homeTitleAsistenciaEquipoEmployeeAppAsistencia());
        assertEquals("Presencia de mis empleados hoy", home.homeSubTitleAsistenciaEquipoEmployeeAppAsistencia());
        assertEquals("Ver todos", home.homeBtnAsistenciaEquipoEmployeeAppAsistencia());
        assertTrue(home.homeTablaAsistenciaEquipoEmployeeAppAsistencia());
    }
    

    @Test
    @Order(2)
    public void CerrarAsidePanelEmployeeAppAsistencia() throws InterruptedException{

        assertFalse(home.homeCerrarEmployeeAppAsistencia());

    }

}
