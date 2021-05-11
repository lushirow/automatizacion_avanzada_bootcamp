#Feature: Grupo 3, Modulo de Hoteles, Busqueda Hotel Con Filtros
Feature: G3 Modulo de Hoteles Busqueda de Hotel Con Filtros
  Buscar un hotel aplicando dos filtros y elegir el primer hotel arrojado
  por el buscador con los filtros aplicados

  @G3 @BootCamp
  Scenario: Busqueda hotel con filtros
    Given que soy un usuario e ingreso a la web "JetSmart"
    When Ingreso al formulario de Hoteles
    And Ingreso el destino
    And Agrego un niño
    And Hago click en busqueda smart
    And Aplico filtros de busqueda
    And Selecciono el primer hotel disponible
    And Selecciono el apartamento
    Then Comprobamos que estamos en la pagina que queremos con los filtros seleccionados