/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author dam1
 */
public class Data {

    public ArrayList<Demonio> todosDemonios = new ArrayList<>();
    public ArrayList<Brujo> todosBrujos = new ArrayList<>();
    public final String PATH_DEMONS_TXT = "demonios.txt";
    public final String PATH_DEMONS_DAT = "demonios.dat";
    public final String PATH_DEMONS = "demonios";
    public final String PATH_BRUJOS_DAT = "brujos.dat";

    public Brujo brujo1 = new Brujo("Malakar el Maldito");
    public Brujo brujo2 = new Brujo("Morgana Sombraluna");
    public Brujo brujo3 = new Brujo("Vexion el Corruptor");
    public Brujo brujo4 = new Brujo("Lilith Sangreoscura");
    
//    Brujo[] brujos;
    JButton[] botonesGana;

    public Data() {
        todosBrujos.add(brujo1);
        todosBrujos.add(brujo2);
        todosBrujos.add(brujo3);
        todosBrujos.add(brujo4);
//        extraeDemonios(PATH_DEMONS_TXT);
    }

    public ArrayList<Demonio> getTodosDemonios() {
        return todosDemonios;
    }
    

    public ArrayList<Brujo> getTodosBrujos() {
        return todosBrujos;
    }
    
    

}

