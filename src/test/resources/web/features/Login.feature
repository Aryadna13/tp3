@login_page
Feature: Funcionalidades de login page
  Las funciones principales de la login page funcionan correctamente
  Background:
    Given el usuario ingresa a la URL

  Scenario: Login exioso
    Given el usuario clickea en el botón My account
    When el usuario ingresa un email o usuario registrado "garciaariadna139@gmail.com"
    And el usuario ingresa su contraseña "1234567890AAAWww"
    And el usuario clickea en el boton de Login
    Then el usuario podrá acceder a su cuenta y sera redirigido a otra página

  Scenario: Login fallido
    Given el usuario clickea en el botón My account
    When el usuario ingresa un email o usuario no valido "garciaariadna139@error.com"
    And el usuario ingresa su contraseña "1234567890AAAWww"
    And el usuario clickea en el boton de Login
    Then el usuario no podrá acceder a su cuenta
