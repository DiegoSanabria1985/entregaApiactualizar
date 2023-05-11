#language: es

Característica:  actualizar usuario de dummy restapiexample

  Escenario: Actualizar usuario api exitoso
    Cuando envia la siguiente informacion de usuario al servicio "https://dummy.restapiexample.com/api/v1/update/21"
      | status   | name    |salary   |age |id  |
      | success | andres  |320800  |37 |35 |

    Entonces el usuario valida el codigo de estatus sea 405