package jetsmart_exercises.grupo3.Automatization.testcases;

import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartHomePage;
import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartTrasladosInformacion;
import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartTrasladosPage;
import org.junit.Assert;
import org.junit.Test;

public class TTJS_03 extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartTrasladosPage jsTrasladosPage;
    protected JetSmartTrasladosInformacion jsTrasladosInformacion;

    @Test
    public void busquedaTrasladosChequeoDeValoresIniciales() throws InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsTrasladosPage = new JetSmartTrasladosPage(driver);
        jsTrasladosInformacion = new JetSmartTrasladosInformacion(driver);
        jsHomePage.goToUrl("https://www.jetsmart.com/cl/es/");
        Thread.sleep(3000); //agregar condición
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.seleccionarPestanaTraslados();
        jsHomePage.switchToIframe(2);
        jsHomePage.seleccionarCheckIdaTraslados();
        jsHomePage.setTxtInputTrasladosOrigen("Buenos Aires");
        jsHomePage.setTxtInputTrasladosDestino("Buenos Aires");
        jsHomePage.setSeleccionFechaTraslados(5);
        jsHomePage.setSeleccionHorarioTraslados("12:00 AM");
        jsHomePage.setSeleccionPasajerosTraslados("1");
        Thread.sleep(3000);
        jsHomePage.iniciarBusquedaTraslados();
        jsHomePage.cambiarAPestanaActual(1);
        Thread.sleep(10000);
        jsTrasladosPage.reservarPrimeraOpcion();
        jsTrasladosInformacion.llenarCampoNombre("Christian Bale");
        jsTrasladosInformacion.llenarYConfirmarEmail("Christian@gmail.com");
        jsTrasladosInformacion.llenarCampoTelefono("3804141414");
        jsTrasladosInformacion.llenarCampoNumeroDeVuelo("AB123");
        jsTrasladosInformacion.volverAResultados();
        Assert.assertTrue(jsTrasladosPage.checkTransporteIdaYVuelta("Buenos Aires", "Buenos Aires"));
    }
}
