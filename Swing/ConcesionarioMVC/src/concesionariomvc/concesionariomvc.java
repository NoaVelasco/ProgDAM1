/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionariomvc;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.WindowConstants;

/**
 *
 * @author noave
 */
class DataMng {

    ArrayList<Clientes> clientes = new ArrayList<>();
    ArrayList<Coches> coches = new ArrayList<>();
    private String pathClientes;
    private String pathCoches;

    public DataMng(String fileCli, String fileCoch) {
        this.pathClientes = fileCli;
        this.pathCoches = fileCoch;
        fillClientes(fileCli);
        fillCoches(fileCoch);
    }

    void fillClientes(String fileCli) {
        // Lee el fichero de clientes y lo añade a la lista de clientes
        try (
            FileReader fr = new FileReader(fileCli); 
            BufferedReader br = new BufferedReader(fr);
        ) {
            String line = br.readLine();
            while (line != null) {
                String[] datos = line.split(";");
                Clientes c = new Clientes(datos[0], datos[1], datos[2], Long.parseLong(datos[3]));
                clientes.add(c);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero de clientes.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero de clientes.");
        }
    }

    void fillCoches(String fileCoch) {
        // Lee el fichero de coches y lo añade a la lista de coches
        try (
            FileReader fr = new FileReader(fileCoch); 
            BufferedReader br = new BufferedReader(fr);
        ) {
            String line = br.readLine();
            while (line != null) {
                String[] datos = line.split(";");
                Coches c = new Coches(datos[0], datos[1], datos[2], datos[3]);
                coches.add(c);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero de coches.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero de coches.");
        }
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public ArrayList<Coches> getCoches() {
        return coches;
    }

    public String getPathClientes() {
        return pathClientes;
    }

    public String getPathCoches() {
        return pathCoches;
    }

}

class Controlador {

    private static boolean oneWindow;
    private DataMng data;
    private GUIClientes cliFrame;
    private GUICoches cochFrame;
    private Scanner sc;

    public Controlador() {
        // Manejamos el scanner desde Controlador para poder cerrarlo al final
        sc = new Scanner(System.in);

        Clientes.setList(sc);
        Coches.setList(sc);
        data = new DataMng("clientes.txt", "coches.txt");

        showCliFrame();
    }

    private void showCliFrame() {
        // Inicializa el JFrame de clientes y lo muestra
        cliFrame = new GUIClientes(data);
        cliFrame.setBounds(100, 100, 500, 500);
        // No hacemos nada al cerrar la ventana, lo manejamos con los listeners
        cliFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        confListenersCli();
        cliFrame.setVisible(true);
        oneWindow = true;
    }

    private void showCochFrame(int x, int y) {
        // Inicializa el JFrame de coches y lo muestra
        // Le pasamos la posición de la ventana de clientes para que no se superpongan
        cochFrame = new GUICoches(data);
        cochFrame.setBounds(x, y, 700, 700);
        cochFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confListenersCoch();
        cochFrame.setVisible(true);
        // Si se abre desde Clientes, ya hay más de una ventana abierta
        // Si se refresca tras comprar, no sabemos si hay más de una ventana abierta
        // así que lo maneja negando el valor que tenga al cerrar y abrir de nuevo.
        oneWindow = !oneWindow;
    }

    private void confListenersCli() {
        // Si pulsamos COMPRAR, se abre la ventana de coches
        cliFrame.comprar.addActionListener((ActionEvent e) -> {
            if (oneWindow) {
                showCochFrame(600, 100);
            }
        });

        // Si pulsamos ABRIL, CERRAL la ventana de clientes
        // y si es la única ventana abierta, cerramos la aplicación
        cliFrame.abril.addActionListener((ActionEvent e) -> {
            if (oneWindow) {
                closeApp();
            } else {
                cliFrame.dispose();
                oneWindow = true;
            }
        });

        // Evento de cierre de ventana al clicar la X (como ABRIL-CERRAL)
        cliFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (oneWindow) {
                    closeApp();
                } else {
                    cliFrame.dispose();
                    oneWindow = true;
                }
            }
        });
    }

    private void confListenersCoch() {
        // Evento de cierre de ventana al clicar la X
        cochFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (oneWindow) {
                    closeApp();
                } else {
                    cochFrame.dispose();
                    oneWindow = true;
                }
            }
        });

        // Aquí irían los listeners de botones de compra ---------------
        for (int i = 0; i < data.getCoches().size(); i++) {
            // tengo que hacer una constante para pasarla al listener, 
            // no me deja pasarle i tal cual no sé por qué
            final int fila = i;
            // si el botón de compra no es null, le asigno el listener
            if (cochFrame.getBtnCompra(i) != null) {
                cochFrame.getBtnCompra(i).addActionListener(e -> compraCoche(fila));
            }
        }
    }

    private void compraCoche(int index) {
        // si se compra el coche, se elimina de la lista 
        // y se refrescan el archivo y el Jframe de coches
        data.coches.remove(index);
        Coches.refreshFileCars(data.coches);
        refreshCars();
    }

    private void refreshCars() {
        // Toma la posición de la ventana de coches y la cierra
        // para abrirla de nuevo con los coches actualizados
        int posX = cochFrame.getX();
        int posY = cochFrame.getY();
        cochFrame.dispose();
        oneWindow = !oneWindow;

        showCochFrame(posX, posY);
    }

    private void closeApp() {
        // Cierra el scanner y la aplicación
        if (sc != null) {
            sc.close();
        }
        System.exit(0);
    }

    // La verdad, creo que no necesito este setter y getter. 
    // Aunque oneWindow es private, estoy usándolo a pelo.
    public static boolean isOneWindow() {
        return oneWindow;
    }

    public static void setOneWindow(boolean oneWindow) {
        Controlador.oneWindow = oneWindow;
    }

}

public class concesionariomvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El constructor de Controlador se encarga de inicializar todo
        Controlador cont = new Controlador();
    }

}
