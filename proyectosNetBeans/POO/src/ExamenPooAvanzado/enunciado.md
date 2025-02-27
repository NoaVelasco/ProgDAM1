Mundial de Baloncesto

 

Se quiere implementar una aplicación que controle todas las fases de un mundial. Para ello seguiremos el siguiente esquema:

Tendremos una clase Selección esta constará de los siguientes atributos:

·         Identificador, de tipo entero

·         Apodo, de tipo String

·         País, de tipo String

·         Año de fundación, tipo entero.

·         Puntos, tipo entero.

 

La selección está formada por unos Componentes, estos sería una clase con los siguientes atributos:

·         Identificador, de tipo entero

·         Nombre, tipo String

·         Apellidos, tipo String

·         Edad, tipo entero.

·         Selección, a la que pertenecen, coger lo que queráis (id,país o apodo).

 

Estos componentes pueden ser Jugadores, Entrenadores o Masajistas.

·         De los Jugadores nos interesa saber el dorsal , la posición y rendimiento en la que juega.

·         De los entrenadores nos interesa saber el número de federación y puesto que ocupa (Primero, Segundo, etc).

·         De los masajistas nos interesa conocer su titulación y los años de experiencia.

 

Todos los componentes tienen que realizar las siguientes acciones: concentrarse(), entrenar(), viajar(), y jugarPartido().

 

A parte los jugadores tienen que pasar la fase de convocación. En la que se comprobará el rendimiento de cada uno, se le puede subir 5 puntos el rendimiento o bajar 5 puntos. Y se desea saber si es convocado o no.

 

El mundial constará de dos fases, una fase de clasificación y otra fase final del mundial.

La fase de clasificación estará dividida en 2 grupos de 4 equipos cada uno.

·         En la fase de Clasificación, tendrá los siguientes métodos, un método de ganar partido en la cual se sumarán 3 puntos a la selección que gane. Otro de perder por el que se sumará un punto a la selección. Y un método clasificable que nos dirá si la selección se clasifica o no. Pasarán los dos equipos que tenga mayor número de puntos de cada grupo.

·         En la Fase Final, tendrá los siguientes métodos, un método de pasar de ronda, si es el equipo que gana, y otro método que nos diga si es el campeón del mundial.

 

Implementar un programa que gestione el funcionamiento del mundial. Sabiendo que al principio cada selección cuenta con 12 jugadores de los cuales 7 serán convocados para jugar el mundial. Se desea saber la lista de jugadores convocados de cada selección. Que selección se ha clasificado de cada grupo y cuál es la selección campeona del mundial. Se pueden utilizar array o arrayList lo que mejor os venga. Recordad usar interfaces o clases abstractas cuando sean convenientes. Implementar los métodos adicionales que veáis necesario para la resolución del ejercicio.  Se deberá obtener la selección campeona del mundial y los datos de sus integrantes.

Criterios de calificación:

  0 si no compila.

1 punto Creación de las clases de manera correcta.

1 punto Creación de las interfaces de manera correcta.

2 puntos Se implementa la  fase de convocatoria de manera correcta(Solo aparecen los convocados en la colección)

2 puntos Se implementa la  fase de clasificación y la fase final de manera correcta(Pasan los equipos con más puntos y los ganadores).

2 puntos Se obtiene la solución correcta del programa, tal  y como pide el enunciado.