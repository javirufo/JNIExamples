/*
 * Main.java
 *
 * Created on 21 de noviembre de 2006, 10:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package referenciaglobal;

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
        Main m = new Main();
        
        for(int i=0; i<10; i++)
           m.LlamaImprime();
    }
    static{
        System.loadLibrary("ReferenciaGlobal");
    }
}
