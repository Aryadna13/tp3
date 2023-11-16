@testing

Feature: Funcionalidades my account page

  Background:
    Given el usuario ingresa a la URL

  @AccountDetails
  Scenario Outline: detalles de cuenta
    Given el usuario clickea en el botón My account
    When el usuario ingresa un Email <Email>, <Password> y clickea en el login button
    And el usuario clickea en el boton Account details
    Then el usuario podra ver los detalles de su cuenta


    Examples:
      | Email                      | Password         |
      | garciaariadna139@gmail.com | 1234567890AAAWww |


  @Log-Out
  Scenario: Desloguearse de la cuenta
    Given el usuario clickea en el botón My account
    And el usuario clickea en el boton Logout
    Then el usuario podra desloguearse con exito

