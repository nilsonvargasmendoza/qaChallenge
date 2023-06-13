@usuario
Feature: El usuario quiere ingresar a la web

  @register
  Scenario Outline: Validar el registro de un usuario
    Given el usuario ingresa a la Web de "register"
    When el usuario ingresa en el registro su email "<correo>" y password "<clave>"
    And el usuario selcciona Register
    Then se muestra un mensaje para el registro "<mensaje>"
    Examples:
   | correo                     | clave | mensaje |
   | nilsonVargas@gmail.com     | 12345678 | undefined |


  @login
  Scenario Outline: Validar el login de un usuario
    Given el usuario ingresa a la Web de "login"
    When el usuario ingresa email "<correo>" y password "<clave>" para el login
    And el usuario selcciona Login
    Then se muestra un mensaje para el login "<mensaje>"
    Examples:
      | correo                     | clave | mensaje |
      | nilsonVargas@gmail.com     | 12345678 | undefined |