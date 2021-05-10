#Feature: Grupo 3, Modulo de Vuelos, HappyPath
Feature: G3 Modulo de Vuelos casi reserva
  Archivo Gherkin que contiene la causistica del modulo de vuelos de la web JetSmart
  este escenario esta basado en el punto de vista del usuario final y trata de validar
  el avance de un usuario rellenando la reservación hasta el punto justo antes de reservar.
  @G3 @BootCamp
  Scenario: rellenar formulario de vuelos hasta casi reservarlo
    Given que soy un usuario e ingreso a la web "JetSmart"
    When ingreso al formulario de Vuelos
    And ingreso Origen "Santiago"
    And ingreso Destino "Buenos Aires"
    And selecciono la opcion de viaje solo ida
    And ingreso la "fecha" de ida en el Calendario
    And presiono el boton Busqueda Smart

    Then page title should be "Vuelos Baratos – JetSMART Aviones Nuevos | Sitio Oficial"

  Scenario: Forgot password link
    Given user is on login page
    Then forgot message link should be displayed

  #Scenario: Login with correct credentials