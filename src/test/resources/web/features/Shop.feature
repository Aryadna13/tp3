@testing
Feature: Funcionalidades de Shop page

  Background:
    Given el usuario ingresa a la URL
    And el usuario clickea en shop menu

  @linkDesdeShop
  Scenario Outline: Llegar al carrito de compras a traves del link de un item
    Given el usurario clickea en el boton Add to basket de un producto
    And el usuario clickea en el boton View Basket
    When el usuario clickea en el boton Proceed to Checkout
    And el usuario debera rellenar los campos de compra de Billing Details <FirstName>, <LastName>, <EmailAddress>, <Phone>, <Country>, <Address>, <TownDistrict>, <Region>, <Postcode>
    And el usuario clickea en el boton de Place Order
    Then el usuario es redirigido a una pagina de confirmacion de pedido
    Examples:
      | FirstName | LastName | EmailAddress               | Phone      | Country   | Address         | TownDistrict | Region  | Postcode |
      | Ariadna   | Garcia   | garciaariadna139@gmail.com | 1234567890 | Argentina | Calle Falsa 123 | Mendoza      | Mendoza | 12345    |

  @tax
  Scenario: Verificar el tax
    Given el usurario clickea en el boton Add to basket de un producto
    When el usuario clickea en el boton View Basket
    Then el usuario podra verificar el impuesto de su compra

