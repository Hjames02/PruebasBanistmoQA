# language: es
  Característica: Realizar pruebas

    @EscenarioSinEjemplos
    Escenario: Agregar algo
      Dado algo
      Cuando esto se de con este 5, dato2
      Entonces algo mas

    @EscenarioConEjemplos
    Esquema del escenario: Agregar algo
      Dado algo
      Cuando esto se de lista
        | <nombreProducto> | <cantidadAgregar> |
        | 5                | 5                 |
      Entonces pasa algo

    Ejemplos:
      | nombreProducto | cantidadAgregar |
      | 5              | 5             |