package bctsoft.g3.testcases;

import bctsoft.g3.pageobject.pages.*;
import org.junit.Assert;
import org.junit.Test;

public class TTJS_02 extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartTrasladosPage jsTrasladosPage;

    @Test
    public void busquedaTrasladosNoEncontrados() throws InterruptedException {
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
        Thread.sleep(3000);
        jsHomePage.setSeleccionHorarioFechaTrasladoMasCercano();
        Thread.sleep(3000);
        jsHomePage.iniciarBusquedaTraslados();
        jsHomePage.cambiarAPestanaActual(1);
        Thread.sleep(10000);
        Assert.assertFalse(jsTrasladosPage.checkResultadosArrojados());
    }
}
