package torneobrujos;

import java.io.*;
import java.util.ArrayList;



public class Controlador {

    public final String PATH_DEMONS = "demonios";
    
    private ArrayList<Demonio> todosDemonios;
    private ArrayList<Brujo> todosBrujos;
    ArrayList<Demonio> bestDemons = new ArrayList<>();

    public Controlador() {
        todosDemonios = new ArrayList<>();
        todosBrujos = new ArrayList<>();
    }    
    
    
    void inicializar() {
        extraeDemonios(PATH_DEMONS);
        if (!todosDemonios.isEmpty()) {
            System.out.println("Se han cargado " + todosDemonios.size() + " demonios:");
            for (Demonio demonio : todosDemonios) {
                System.out.println(demonio.toString());
            }
        } else {
            System.out.println("No se han podido cargar demonios.");
        }
    }    
    
    
    void extraeDemonios(String ruta) {

        todosDemonios.clear();


        if (!extraeDeDAT(ruta, todosDemonios)) {
            extraeDeTXT(ruta, todosDemonios);
        }
        if (!todosDemonios.isEmpty()) {
            escribeDemonios(ruta, todosDemonios);
            System.out.println("Se ha generado el archivo " + ruta + ".dat con " + todosDemonios.size() + " demonios");
        } else {
            crearDemoniosPorDefecto(todosDemonios);
            escribeDemonios(ruta, todosDemonios);
            System.out.println("Se ha generado el archivo " + ruta + ".dat con demonios por defecto");
        }
    }


    private void extraeDeTXT(String ruta, ArrayList<Demonio> demonios) {
        try (
                FileReader fr = new FileReader(ruta+".txt"); 
                BufferedReader br = new BufferedReader(fr);
            ) {
            String line = br.readLine();
            while (line != null) {
                
                String[] campo = line.split(";");
                if (campo.length == 4) {
                    Demonio d = new Demonio(campo[0], campo[1], Integer.parseInt(campo[2]), Integer.parseInt(campo[3]));
                    demonios.add(d);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero.");
        } catch (IOException ex) {
            System.out.println("No se puede leer el fichero.");
        }
    }


    private boolean extraeDeDAT(String ruta, ArrayList<Demonio> demonios) {
        try (
                FileInputStream fis = new FileInputStream(ruta+".dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
            while (true) {
                try {
                    Demonio dem = (Demonio) ois.readObject();  // hay que castearlo como el objeto de nuestro MODEL porque lee un Objeto padre
                    demonios.add(dem);
                } catch (EOFException e) {
                    System.out.println("Fin del archivo");
                    return true;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra");
        } catch (IOException ex2) {
            System.out.println("No se pudo leer");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo leer la clase");
        } 
        return false;
    }


    private void escribeDemonios(String ruta, ArrayList<Demonio> demonios) {
        try (
                FileOutputStream fos = new FileOutputStream(ruta+".dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
            ) {
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
    

    private void crearDemoniosPorDefecto(ArrayList<Demonio> demonios) {
        demonios.add(new Demonio("Azeroth", "fuego", 450, 85));
        demonios.add(new Demonio("Nyx", "agua", 320, 45));
        demonios.add(new Demonio("Volthar", "rayo", 280, 75));
        demonios.add(new Demonio("Gorath", "defensivo", 580, 30));
        demonios.add(new Demonio("Zephyra", "agilidad", 210, 90));
        demonios.add(new Demonio("Mordecai", "mágico", 380, 65));
        demonios.add(new Demonio("Infernus", "fuego", 520, 70));
        demonios.add(new Demonio("Tidalon", "agua", 340, 50));
        demonios.add(new Demonio("Stormfang", "rayo", 260, 80));
        demonios.add(new Demonio("Bulwark", "defensivo", 600, 20));
        demonios.add(new Demonio("Swiftclaw", "agilidad", 180, 95));
        demonios.add(new Demonio("Grimclaw", "fuego", 400, 65));
        demonios.add(new Demonio("Aquarius", "agua", 280, 70));
        demonios.add(new Demonio("Thunderborn", "rayo", 350, 60));
        demonios.add(new Demonio("Stonehide", "defensivo", 520, 25));
        demonios.add(new Demonio("Shadowstep", "agilidad", 200, 85));
        demonios.add(new Demonio("Arcanus", "mágico", 410, 55));
        demonios.add(new Demonio("Blazefury", "fuego", 430, 75));
        demonios.add(new Demonio("Frostbite", "agua", 300, 60));
        demonios.add(new Demonio("Boltcaster", "rayo", 320, 70));
        
    }
 
    
    public ArrayList<Brujo> crearBrujos() {
        todosBrujos.clear();
        
        Brujo b1 = new Brujo("Malakar el Maldito");
        Brujo b2 = new Brujo("Morgana Sombraluna");
        Brujo b3 = new Brujo("Vexion el Corruptor");
        Brujo b4 = new Brujo("Lilith Sangreoscura");
        
        todosBrujos.add(b1);
        todosBrujos.add(b2);
        todosBrujos.add(b3);
        todosBrujos.add(b4);
        
        return todosBrujos;
    }

    
    public void asignarDemonios() {
        int demoniosPorBrujo = Math.min(todosDemonios.size() / todosBrujos.size(), 10);
        
        for (int i = 0; i < todosBrujos.size(); i++) {
            Brujo brujo = todosBrujos.get(i);
            
            for (int j = 0; j < demoniosPorBrujo; j++) {
                int indice = i * demoniosPorBrujo + j;
                if (indice < todosDemonios.size()) {
                    brujo.añadirDemonio(todosDemonios.get(indice));
                    todosDemonios.get(indice).setDeBrujo(brujo.getNombre());
                }
            }
        }
    }
    

    
    public ArrayList<Demonio> ordenaDemonios(){
        bestDemons = new ArrayList<>();
        
        //  demonios con 300 o más puntos de vida
        for (Demonio demonio : todosDemonios) {
            if (demonio.getPuntos() >= 300) {
                bestDemons.add(demonio);
            }
        }
        
        // de mayor a menor (adiós algoritmos de ordenación)
        bestDemons.sort((d1, d2) -> Integer.compare(d2.getPuntos(), d1.getPuntos()));
        
        return bestDemons;
    }
    

    public ArrayList<Brujo> getBrujos() {
        return todosBrujos;
    }
    

    public ArrayList<Demonio> getDemonios() {
        return todosDemonios;
    }
}
