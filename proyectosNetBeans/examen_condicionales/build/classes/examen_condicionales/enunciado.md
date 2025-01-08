Un instituto de enseñanza de inglés necesita un programa que le permita, cada día, procesar observaciones sobre las clases de ese día. El instituto dicta clases a estudiantes de distintos niveles y cada nivel tiene clases en un día de la semana

diferente: los lunes se dicta el nivel inicial, los martes el nivel intermedio, los miércoles

el nivel avanzado, los jueves son para práctica hablada y los viernes se dicta inglés para

viajeros.

Se debe comenzar por solicitar al usuario que ingrese la fecha actual en formato “día,

DD/MM”; donde [día] es un día de la semana, DD es el número de día y MM es el

número de mes. Si el usuario ingresa un día de la semana inexistente o una fecha cuyo

día supere el número 31 o el mes supere el número 12, finalizar el programa indicando

que se produjo un error. Debe permitirse que ingrese el día de la semana en

minúsculas o mayúsculas indistintamente. Como precondición se tiene que lo

ingresado por el usuario tendrá la forma <[alfanumérico], [numérico]/[numérico]>.

Una vez indicada la fecha, el usuario necesita poder indicar si ese día se tomaron

exámenes, pero eso sólo si se trata de los niveles inicial, intermedio o avanzado, ya

que las prácticas habladas y el inglés para viajeros no tienen exámenes. Si hubo

exámenes, el usuario ingresará cuántos alumnos aprobaron y cuántos no, y el

programa le mostrará el porcentaje de aprobados.

Si el día fue el correspondiente a práctica hablada, el usuario deberá ingresar el

porcentaje de asistencia a clase y el programa le indicará “asistió la mayoría” en caso

de que la asistencia sea mayor al 50% o “no asistió la mayoría”; si no es así.

Si se trata del inglés para viajeros y la fecha actual corresponde al día 1 o 15 del mes 1 o del

mes 7, se deberá imprimir “Comienzo de nuevo ciclo” y solicitar al usuario que ingrese

la cantidad de alumnos del nuevo ciclo y el precio en euros por cada alumno, para

luego imprimir el ingreso total en euros.

 

Nota: Se debe utilizar estructuras condicionales.

Criterios de corrección

    0 si no compila.
    Se cumplen con el formato de datos de entrada atendiendo a las indicaciones establecidas en el enunciado (1 punto).
    Se utiliza al menos una estructura condicional de cada tipo para resolver el problema presentado (4 puntos).
    Se comprueba que cada una de las opciones teniendo en cuenta los datos introducidos por teclado (2,5 puntos)
    El resultado obtenido es el acordado mediante la resolución del problema teniendo en cuenta las indicaciones (2,5 puntos):


---

solicitar fecha
"diaSemana[str], DD[int]/MM[int]"

si DD > 31 || MM > 12: error -> FIN

Según díaSemana:
    l-x: 
    ¿hubo exámenes?
    Si sí: 
        usuario ingresa: cuántos alumnos aprobaron / suspendieron
        mostrar porcentaje aprobados

    jueves:
        usuario ingresa porcentaje de asistencia
        programa -> mayoría sí / no
    
    viernes: 
        si 1/1 || 15/1 || 15/7:
        "comienzo del nuevo ciclo"
        usuario ingresa cantidad de alumnos 
        y precio € / alumno
        --> ingreso total EUROS


