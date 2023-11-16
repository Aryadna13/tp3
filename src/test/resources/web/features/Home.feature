@testing
Feature: Funcionalidades Home page

  Background:
    Given el usuario ingresa a la URL

  @Cupon
  Scenario Outline: Agregar un cupon
    Given el usuario clickea la imagen de un producto de new arrivals
    And el usuario agrega ese libro especifico a su carrito con el boton Add to basket
    And el usuario clickea en el boton View Basket del producto elegido
    When el usuario clickea en el boton Proceed to Checkout del producto
    And el usuario debera rellenar los campos de compra de Billing Details <FirstName>, <LastName>, <EmailAddress>, <Phone>, <Country>, <Address>, <TownDistrict>, <Region>, <Postcode>
    Then el usuario podra añadir cupones

    Examples:
      | FirstName | LastName | EmailAddress               | Phone      | Country   | Address         | TownDistrict | Region  | Postcode |
      | Ariadna   | Garcia   | garciaariadna139@gmail.com | 1234567890 | Argentina | Calle Falsa 123 | Mendoza      | Mendoza | 12345    |

  @llegarAConf
  Scenario Outline: Add to Basket-Items-Check-out-Payment Gateway-Place order
    Given el usuario clickea la imagen de un producto de new arrivals
    And el usuario agrega ese libro especifico a su carrito con el boton Add to basket
    And el usuario clickea en el boton View Basket del producto elegido
    When el usuario clickea en el boton Proceed to Checkout del producto
    And el usuario debera rellenar los campos de compra de Billing Details <FirstName>, <LastName>, <EmailAddress>, <Phone>, <Country>, <Address>, <TownDistrict>, <Region>, <Postcode>
    And el usuario clickea en el boton de Place Order
    Then el usuario es redirigido a una pagina de confirmacion de pedido
    Examples:
      | FirstName | LastName | EmailAddress               | Phone      | Country   | Address         | TownDistrict | Region  | Postcode |
      | Ariadna   | Garcia   | garciaariadna139@gmail.com | 1234567890 | Argentina | Calle Falsa 123 | Mendoza      | Mendoza | 12345    |