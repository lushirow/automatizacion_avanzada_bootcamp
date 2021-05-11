#Feature: Grupo 3, Modulo de Hoteles, Validacion Posicion Previa Reservacion
Feature: G3 Modulo de Hoteles Validar Posicion Previa Reservacion
  Buscar un hotel, rellenar los datos y validar la posicion previa a la
  reservacion de un apartamento

  @G3 @BootCamp
  Scenario: Hoteles Validar Posicion Previa Reservacion
    Given que soy un usuario e ingreso a la web "JetSmart"
    When Ingreso al formulario de Hoteles
    And Ingreso el destino
    And Hago click en busqueda smart
    And Selecciono el primer hotel disponible
    And Selecciono los habitantes del apartamento y hago click en reservar
    And Lleno todos los datos personales
    Then Comprobamos que estamos en la pagina que queremos