1. Implementar el juego del hundir la flota con java.

·         Al principio tendremos una matriz de 6x6 donde todas nuestras casillas son agua(A).

A A A A A A

A A A A A A

A A A A A A

A A A A A A

A A A A A A

A A A A A A

·         Se le pedirá por teclado que introduzca la posición de los barcos que son barcos que ocupan dos posiciones seguidas de manera vertical u horizontal. Por ejemplo

A A A A A A

A B B A A A

A A A A A A

A A A B A A

A A A B A A

A A A A A A

·         Cuando tengamos nuestros barcos creados dentro del tablero, comenzará el juego.

·         El jugador tendrá 10 intentos para hundir los dos barcos. Se le pedirá que introduzca una fila y una columna. En el caso de que la fila y la columna sean agua(A) se imprimirá por pantalla AGUA y claramente ya tendrá un intento menos.

·         En el caso de que se encuentre B. Se imprimirá por pantalla TOCADO y se cambiará la B por una X. Por ejemplo el jugador introduce las cordenadas (1,1) imprimirá tocado y el tablero quedaría así.

A A A A A A

A X B A A A

A A A A A A

A A A B A A

A A A B A A

A A A A A A

·         El juego terminará cuando se hayan gastando todos los intentos imprimiendo GAME OVER ó si se han hundido los dos barcos imprimirá FELICIDADES.

 

 

 

Sube el resultado a la actividad creada en Moodle

Criterios de corrección

    0 si no compila.
    Se crean y rellenan la matriz para el jugador  (2 puntos).
    Se establece los intentos del jugador para poder ganar (1 puntos).
    Se desarrolla la funcionalidad para saber si jugador a tocado barco o agua y se hace el cambio correspondiente  en la matriz. (2 puntos).
    Se implementa la funcionalidad de game over si se terminan los intentos(2 puntos).
    Se implementa la funcionalidad de ganar si se acaba con todos los barcos (2 puntos).
    Se comprueba que no se introduzcan datos erróneos (1 punto).
