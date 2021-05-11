#Feature: Grupo 3, Modulo de Vuelos, Alerta de Modificacion de Reserva
Feature: G3 Modulo de Vuelos Modificar Reserva
  Archivo Gherkin que contiene la causistica del modulo de vuelos de la web JetSmart
  este escenario esta basado en el punto de vista del usuario final y trata de validar
  que la funcion de modificacion de reserva este disponible para el usuario.

  @G3 @BootCamp
  Scenario: rellenar formulario e intentar modificar la reserva
    Given que soy un usuario e ingreso a la web "JetSmart"
    When ingreso al formulario de Vuelos
    And ingreso Origen "Santiago"
    And ingreso Destino "Buenos Aires"
    And selecciono la opcion de viaje solo ida
    And ingreso la "fecha" de ida en el Calendario
    And presiono el boton Busqueda Smart
    And selecciono el paquete mas barato
    And relleno los datos del pasajero con el "Nombre y Apellido" y la "Fecha de Nacimiento"
    Then aparece la opcion de modificar la reserva