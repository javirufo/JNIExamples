/*
 * Main.java
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
public class Main extends ClaseBase {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    
    public void Imprime(){
        System.out.println("Estoy en la clase derivada");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseBase base = new Main();
        base.metodoNativo();
    }
    
}
