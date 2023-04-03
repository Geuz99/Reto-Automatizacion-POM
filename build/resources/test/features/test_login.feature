Feature: iniciar sesion en la aplicacion de saucedemo

  @login
  Scenario: ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "Products"

  @addFilter
  Scenario: Filtrar los productos de precio menor a mayor
    Given dar click en el boton de filtracion
    When el usuario seleccione ordenar precio menor a mayor
    Then validamos que los precios si esten ordenados segun su precio "Price (low to high)"

  @addToCart
  Scenario: Agregar un producto al carrito
    Given Seleccione un item al carrito de compras
    When ingresamos al carrito de compras
    And Validamos que el producto se encuentre en el carrito "Sauce Labs Onesie"
    And dar click en el boton de check
    And Validamos estar en la pagina del checkout "Checkout: Your Information"
    And ingresamos nuestros datoe a la aplicacion "Anderson" "Zuleta" "CF"
    And dar click en el boton de continue
    And validamos estar en la pagina de checkout overview "Checkout: Overview"
    And dar click en el boton de finish
    Then validamos que estemos en la pagina complete "Checkout: Complete!"

  @returnToLogin
  Scenario: Regresar a la pagina de login
    Given dar click en el boton de menu
    And dar click en el logout
    Then validar que estemos en el login "login_logo"
