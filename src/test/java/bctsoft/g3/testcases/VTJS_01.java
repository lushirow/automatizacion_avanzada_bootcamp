package bctsoft.g3.testcases;

import bctsoft.g3.pageobject.pages.*;
import org.junit.Assert;
import org.junit.Test;

public class VTJS_01 extends TestBase {
    protected JetSmartHomePage jsHomePage;

    @Test
    public void VTJS_01_ComprobarCodigoPromocionalErroneo() throws InterruptedException{
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.setTxtInputVuelosOrigen("Santiago");
        jsHomePage.setTxtInputVuelosDestino("Buenos Aires");
        jsHomePage.setCheckIdaVuelos();
        jsHomePage.abrirCalendarioIdaVuelos();
        jsHomePage.setFechaDeIdaEnVuelosCalendario("Junio 28, 2021");
        jsHomePage.setTxtInputCodigoPromocionalVuelos("VUELOS2021OKEY");
        jsHomePage.iniciarBusquedaSmart();
        Assert.assertTrue(jsHomePage.validarAlertaDeError());
    }
}
