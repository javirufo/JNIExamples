/*
 * ProcesaParametros.java
 *
 * Created on 11 de noviembre de 2006, 9:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pasoparametros;

/**
 *
 * @author javi
 */
public class ProcesaParametros {
    
    /** Creates a new instance of ProcesaParametros */
    public ProcesaParametros() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Recibe por parametro "+args.length+" parametros");
        int i;
        for(i=0; i<args.length; i++)
        {
            System.out.println("Parametro "+i+" valor "+args[i]);
        }
    }
    
}
