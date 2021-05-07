package bctsoft.g3.testcases;

import bctsoft.g3.pageobject.pages.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class HTJS_01 extends TestBase{

    protected JetSmartHomePage jsHomePage;
    protected JetSmartHotelesResultados jsHotelesResults;
    protected JetSmartHotelSeleccionado jsHotelSelected;
    protected JetSmartHotelCompletarDatos jsHotelCompletarDatos;
    protected JetSmartHotelPago jsHotelPago;

    @Test
    public void BusquedaDeHotelResultadoCorrecto() throws InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHotelesResults = new JetSmartHotelesResultados(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.seleccionarPestanaHotel();
        jsHomePage.setTxtInputHotelDestino("Buenos Aires");
        jsHomePage.setSeleccionCantidadNinosHotel("1");
        jsHomePage.iniciarBusquedaHotelSmart();
        jsHotelesResults.verificarResultadoPagina();
        Assert.assertTrue(jsHotelesResults.verificarResultadoPagina());
    }
}
