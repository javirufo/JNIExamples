/*
 * ClaseBase.java
 *
 * Created on 20 de noviembre de 2006, 12:20
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package metodossuperclase;

/**
 *
 * @author javi
 */
public class ClaseBase {
    
    /** Creates a new instance of ClaseBase */
    public ClaseBase() {
    }
    public void Imprime(){
        System.out.println("Estoy en la clase base");
    }    
    public native void metodoNativo();

    static{
        System.loadLibrary("MetodosSuperClase");
    }
}

