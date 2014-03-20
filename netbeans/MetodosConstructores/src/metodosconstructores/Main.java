/*
 * Main.java
 *
 * Created on 20 de noviembre de 2006, 12:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package metodosconstructores;

/**
 *
 * @author javi
 */
public class Main {
    private String _cadena;
    private int _a, _b;
    /** Creates a new instance of Main */
    public Main() {
        _cadena = new String();
        _a = -1;
        _b = -1;
    }
    
    public Main(String cadena, int a, int b){
        _cadena = new String(cadena);
        _a = a;
        _b = b;
    }
    
    public void ImprimeValores(){
        System.out.println("Valor de cadena: "+_cadena);
        System.out.println("Valor de a: "+_a);
        System.out.println("Valor de b: "+_b);
    }
    
    
    public static native void Constructores();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main.Constructores();
    }
    static{
        System.loadLibrary("MetodosConstructores");
    }
}
