#Feature: Grupo 3, Modulo de  Traslados, Busqueda de traslados checkeando datos de busquedas iniciales
Feature: G3 Modulo de Traslados Busqueda Check Datos Iniciales
  Archivo Gherkin que contiene la casuistica del Modulo de Traslados de la web JetSmart
  este escenario esta basado en el punto de vista del usuario final y trata de validar que sucede cuando
  el usuario ingresa datos validos a la busqueda prosigue con el sistema de reserva y luego vuelve a las
  opciones de traslado.

  @G3 @BootCamp
  Scenario: Busqueda Traslado Valida Datos Iniciales
    Given soy un usuario e ingreso a la web "JetSmart"
    When ingreso al formulario de Traslados
    And presiono el boton ida
    And ingreso Origen de Traslado "Buenos Aires"
    And ingreso Destino de Traslado "Buenos Aires"
    And ingreso Fecha "2" dias despues de hoy
    And ingreso Horario "10:00 AM"
    And ingreso Pasajeros "1 pasajero"
    And presiono el boton de Busqueda Traslados
    And elijo la opcion "1" de traslados
    And ingreso Nombre "Christian Bale"
    And ingreso y confirmo email "chritianbale@gmail.com"
    And ingreso Numero de telefono "3804141414"
    And ingreso Numero de vuelo "AB123"
    And presiono el boton Resultados
    Then se muestran los datos de busquedas iniciales a la izquierda de la pagina