/*
 * Main.java
 *
 * Created on 11 de noviembre de 2006, 9:59
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
    
    public native int sumavalores(int a, int b);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length!=2)
	{
                System.out.println("Este programa solo suma dos valores\n");
                return;
	}
        Main debug = new Main();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int resultado = debug.sumavalores(a, b);
        System.out.println("resultado "+resultado);
    }
    
    static{
        System.loadLibrary("libreriaJNI");
    }
    
    
}
