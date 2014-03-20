/*
 * Debug.java
 *
 * Created on 11 de noviembre de 2006, 9:52
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package debug;

/**
 *
 * @author javi
 */
public class Debug {
    
    /** Creates a new instance of Debug */
    public Debug() {
    }
    
    
    public int sumaValores(int a, int b){
        int c=0;
        c = a+b;
        return c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length!=2)
	{
                System.out.println("Este programa solo suma dos valores\n");
                return;
	}
        Debug debug = new Debug();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int resultado = debug.sumaValores(a, b);
        System.out.println("resultado "+resultado);
    }
    
}
