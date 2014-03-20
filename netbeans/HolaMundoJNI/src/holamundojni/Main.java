/*
 * Main.java
 *
 * Created on 13 de noviembre de 2006, 10:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package holamundojni;

/**
 *
 * @author javi
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public native void HolaMundoJNI();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main().HolaMundoJNI();
    }
    static {
        System.loadLibrary("HolaMundoJNI");
    }
    
}
