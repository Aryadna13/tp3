@home_page
Feature: Funcionalidades Home page
  Las funciones principales de Home page funcionan correctamente
  Background:
    Given el usuario ingresa a la URL

  Scenario: La home page solo debe contener tres slides
    Given el usuario clickea en shop menu button
    When el usuario clickea en home page button
    Then se valida que en la home page hay solo tres slides

  @new_arrivals
  Scenario: La home page debe contener solo tres productos en "new arrivals"
    Given el usuario clickea en shop menu
    When el usuario clickea en home page button
    Then se valida que en la home page hay solo tres productos en <new arrivals>