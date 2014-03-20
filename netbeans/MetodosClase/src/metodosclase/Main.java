/*
 * Main.java
 *
 * Created on 16 de noviembre de 2006, 13:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package metodosclase;

/**
 *
 * @author javi
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public static void Imprime(String mensaje){
        System.out.println(mensaje);
    }
    public native void LlamaImprime();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main().LlamaImprime();
    }
    static{
        System.loadLibrary("MetodosClase");
    }
    
}
