#Feature: Grupo 3, Vuelo
Feature: G3 Vuelos Busqueda Smart
  Archivo Gherkin que contiene todas las casuisticas de Vuelos Busqueda Smart de la web JetSmart
  este escenario esta basado en el punto de vista del usuario final.

  @G3 @BootCamp
  Scenario: Busqueda Smart que falla
    Given que soy un usuario e ingreso a la web "JetSmart"
    When ingreso al formulario de Vuelos
    And ingreso Origen "Santiago"
    And ingreso Destino "Buenos Aires"
    And selecciono la opcion de viaje solo ida
    And ingreso la "fecha" de ida en el Calendario
    And ingreso un "codigo" promocional
    And presiono el boton Busqueda Smart
    Then aparece alerta de codigo promocional no valido
