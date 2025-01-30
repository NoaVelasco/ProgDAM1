

Nos piden que implementemos el software para una tienda. 

Cada producto tiene un nombre, un precio y cantidad que os paso para ahorrar tiempo:

static String[][] nombresProductos = {
        {"Coca Cola", "Chicles  ", "Cerveza  ", "Chocolate"},
        {"Rufles   ", "Lays     ", "Agua     ", "Zumo     "},
        {"Hielos   ", "Vasos    ", "Regaliz  ", "Red bull "},
        {"Lejia    ", "Fairy    ", "Sopa     ", "Avecrem  "}
    };

static double[][] precio = {
        {1.8, 0.8, 1.5, 1},
        {1.3, 1.3, 1, 1.4},
        {1.8, 1, 0.5, 2},
        {1.5, 1.7, 1, 1}
    };

static int cantidad[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

Al principio pedirá el nombre del cliente.

Después se nos pedirá que implementemos el siguiente menu:

***************************
* BIENVENIDO SR/A:NEgro
***************************
* Dispone de 0.0 euros
***************************
* 1. Comprar Producto     *
* 2. Mostrar Productos    *
* 3. Rellenar Producto    *
* 4. Recargar Saldo       *
* 5. Salir de la tienda   *
***************************
Introduce un numero: 

Comprar Producto: pedirá la posición del producto que quiera. Esta tienda tiene productos en cada posición, identificados por su fila y columna, que será lo que introduzca el usuario al pedir una producto, por ejemplo si el usuario teclea 20 significa que está pidiendo el producto que está en la fila 2 columna 0. Cuando no haya stock se le indicará al usuario. Solo puede pedir un producto cada vez y el usuario debe tener dinero para comprar. Recuerda de disminuir la cantidad del producto al comprar y el saldo del usuario de manera correcta.


Mostrar productos: mostrara todos los productos disponibles. Mostrará el código que debe introducir el usuario, el nombre, el precio y la a cantidad de la siguiente manera.


Rellenar productos: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña, si el usuario escribe “2025” le pedirá la posición del producto y la cantidad. Ejemplo

Recargar Saldo: Pedirá al usuario que introduzca la cantidad de saldo que quiere ingresar:

Salir de la tienda: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa.

Introduce un numero: 
5
Las ventas totales han sido de 16.2 euros
Fin del menu


El programa debe ser modularizado, es decir, todas las funciones que veas que sean necesarias debes crearlas, así como todas aquellas acciones que veas que se repitan. Piensa que funciones pueden ser.

Las funciones deben ser lo más genéricas posibles.

No se deben utilizar POO para este ejercicio.
