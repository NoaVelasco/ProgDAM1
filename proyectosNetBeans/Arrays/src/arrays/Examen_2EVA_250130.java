/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Examen_2EVA_250130 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static String bLee = """
                                            .                              . .                   .  
                                     .                                                              
                                                                  .                                 
  .                                                ........                                         
        .                                       ............                       .    .       .   
       .    H O L A ,                          ....++-.=+#==...                   .                  
                                            ...:#@@@%%%%@@@@%-..                                    
          P I S T O L E R O .             ..-#%%%@@@@@@@@@@@@@@%#.                .             .    
                                        ..%%%@@@@@@@@@@@@@@@@@@@=.                    .             
         .            .                :#%@@@@@@@@@@@@@@@@@@@@%%@%                                  
            .                          -@@@@@@@@@@@@@@@@@@@@@@%%@@.                                 
   .                  .              . *@@%@%@%%%%@%@@@@@@@@%%%%%@#          .        .             
    .                                 .#@@%%%%%@%%#%%##%#%@@%%@@@@@.         .      .               
        C O M P R A   M I S         .  +@%%%%@@#%@#**%%%@%#%%%@@@@@.                                
                                      .:@%%**#*#++----%*%%@%@@@@@@%.                              . 
         P R O D U C T O S .           .@%%*=+++---=+:-=+#@@@@%+=%#     .                           
                 .           .          *%@%%**%#%%#+++-=-#@%#--=@.       .        .                
                              .         .%#*@%+-#%+@%==---#%@::+=%   .                              
                                        .####%=::++==--:-=+@*=-:%@                                  
                              .   .      %####=::--=+++====%*#+%%:                    .             
 .               .        .              .%##*-:.=+=+++======-=@%             .      .              
                                          .###**---:--=====++=+%#                   .           .   
                                        . ..%%#*-++=--=-==++=-=-..       .                          
                   .                       .#%#+=--======+==--+=.                    .          .   
                                             %#++++====*#*==-:-++=.. .                   .          
                          .                 ..%#+===+**+=+==---===+==-..                       .    
                                                 .@@%**=++===-----====.....                         
            .                                     =%#**+*+=+=-=:---=+....+:=+.            .  .      
          .                   .                  .-%%%*#*++==-+====*.-:-*-:-===..        =:.. .  ...
                                             .-=.*%%%%%%#--====++#....##*++=:-:::-=+.  . -=:..:.....
.                 .                      .:###+:**%%#+#%#*+++***+....##***+==---:-:---.. .=-..+=-...
.. ....                             .  :+%%%#+:*%%%*#=%##+*++**-....*###***==----::::---..+-:.+*-::.
   ..........                    .   .#%%*+#--#%#*+++#%#*****#.....+++***+++=-----:::::-=.===-=+-*=:
 ..  .+:=*:= ....      .       .    .**##*#.-=###***+#%##*#*%...:.******++++++==-:::::::::-==+=+#*=.
  . .%@#%..:++.-....                #*+#%%.-.*###****######*...-.+****++++=++*+++=--:.::::-==:++++-:
   ..@%%##......-+.+:..    .       .**#%%.--.*#***++#%###%=.....****++++==+*%##*=+===---:--====-:+-:
     :%%#@.  ........+*:+=         :##%%%::-.+***+=+####=.....:.++++++++++##%#*#*++==-------+++==+:.
     .@@%#*      .... .....-.=-...-***###=-==.-*+==%+:.:--....:::+====++@@@@%-::::::.:------=+++++-=
      @%@#%.    ..  ............+=-*%%%%%=-==:==---:-::::-=--....:=---:%%###+***-:::-::::..-=-==+++=
      .@%%@:.      .............:%@%%#@@@%===-::--:..::::---.--.....:-*##**+===*###*++#---==+=---++*
       @@@%%  ..........   .   =#****@@%%%===--::--::::...::.........:+##*++===**#*#**==-%###*+==+++
       .@%@%=-:  ..........   ##*+=-:+#%%%%==--..::----:............:-=::+*+++**#%==****==---+%*+**#
..     .@@%@#==:...........  -*+=:::-=%%%%%+====--::::-------:--::::.-----:::-*##*=:..***+*+++*%%%%=
...   .:.@%##@+=- ..........-*+*--:--#%%%%%.==+++=====---...::::::::------:-==--=-.:.  ..******#%%%#
...  .*#*-:::-:-::.........=++++==--=%%%%%  .-=---::::.............::-----===--:..-      ..=***%%%%%
... .:#%%++**==:-:   ..-.::=++-----==%%%#.  .-===-.--:::::-:::-::...:-:::::----:..-         .+#%%%%#
...  *+*#+-:-:-==-===---======--==-=*#%.     -======-.........:....=====--=----...            .%@@@@
...  =****+-:--=-=+==============+++##       =+++==--::::.......::------=-----:-::    .         .*%@
...  .***#*+-*:--+++++++===========#.  .     =+=====-::........:.:..::====----:--:         .      ..
...    .**##=-+#++=====+=+=======+:         =======-::......:.......-========..-:          ..      .
...       .*@@@%+++++===+::......           =----:::::::.......::.::=::---=-.--:                 .  
 ..       . %%@#@ .          .              ==-::::::::..::..:::--:...::-==-:-:                     
. .      .   %%%%...                       .-=-=---:.........-:-::...:-=====---.                    
.        .. .%#@#@.                     .  --===-::::::::::::.......-----==--=:                     
.            :%@#@ .   .                 .-=++==-:-===+++=+=-:::-::::::-:---=.     .                
 .      .. .. @@@#%..                    ++***+#%@@@@%%@@@@@%@@##=:::..::===-.                      
...        ...:@%#@..                   ***###%%@@@@@@%@@%@@@@@@@@@%@%@%@@==..                      
..        .....%*%%:.      .           .%##%@@@%@@@@@@@@@@@@@@%%@@%%%%%%%%%#.                       
  ..    .. ....+#%#@    .             .+##%@@@%%%%%%@@@@@@@%%%@@@@@@%@%%%%%*..            .         
 .    . . ...  .       .            ..=+%%%%%@@@@@@@@@@@@@@@@@@@@@%%##@%%%##.                       
         ...                          %##@@%%%@@@@@@@@@@@@@@@@@@@@%@%%%#####:            .       .  
         .. .....                    %*%@@%%@@@%@@@@@@@@@@@@@@@@@@@@@%%@%@##*. .                  . 
        ........                   .:*#@@@%%@%@@@@@@@@@@@@@@@@@@@@@@%@@@@@@%*.                      
         .......    .         .    .#%@@@@%%%%%%%%@@@@@@@@@@@@@@@@@@@@@%@@@#*:.                     
.         ......                  +*@@@@@@@@%%@%@@@@@@@@@@@@@@@@@@@@@@%%%@@%#-.                     
           ....                 .=@@@@@@@@@%%@@@@@@@@@@@@@@@@@@@@@@@@@@@%%@@%=:.                    
.           ...                .%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##-       .            
           ...               ..%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%##=                   
  . .   .....              ...%@@@%%@@@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%#= .                 
  .  . .. ..              ..:%@@@%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%+.           .     .
  ...  .                 ..#%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.           .      
  .. . .                ..#%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@#.           .     
     .                 ..%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.          ..  . 
   .         .        ..%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@..   .     ...   
     .          .    ..%%%%%%%%%@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%..     .  .=..  
           ...      ..#%%%%%@%%@@@@@@@@@@@@@@@@@@@@@@@%%@%%@%@@@@@@@@@@@%@@@@@@@@@@@#.        .+... 
         ....     ...+##%%%%%%@@@@@@@@@@@@@@@@@@@%%@@@@@@@@%%@@@@@@@@@@@@@@@@@@@@@@@%-.       -+... 
       ......     ..-#%%%@%%%@@@@@@@@@@@@@@@@@@@@%@@.....%@@@@@@@@@@@@@@@@@@@@@@@@@@@#.      .+.....
        . ..     ...:+%@@@%%@@@@@@@@@@@@@@@@@@@@@@@@......@@@@@@@@@@@@@@@@@@@@@@@@@@@%.       ......
  .. . ... .    ....#%@@@%%@@@@@@@@@@@@@@@@@@@@%%@#.........%@@@@@@@@@@@@@@@@@@@@@@%@@:       :.....
   .. ... .... ....@@@@@@%%%@@@@@@@@@@@@@@@@@@@@#=...........@@@@@@@@@@@@@@@@@@@@@@@@%+    ...:.....
  ....  ..      ..%@@@@@@%%@@@@@@@@@@@@@@@@@@@@=..............@@@@@@@@@@@@@@@@@@@@@@@@#......+.=....
.. ..     .. .. .=%@@@@@@@@@@@@@@@@@@@@@@@@@@*.................@@@@@@@@@@@@@@@@@@@@@@@%=.....:=.:...
  ...  . .. .....###%@@@@@@@@@@@@@@@@@@@@@%......................@@@@@@@@@@@@@@@@@@@@@@@#*..  -:=.. 
.....    . . . .###%@@@@@@@@@@@@@@@@@@@@@.........................#@@@@@@@@@@@@@@@@@@@@@%%...  .    
.....     .    #%%@@@@@@@@@@@@@@@@@@@@@@-..........................=@@@@@@@@@@@@@@@@@@@@@@%.   ..   
.....   .    ..%@@@@@@@@@@@@@@@@@@@@@@..............................*@@@@@@@@@@@@@@@@@@@@@@%.       
.....  .     *%@@@@@@@@@@@@@@@@@@@@@%= ..............................*@@@@@@@@@@@@@@@@@@@@%%.       
.........  ..##@@@@@@@@@@@@@@@@@@@@#%*................................%@@@@@@@@@@@@@@@@%@@@%....  ..
                         """;

    static String menuPrompt0 = """
                                
***************************
* BIENVENIDO, SR/A:_ """;

    static String menuPrompt1 = """
***************************
* Dispone de """;

    static String menuPrompt2 = """
 euros
***************************
* 1. Comprar Producto     *
* 2. Mostrar Productos    *
* 3. Rellenar Producto    *
* 4. Recargar Saldo       *
* 5. Salir de la tienda   *
***************************
Introduce un numero: 
                                """;

    static String[][] nombresProductos = {
        {"Coca Cola", "Chicles  ", "Cerveza  ", "Chocolate"},
        {"Rufles   ", "Lays     ", "Agua     ", "Zumo     "},
        {"Hielos   ", "Vasos    ", "Regaliz  ", "Red bull "},
        {"Lejia    ", "Fairy    ", "Sopa     ", "Avecrem  "}
    };

    static int maxString = 0;

    static double[][] precio = {
        {1.8, 0.8, 1.5, 1},
        {1.3, 1.3, 1, 1.4},
        {1.8, 1, 0.5, 2},
        {1.5, 1.7, 1, 1}
    };

    static int cantidad[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    static String nombre;
    static final int ARRAY_SIZE = 4;
    static double sales = 0.0;
    static double money = 0.0;
    static boolean loop = true;
    static int row, col;

    public static void main(String[] args) {
        app();
    }

    static void buyProd() {
        System.out.print("Introduce la posicion del producto: ");
        String cod = sc.nextLine();
        if (validateCod(cod)) {
            pickProduct();
        }
    }

    static boolean strIsDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean strIsDouble(String input) {
        return input.matches("^[0-9.]{0,}\\d$");
    }

    static boolean validateCod(String codigo) {
        boolean output = true;
        if (codigo.length() != 2) {
            output = false;
            System.out.println("No es un codigo valido. 2 digitos, por favor.");
        } else if (!strIsDigit(codigo)) {
            output = false;
            System.out.println("No es un codigo valido. Usa digitos, por favor.");
        } else {
            row = Integer.parseInt(codigo.charAt(0) + "");
            col = Integer.parseInt(codigo.charAt(1) + "");
            if (row >= ARRAY_SIZE || col >= ARRAY_SIZE) {
                System.out.println("No es un codigo valido. Fuera de rango.");
                output = false;
            }
        }
        return output;
    }

    static boolean hasMoney() {
        return money >= precio[row][col];
    }

    static void pickProduct() {
        if (cantidad[row][col] > 0) {
            if (hasMoney()) {
                System.out.println("Aqui tienes tu " + nombresProductos[row][col]);
                cantidad[row][col]--;
                sales += precio[row][col];
                money -= precio[row][col];
            } else {
                System.out.println("No tienes suficiente dinero.");
            }
        }
        if (cantidad[row][col] == 0) {
            System.out.println("No hay más " + nombresProductos[row][col]);
        }
    }

    static void showProds() {
        System.out.println("***************************");
        System.out.println("Pos   Nombre      Precio  Stock");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                int espacios = maxString - nombresProductos[i][j].length() + 3;

                System.out.print(i);
                System.out.print(j);
                System.out.print("    ");
                System.out.print(nombresProductos[i][j]);
                for (int k = 0; k < espacios; k++) {
                    System.out.print(" ");
                }
                System.out.printf("%.2f    ", precio[i][j]);
                System.out.println(cantidad[i][j]);
            }
        }
        System.out.println("***************************");
    }

    static int checkMaxString() {
        int output = 0;
        for (String[] fila : nombresProductos) {
            for (String producto : fila) {
                if (producto.length() > output) {
                    output = producto.length();
                }
            }
        }
        return output;
    }

    static boolean login() {
        String pass = "2025";
        System.out.print("Introduce la contraseña: ");
        if (pass.equals(sc.nextLine())) {
            System.out.println("Contraseña correcta.");
            return true;
        } else {
            System.out.println("Contraseña incorrecta.");
            return false;
        }
    }

    static void addProd() {
        System.out.print("Introduce la cantidad: ");
        String num = sc.nextLine();
        if (num.matches("\\d+")) {
            cantidad[row][col] += Integer.parseInt(num);
            System.out.println("Se ha incrementado la cantidad");
        } else {
            System.out.println("Tienes que introducir un numero.");
        }
    }

    static void fillProd() {
        if (login()) {
            System.out.print("Introduce la posicion que quieras: ");
            String cod = sc.nextLine();
            if (validateCod(cod)) {
                addProd();
            }
        }
    }

    static void fillMoney() {
        System.out.print("Introduce cuanto dinero quieres ingresar: ");
        String pastaca = sc.nextLine();
        if (strIsDouble(pastaca)) {
            money += Double.parseDouble(pastaca);
        } else {
            System.out.println("Introduce una cantidad valida. P. ej.: 2.50 o 10");
        }
    }

    static void exit() {
        System.out.printf("Las ventas totales han sido de %.2f euros%n", sales);
        loop = false;
    }

    static void app() {
        System.out.println(bLee);
        maxString = checkMaxString();

        System.out.println("Como te llamas, pistolero? ");
        nombre = sc.nextLine();
        do {
            System.out.print(menuPrompt0);
            System.out.println(nombre);
            System.out.print(menuPrompt1);
            System.out.printf(" %.2f ", money);
            System.out.print(menuPrompt2);
            String input = sc.nextLine();
            if (strIsDigit(input)) {
                int option = Integer.parseInt(input);
                switch (option) {
                    case 1:
                        buyProd();
                        break;
                    case 2:
                        showProds();
                        break;
                    case 3:
                        fillProd();
                        break;
                    case 4:
                        fillMoney();
                        break;
                    case 5:
                        exit();
                        break;
                    default:
                        System.out.println("Elige entre 1-5");
                }
            } else {
                System.out.println("Escribe un numero entre 1-5");
            }
        } while (loop);
    }

}
