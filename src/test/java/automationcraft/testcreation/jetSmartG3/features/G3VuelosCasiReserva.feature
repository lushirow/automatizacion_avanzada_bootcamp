#Feature: Grupo 3, Modulo de Vuelos, HappyPath
Feature: G3 Modulo de Vuelos casi reserva
  Archivo Gherkin que contiene la causistica del Modulo de Vuelos de la web JetSmart
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
    And selecciono el paquete mas barato
    And relleno los datos del pasajero con el "Nombre y Apellido" y la "Fecha de Nacimiento"
    And selecciono el equipaje
    And presiono el boton No quiero elegir Asientos
    And selecciono llevar tarjeta de Embargue
    Then aparece el formulario de pago
