package jetsmart_exercises.grupo3.Automatization.testcases;

import jetsmart_exercises.grupo3.Automatization.pageobject.pages.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class HTJS_02 extends TestBase {

    protected JetSmartHomePage jsHomePage;
    protected JetSmartHotelesResultados jsHotelesResults;
    protected JetSmartHotelSeleccionado jsHotelSelected;
    protected JetSmartHotelCompletarDatos jsHotelCompletarDatos;
    protected JetSmartHotelPago jsHotelPago;

    @Test
    public void busquedaHotelConFiltros() throws InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHotelesResults = new JetSmartHotelesResultados(driver);
        jsHotelSelected = new JetSmartHotelSeleccionado(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.seleccionarPestanaHotel();
        jsHomePage.setTxtInputHotelDestino("Buenos Aires");
        jsHomePage.setSeleccionCantidadNinosHotel("1");
        jsHomePage.iniciarBusquedaHotelSmart();
        jsHotelesResults.aplicarFiltroDesayunoIncluido();
        jsHotelesResults.aplicarFiltroDeEstrellas("3 estrellas");
        jsHotelesResults.verHotelDisponible();
        Assert.assertTrue(jsHotelSelected.validarEstrellasyPopularidad());
    }
}
