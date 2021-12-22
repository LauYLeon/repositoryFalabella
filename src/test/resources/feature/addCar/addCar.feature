@test
Feature: Añadir a carrito de compras
  Yo como PO
  Quiero que mis clientes puedan realizar
  seleccionar un producto que quiera comprar
  y se añada a un carrito de compras

  @Scenario
  Scenario: el usuario añade productos al carrito de compras
    Given que el usuario se encuentre en la pantalla principal de la pagina
    And Busque el Consola Xbox que desea agreagar al carrito
    Then el usuario deberia ver Producto(s) agregado(s) a la bolsa de compras