/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author dam1
 */
public class Controlador {

    Data datos = new Data();

    public Controlador() {
    }

    void inicializar() {

        extraeDemonios(datos.PATH_DEMONS);
        for (Demonio demonio : datos.getTodosDemonios()) {
            System.out.println(demonio.toString());
        }
    }

    void extraeDemonios(String ruta) {
        ArrayList<Demonio> demonios = datos.getTodosDemonios();
        extraeDeDAT(ruta, demonios);

        if (demonios.isEmpty()) {
            extraeDeTXT(ruta, demonios);
            escribeDemonios(ruta, demonios);
        }

    }

    private void extraeDeTXT(String ruta, ArrayList<Demonio> demonios) {
        try (
                FileReader fr = new FileReader(ruta+".txt"); BufferedReader br = new BufferedReader(fr);) {
            String line = br.readLine();
            while (line != null) {
                String[] campo = line.split(";");
                Demonio d = new Demonio(campo[0], campo[1], Integer.parseInt(campo[2]), Integer.parseInt(campo[3]));
                demonios.add(d);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero.");
        }
    }

    private void extraeDeDAT(String ruta, ArrayList<Demonio> demonios) {
        try {
            FileInputStream fis = new FileInputStream(ruta+".dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Demonio dem = (Demonio) ois.readObject();  // hay que castearlo como el objeto de nuestro MODEL porque lee un Objeto padre
                    demonios.add(dem);
                } catch (EOFException e) {
                    System.out.println("Fin del archivo");
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra");
        } catch (IOException ex2) {
            System.out.println("No se pudo leer");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo leer la clase");
        }
    }

    private void escribeDemonios(String ruta, ArrayList<Demonio> demonios) {
        try {
            FileOutputStream fos = new FileOutputStream(ruta+".dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Demonio demonio : demonios) {
                oos.writeObject(demonio);
            }
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero");
        } catch (IOException ioEx) {
            System.out.println("No se pudo leer el fichero");
        }
    }

}

class Data {

    public ArrayList<Demonio> todosDemonios = new ArrayList<>();
    public ArrayList<Brujo> todosBrujos = new ArrayList<>();
    public ArrayList<Brujo> clasifBrujos;
    public ArrayList<JButton> btnGanaBrujo;
    public final String PATH_DEMONS_TXT = "demonios.txt";
    public final String PATH_DEMONS_DAT = "demonios.dat";
    public final String PATH_DEMONS = "demonios";
    public final String PATH_BRUJOS_DAT = "brujos.dat";

    public Brujo brujo1 = new Brujo("Malakar el Maldito");
    public Brujo brujo2 = new Brujo("Morgana Sombraluna");
    public Brujo brujo3 = new Brujo("Vexion el Corruptor");
    public Brujo brujo4 = new Brujo("Lilith Sangreoscura");

    public Data() {
        todosBrujos.add(brujo1);
        todosBrujos.add(brujo2);
        todosBrujos.add(brujo3);
        todosBrujos.add(brujo4);
        
        clasifBrujos = (ArrayList<Brujo>) todosBrujos.clone();
//        extraeDemonios(PATH_DEMONS_TXT);
    }

    public ArrayList<Demonio> getTodosDemonios() {
        return todosDemonios;
    }


    
    

}
