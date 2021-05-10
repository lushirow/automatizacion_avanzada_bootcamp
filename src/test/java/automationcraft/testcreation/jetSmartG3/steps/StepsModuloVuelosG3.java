package automationcraft.testcreation.jetSmartG3.steps;

import automationcraft.testcreation.jetSmartG3.pages.JetSmartHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StepsModuloVuelosG3 {

    WebDriver driver;
    JetSmartHomePage jsHomePage;
    @Given("que soy un usuario e ingreso a la web {string}")
    public void que_soy_un_usuario_e_ingreso_a_la_web(String string) throws InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");

    }
    @When("ingreso al formulario de Vuelos")
    public void ingreso_al_formulario_de_vuelos() throws InterruptedException {
        jsHomePage.cerrarModuloSuscribete();
    }
    @When("ingreso Origen {string}")
    public void ingreso_Origen(String string){
        jsHomePage.setTxtInputVuelosOrigen("Santiago");
    }
    @When("ingreso Destino {string}")
    public void ingreso_destino(String string) throws InterruptedException {
        jsHomePage.setTxtInputVuelosDestino("Buenos Aires");
    }

    @When("selecciono la opcion de viaje solo ida")
    public void selecciono_la_opcion_de_viaje_solo_ida() throws InterruptedException {
        jsHomePage.setCheckIdaVuelos();
    }

    @When("ingreso la {string} de ida en el Calendario")
    public void ingreso_la_de_ida_en_el_calendario(String string) throws InterruptedException {
        jsHomePage.abrirCalendarioIdaVuelos();
        jsHomePage.setFechaDeIdaEnVuelosCalendario("Junio 28, 2021");
    }

    @When("ingreso un {string} promocional")
    public void ingreso(String string) {
        jsHomePage.setTxtInputCodigoPromocionalVuelos("VUELOS2021OKEY");
    }

    @When("presiono el boton Busqueda Smart")
    public void presiono_el_boton_busqueda_smart() {
        jsHomePage.iniciarBusquedaSmart();
    }

    @Then("aparece alerta de codigo promocional no valido")
    public void aparece_alerta_de_codigo_promocional_no_valido() throws InterruptedException {
        Assert.assertTrue(jsHomePage.validarAlertaDeError());
    }
    @When("selecciono el paquete mas barato")
    public void selecciono_el_paquete_mas_barato() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("presiono el boton Continuar")
    public void presiono_el_boton_continuar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("relleno los datos del pasajero con el {string} y la {string}")
    public void relleno_los_datos_del_pasajero_con_el_y_la(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("selecciono el equipaje")
    public void selecciono_el_equipaje() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("presiono el boton No quiero elegir Asientos")
    public void presiono_el_boton_no_quiero_elegir_asientos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("selecciono llevar tarjeta de Embargue")
    public void selecciono_llevar_tarjeta_de_embargue() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("aparece el formulario de pago")
    public void aparece_el_formulario_de_pago() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
