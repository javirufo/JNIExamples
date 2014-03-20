/*
 * CalculadoraVectores.java
 *
 * Created on 15 de noviembre de 2006, 11:06
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package calculadoravectores;

/**
 *
 * @author javi
 */
public class CalculadoraVectores {
    
    /** Creates a new instance of CalculadoraVectores */
    public CalculadoraVectores() {
    }
    
    public native int[]sumaVectores(int[] a, int []b);
    public native int[]restaVectores(int[] a, int []b);
    public native int[]multiplicaVectores(int[] a, int []b);
    public native int[]divideVectores(int[] a, int []b);
    /**
     * @param args the command line arguments
     */
    public final int[]vectorA = {1, 1, 2, 3, 5, 8, 13, 21, 34};
    public final int[]vectorB = {1, 2, 3, 5, 7, 11, 13, 17, 23};
    public static void main(String[] args) {
        if (args.length!=1)
        {
            System.out.printf("Solo se admite el parametro de operacion");
            return;
        }
        CalculadoraVectores calc = new CalculadoraVectores();
        int []resultado = null;
        char operacion = args[0].charAt(0);
        switch(operacion)
        {
            case '+':
                resultado = calc.sumaVectores(calc.vectorA, calc.vectorB);
                break;
            case '-':
                resultado = calc.restaVectores(calc.vectorA, calc.vectorB);
                break;
            case '*':
                resultado = calc.multiplicaVectores(calc.vectorA, calc.vectorB);
                break;
            case '/':
                resultado = calc.divideVectores(calc.vectorA, calc.vectorB);
                break;
            default:
                System.out.println("Operacion no permitida");                        
        }        
        if (resultado!=null)
        {
            for(int i=0; i<resultado.length; i++)
                System.out.print(resultado[i]+" ");
        }
    }
    
    static{
        System.loadLibrary("CalculadoraVectores");
    }
    
}
