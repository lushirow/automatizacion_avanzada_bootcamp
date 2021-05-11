#Feature: Grupo 3, Modulo de Hoteles, Busqueda Hotel Resultado Correcto
Feature: G3 Modulo de Hoteles Busqueda de Hotel Resultado Correcto
  Comparar el resultado de la búsqueda de un hotel con la opcion sugerida por el buscador.

  @G3 @BootCamp
  Scenario: Busqueda hotel resultado correcto
    Given que soy un usuario e ingreso a la web "JetSmart"
    When Ingreso al formulario de Hoteles
    And Ingreso el destino
    And Agrego un niño
    And Hago click en busqueda smart
    And Selecciono el primer hotel disponible
    Then Aparece el hotel seleccionado
