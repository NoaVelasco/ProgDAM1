Para implementar la lógica de revelar las celdas adyacentes de forma recursiva en un juego de buscaminas, seguiría estos pasos:

1. Función de Revelado:
    - Crea una función que se encargue de revelar una celda específica en el tablero visible (frntBoard). Esta función tomará como parámetros las coordenadas de la celda a revelar.

2. Revelar la Celda Actual:
    - Dentro de la función, primero verifica si la celda ya ha sido revelada. Si ya está revelada, no hagas nada y retorna.
    - Si la celda no ha sido revelada, actualiza el frntBoard con el valor correspondiente del bckBoard (puede ser un número o un espacio vacío).

3. Verificar el Valor de la Celda:
    - Si la celda revelada contiene un número mayor que 0, simplemente muestra ese número y termina la función.
    - Si la celda revelada contiene un 0 (indicando que no hay minas adyacentes), procede a revelar las celdas adyacentes.

4. Revelar Celdas Adyacentes:
    - Para cada celda adyacente (las ocho posibles posiciones alrededor de la celda actual), llama recursivamente a la función de revelado.
    - Asegúrate de verificar que las coordenadas de las celdas adyacentes están dentro de los límites del tablero antes de intentar revelarlas.

5. Evitar Ciclos Infinito:
    - Mantén un registro de las celdas ya reveladas para evitar ciclos infinitos. Esto se puede hacer marcando las celdas en el frntBoard o utilizando una estructura de datos adicional para rastrear las celdas visitadas.

6. Finalización:
    - La recursión continuará hasta que todas las celdas adyacentes sin minas hayan sido reveladas. En ese punto, la función terminará y el tablero visible (frntBoard) mostrará todas las celdas descubiertas correctamente.

Estos pasos proporcionan una guía clara para implementar la lógica de revelado recursivo en un juego de buscaminas. La clave es asegurarse de manejar correctamente los límites del tablero y evitar revelar celdas múltiples veces.


Para crear una función que permita comprobar lo que hay en cada una de las ocho celdas adyacentes, podemos definir una función que reciba las coordenadas de la celda actual y devuelva una lista de las celdas adyacentes. Esta función puede ser utilizada tanto para la comprobación de si las adyacentes contienen 0 como para la función scanNMines.

Aquí está la lógica paso a paso:

1. Definir la Función:
La función tomará como parámetros las coordenadas de la celda actual (fila y columna) y el tablero.
Devolverá una lista de las celdas adyacentes.

2. Calcular las Coordenadas Adyacentes:
Define las ocho posibles posiciones adyacentes (arriba, abajo, izquierda, derecha y las cuatro diagonales).

3. Verificar los Límites del Tablero:
Para cada posición adyacente, verifica que las coordenadas están dentro de los límites del tablero.

4. Agregar las Celdas Válidas a la Lista:
Si las coordenadas son válidas, agrega la celda a la lista de celdas adyacentes.