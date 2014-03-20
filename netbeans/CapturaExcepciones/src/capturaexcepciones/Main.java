/*
 * Main.java
 *
 * Created on 21 de noviembre de 2006, 11:23
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package capturaexcepciones;

/**
 *
 * @author javi
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public static native void noCapturaExcepcion();
    public static native void clearExcepcion();
    public static native void describeExcepcion();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clear excepcion
        System.out.println("****CLEAR****");
        Main.clearExcepcion();
        //Describe
        
        System.out.println("****DESCRIBE****");
        Main.describeExcepcion();
        System.out.println("****NADA****");
        try{
            Main.noCapturaExcepcion();
        }catch(java.lang.NoClassDefFoundError ex)
        {
            System.out.println("Excepcion capturada en Java: "+ex.getMessage());
        }        //Sin capturar excepcion, la capturo en Java

    }
    
    static{
        System.loadLibrary("CapturaExcepciones");
    }
    
}
