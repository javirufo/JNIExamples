/*
 * Main.java
 *
 * Created on 21 de noviembre de 2006, 11:59
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package lanzaexcepciones;

/**
 *
 * @author javi
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }

    public static native int cogeValor(int[]vector, int pos);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []vectorEnteros = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        int valor;
        try{            
            valor = Main.cogeValor(vectorEnteros, 100);
        }catch(Exception ex)
        {
            System.out.println("Se ha producido una excepcion: "+ex.getMessage());
            return;                        
        }
        System.out.println("El valor es: "+valor);
    }
    static{
        System.loadLibrary("LanzaExcepciones");
    }
    
}
