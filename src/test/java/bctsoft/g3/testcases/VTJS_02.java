package jetsmart_exercises.grupo3.Automatization.testcases;

import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartHomePage;
import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartVuelosOpcionalesDetallesPasajero;
import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartVuelosOpcionalesEquipaje;
import jetsmart_exercises.grupo3.Automatization.pageobject.pages.JetSmartVuelosSeleccionDePasajes;
import org.junit.Assert;
import org.junit.Test;

public class VTJS_02 extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartVuelosSeleccionDePasajes jsSeleccionPasajes;
    protected JetSmartVuelosOpcionalesDetallesPasajero jsDetallesPasajeros;
    protected JetSmartVuelosOpcionalesEquipaje jsEquipaje;

    @Test
    public void VTJS_02_ComprobarModificacionDeReserva() throws InterruptedException{
        jsHomePage = new JetSmartHomePage(driver);
        jsSeleccionPasajes = new JetSmartVuelosSeleccionDePasajes(driver);
        jsDetallesPasajeros = new JetSmartVuelosOpcionalesDetallesPasajero(driver);
        jsEquipaje = new JetSmartVuelosOpcionalesEquipaje(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.setTxtInputVuelosOrigen("Santiago");
        jsHomePage.setTxtInputVuelosDestino("Buenos Aires");
        jsHomePage.setCheckIdaVuelos();
        jsHomePage.abrirCalendarioIdaVuelos();
        jsHomePage.setFechaDeIdaEnVuelosCalendario("Junio 28, 2021");
        jsHomePage.iniciarBusquedaSmart();
        jsSeleccionPasajes.seleccionarTarifa();
        jsSeleccionPasajes.seleccionarPaquete();
        jsSeleccionPasajes.clickContinuar();
        jsDetallesPasajeros.escribirNombreApellido("Carlos VanHelsing");
        jsDetallesPasajeros.escribirFechaDeNacimiento("30-09-1990");
        jsDetallesPasajeros.clickContinuar();
        Assert.assertTrue(jsEquipaje.ModificarReserva());
    }
}