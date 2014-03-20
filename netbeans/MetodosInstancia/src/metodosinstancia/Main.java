package metodosinstancia;
/*
 * Main.java
 *
 * Created on 16 de noviembre de 2006, 12:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
public class Main {
    private int resultado;
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public int getResultado(){
        return resultado;
    }
    public void suma(int a, int b){
        resultado = a + b;
    }
    public native void sumaC();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main metodos = new Main();
        System.out.println("Antes de JNI resultado es: " +metodos.getResultado());
        metodos.sumaC();
        System.out.println("Despues de JNI resultado es: " +metodos.getResultado());
    }
    static {
        System.loadLibrary("MetodosInstancia");
    }
}
