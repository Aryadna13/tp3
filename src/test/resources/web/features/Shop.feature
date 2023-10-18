@shop_page
Feature: Funcionalidades de Shop page
  Background:
    Given el usuario ingresa a la homepage

  @product_category
  Scenario: Filtrar productos con la funcionalidad Product category
    Given el usuario clickea en shop menu button
    When el usuario clickea en una opción de Product category
    Then el usuario podra ver solo los productos filtrados

  @add_to_basket
  Scenario: Añadir cualquier producto al carrito con el botón Add to basket
    Given el usuario clickea en shop menu button
    When el usurario clickea en el boton Add to basket
    Then deberá añadirse una unidad del producto elegido a su carrito de compras
