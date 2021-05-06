package jetsmart_exercises.grupo3.Automatization.testcases;

import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartHomePage;
import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartTrasladosPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TTJS_01 extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartTrasladosPage jsTrasladosPage;

    @Test
    public void busquedaTrasladosEncontrados() throws InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsTrasladosPage = new JetSmartTrasladosPage(driver);
        jsHomePage.goToUrl("https://www.jetsmart.com/cl/es/");
        Thread.sleep(3000);
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
        Assert.assertTrue(jsTrasladosPage.checkResultadosArrojados());
    }
}
