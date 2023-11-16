@testing

Feature: Funcionalidades de Registration en My Account Page

  Background:
    Given el usuario ingresa a la URL

@noPass
  Scenario Outline: Registro con campo contraseña vacia
    Given el usuario clickea en el botón My account
    When el usuario ingresa un Email <Email>, <Password> y clickea en el register button
    Then la registracion debera fallar y se mostrara un mensaje de aviso <Error>

    Examples:
      | Email                      | Password | Error                                 |  |
      | garciaariadna139@gmail.com |          | (ie please enter an account password) |  |

  @noMailNoPass
  Scenario Outline: Registro con campo Email y contraeña vacio
    Given el usuario clickea en el botón My account
    When el usuario ingresa un Email <Email>, <Password> y clickea en el register button
    Then la registracion debera fallar y se mostrara un mensaje de aviso <Error>

    Examples:
      | Email | Password | Error                                   |  |
      |       |          | (ie please provide valid email address) |  |