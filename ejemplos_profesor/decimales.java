/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos_profesor;

import java.text.DecimalFormat;

/**
 *
 * @author jorge
 */
public class decimales {

    
    
    
    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x= 18;
        double y = 35.545355;
        
        double resultado = x+y;
        
        DecimalFormat df = new DecimalFormat("0.000");
        
        System.out.println(df.format(resultado));
    }
    
}
