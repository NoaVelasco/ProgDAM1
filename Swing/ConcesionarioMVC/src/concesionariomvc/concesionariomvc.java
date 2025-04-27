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
//import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

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
        try (
                FileReader fr = new FileReader(fileCli); BufferedReader br = new BufferedReader(fr);) {
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
        try (
                FileReader fr = new FileReader(fileCoch); BufferedReader br = new BufferedReader(fr);) {
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

//    private ArrayList<Clientes> clientes = new ArrayList<>();
//    private ArrayList<Coches> coches = new ArrayList<>();
    private static boolean oneWindow;
    private DataMng data;
    private GUIClientes cliFrame;
    private GUICoches cochFrame;
    private Scanner sc;

    public Controlador() {
        sc = new Scanner(System.in);

        Clientes.setList(sc);
        Coches.setList(sc);
        data = new DataMng("clientes.txt", "coches.txt");

        showCliFrame();
    }

    private void showCliFrame() {
        cliFrame = new GUIClientes(data);
        cliFrame.setBounds(100, 100, 500, 500);
        cliFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        confListenersCli();
        cliFrame.setVisible(true);
        oneWindow = true;
    }

    private void showCochFrame(int x, int y) {
        cochFrame = new GUICoches(data);
        cochFrame.setBounds(x, y, 700, 700);
        cochFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confListenersCoch();
        cochFrame.setVisible(true);
        oneWindow = !oneWindow;
    }

    private void confListenersCli() {
        cliFrame.comprar.addActionListener((ActionEvent e) -> showCochFrame(600, 100));

        cliFrame.abril.addActionListener((ActionEvent e) -> {
            if (oneWindow) {
                closeApp();
            } else {
                cliFrame.dispose();
                oneWindow = true;
            }
        }
        );

        // Evento de cierre de ventana
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
        // Evento de cierre de ventana
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
            final int fila = i;
            if (cochFrame.getBtnCompra(i) != null) {
                cochFrame.getBtnCompra(i).addActionListener(e -> compraCoche(fila));
            }
        }
    }
    
    private void compraCoche(int index){
        data.coches.remove(index);
        Coches.refreshCars(data.coches);
        refreshCars();
    }
    
    private void refreshCars(){
        int posX = cochFrame.getX();
        int posY = cochFrame.getY();
        cochFrame.dispose();
        oneWindow = !oneWindow;
        
        showCochFrame(posX, posY);
    }

    private void closeApp() {
        if (sc != null) {
            sc.close();
        }
        System.exit(0);
    }

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
        // TODO code application logic here
        Controlador cont = new Controlador();
//        cont.listen();
    }

}
