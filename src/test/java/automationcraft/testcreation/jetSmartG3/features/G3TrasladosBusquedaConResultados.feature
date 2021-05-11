#Feature: Grupo 3, Modulo de  Traslados, Busqueda de traslados con resultados
Feature: G3 Modulo de Traslados Busqueda Resultados Encontrados
  Archivo Gherkin que contiene la casuistica del Modulo de Traslados de la web JetSmart
  este escenario esta basado en el punto de vista del usuario final y trata de validar que sucede cuando
  el usuario ingresa datos validos en todos los campos.

  @G3 @BootCamp
  Scenario: Busqueda Traslado Encontrado
    Given soy un usuario e ingreso a la web "JetSmart"
    When ingreso al formulario de Traslados
    And presiono el boton ida
    And ingreso Origen de Traslado "Buenos Aires"
    And ingreso Destino de Traslado "Buenos Aires"
    And ingreso Fecha "2" dias despues de hoy
    And ingreso Horario "10:00 AM"
    And ingreso Pasajeros "1 pasajero"
    And presiono el boton de Busqueda Traslados
    Then nos aparece una pagina con resultados
