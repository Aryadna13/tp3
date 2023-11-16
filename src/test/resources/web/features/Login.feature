@testing
Feature: Funcionalidades de login page
  Las funciones principales de la login page funcionan correctamente

  Background:
    Given el usuario ingresa a la URL

  @caseSensitive
  Scenario Outline: Iniciar sesion usando datos correctos intercalando en mayusculas y minusculas
    Given el usuario clickea en el botón My account
    When el usuario ingresa un Email <Email>, <Password> y clickea en el login button
    Then el usuario no podrá acceder a su cuenta <Error>

    Examples:
      | Email                      | Password         | Error                                                                                                  |
      | GARCIAariadna139@gmail.com | 1234567890AaAwWw | The password you entered for the username GARCIAariadna139@gmail.com is incorrect. Lost your password? |


  @loginPermanente
  Scenario Outline: El usuario debera permanecer logueado
    Given el usuario clickea en el botón My account
    When el usuario ingresa un Email <Email>, <Password> y clickea en el login button
    And el usuario cambia de pagina
    Then el usuario no debera loguearse de nuevo y podra ver la pagina con normalidad

    Examples:
      | Email                      | Password         |
      | garciaariadna139@gmail.com | 1234567890AAAWww |
