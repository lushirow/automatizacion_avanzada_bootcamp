package jetsmart_exercises.grupo3.Automatization.pageobject.pages;

import jetsmart_exercises.grupo3.Automatization.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class JetSmartTrasladosPage extends SeleniumBase {
    public JetSmartTrasladosPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait espera = new WebDriverWait(driver, 20);
    //repositorio de objetos que vamos a utilizar de JetSmart
    private By btnReservaAhora = By.xpath("//button[contains(text(),'Reserva ahora')]");
    private By labelInputTransporteOrigen = By.xpath("//div[@ng-bind='searchData.pickupLocation.name']");
    private By labelInputTransporteDestino = By.xpath("//div[@ng-bind='searchData.dropoffLocation.name']");
    private By ulOfResultados = By.xpath("//ul[contains(@class,'ct-space-v')]");
    private By resultados = By.xpath("//ul[contains(@class,'ct-space-v')]/li");
    //private By

    //keyword Driven
    public void reservarPrimeraOpcion() {
        if (isDisplayed(btnReservaAhora)) {
            click(btnReservaAhora);
        }
    }

    public boolean checkResultadosArrojados(){
        espera.until(ExpectedConditions.elementToBeClickable(ulOfResultados));
        List<WebElement> resultadosList = this.findElements(resultados);
        System.out.println("List size is: " +resultadosList.size());
        if(resultadosList.size()>1){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkTransporteIdaYVuelta(String origen, String destino){
        System.out.println(this.getUrl());
        if(getText(labelInputTransporteOrigen).contains(origen)&&getText(labelInputTransporteDestino).contains(destino)){
            return true;
        } else {
            return false;
        }
    }
}
