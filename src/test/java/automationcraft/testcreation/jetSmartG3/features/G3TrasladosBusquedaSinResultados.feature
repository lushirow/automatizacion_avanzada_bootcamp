#Feature: Grupo 3, Modulo de  Traslados, Busqueda de traslados sin resultados
Feature: G3 Modulo de Traslados Busqueda Resultados No Encontrados
  Archivo Gherkin que contiene la casuistica del Modulo de Traslados de la web JetSmart
  este escenario esta basado en el punto de vista del usuario final y trata de validar que sucede cuando
  el usuario ingresa datos invalidos en ciertos los campos.

  @G3 @BootCamp
  Scenario: Busqueda Traslado No Encontrado
    Given soy un usuario e ingreso a la web "JetSmart"
    When ingreso al formulario de Traslados
    And presiono el boton ida
    And ingreso Origen de Traslado "Buenos Aires"
    And ingreso Destino de Traslado "Buenos Aires"
    And ingreso Fecha "0" dias despues de hoy
    And ingreso Horario predeterminado
    And ingreso Pasajeros "1 pasajero"
    And presiono el boton de Busqueda Traslados
    Then nos aparece una pagina sin resultados
