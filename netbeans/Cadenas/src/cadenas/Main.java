/*
 * Main.java
 *
 * Created on 14 de noviembre de 2006, 12:51
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cadenas;

/**
 *
 * @author javi
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    private native String tomaTexto(String texto);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = new Main().tomaTexto("Inserte un mensaje: ");
        System.out.println("El mensaje es: "+texto);
    }
    static{
        System.loadLibrary("cadenas");
    }
    
}
