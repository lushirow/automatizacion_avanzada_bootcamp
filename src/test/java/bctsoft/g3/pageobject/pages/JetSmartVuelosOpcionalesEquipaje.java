package jetsmart_exercises.grupo3.Automatization.pageobject.pages;

import jetsmart_exercises.grupo3.Automatization.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartVuelosOpcionalesEquipaje extends SeleniumBase {
    public JetSmartVuelosOpcionalesEquipaje(WebDriver driver){
        super(driver);
    }
    //objeto invisible en la parte superior para llamar a la funcion Modificar
    private By btnLlamadaAModificarReserva = By.xpath("//section[@class='booking-wrapper ts-section-wrapper ts-error-container']");
    private By modalModificarReserva = By.xpath("//div[@class='modal-body'][contains(text(),'¡No te preocupes!')]");
    //objetos
    private By btnSoloBolsoDeMano = By.xpath("//div[contains(text(),'Solo bolso de mano')]");
    private By btnNoDeseoEquipajeFacturado = By.xpath("//div[contains(text(),'No deseo equipaje facturado')]");
    private By btnContinuar = By.cssSelector(".baggage-primary-button-container .rounded-primary-btn");

    //keyword Driven
    public boolean ModificarReserva(){
        click(btnLlamadaAModificarReserva);
        if (isDisplayed(modalModificarReserva)){
            return true;
        } else {
            return false;
        }
    }
    public void seleccionEquipaje(){
        click(btnSoloBolsoDeMano);
        click(btnNoDeseoEquipajeFacturado);
    }
    public void clickContinuar(){
        click(btnContinuar);
    }
}
