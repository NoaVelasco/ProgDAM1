/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeo;

/**
 *
 * @author dam1
 */
public class BruceLee {

    /**
     * @param args the command line arguments
     */
    
    static String bruceleeascii = """
                                            .                              . .                   .  
                                     .                                                              
                                                                  .                                 
  .                                                ........                                         
        .                                       ............                       .    .       .   
       .                                      ....++-.=+#==...                   .                  
                                            ...:#@@@%%%%@@@@%-..                                    
                                         ..-#%%%@@@@@@@@@@@@@@%#.                .             .    
                                        ..%%%@@@@@@@@@@@@@@@@@@@=.                    .             
         .            .                :#%@@@@@@@@@@@@@@@@@@@@%%@%                                  
            .                          -@@@@@@@@@@@@@@@@@@@@@@%%@@.                                 
   .                  .              . *@@%@%@%%%%@%@@@@@@@@%%%%%@#          .        .             
    .                                 .#@@%%%%%@%%#%%##%#%@@%%@@@@@.         .      .               
                                    .  +@%%%%@@#%@#**%%%@%#%%%@@@@@.                                
                                      .:@%%**#*#++----%*%%@%@@@@@@%.                              . 
                                       .@%%*=+++---=+:-=+#@@@@%+=%#     .                           
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
    
    public static void main(String[] args) {
        System.out.println(bruceleeascii);
    }
    
}

