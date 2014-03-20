/*
 * CalculadoraJNI.java
 *
 * Created on 14 de noviembre de 2006, 11:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package calculo;

/**
 *
 * @author javi
 */
public class CalculadoraJNI {
    
    /**
     * Creates a new instance of CalculadoraJNI
     */
    public CalculadoraJNI() {
    }    
    //-------------------------------------------------------//
    public static native int suma(int a, int b);
    //-------------------------------------------------------//
    public static native int resta(int a, int b);
    //-------------------------------------------------------//
    public static native int producto(int a, int b);
    //-------------------------------------------------------//
    public static native int division(int a, int b);
    //-------------------------------------------------------//
    static{
        System.loadLibrary("calculo");
    }
}

