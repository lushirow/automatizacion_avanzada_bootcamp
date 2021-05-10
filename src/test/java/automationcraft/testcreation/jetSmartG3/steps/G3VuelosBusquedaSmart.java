package automationcraft.testcreation.jetSmartG3.steps;

import automationcraft.testcreation.jetSmartG3.pages.JetSmartHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class G3VuelosBusquedaSmart {

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
}
