# language: es
  Característica: Realizar pruebas

    @EscenarioSinEjemplos
    Escenario: Agregar algo
      Dado algo
      Cuando esto se de con este dato1, dato2
      Entonces algo mas

    @EscenarioConEjemplos
    Esquema del escenario: Agregar algo
      Dado algo
      Cuando esto se de lista
        | <nombreProducto> | <cantidadAgregar> |
      Entonces pasa algo

    Ejemplos:
      | nombreProducto | cantidadAgregar |
      | Tapabocas N95  | 100             |