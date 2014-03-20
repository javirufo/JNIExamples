/*
 * CalculadoraMatrices.java
 *
 * Created on 15 de noviembre de 2006, 11:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package calculadoramatrices;

/**
 *
 * @author javi
 */
public class CalculadoraMatrices {
    
    /** Creates a new instance of CalculadoraMatrices */
    public CalculadoraMatrices() {
    }
    
    public native int[][]sumaMatrices(int [][]a, int [][]b);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int [][]a = {{1,0,3},{1,2,3},{1,7,3}};
        int [][]b = {{8,2,3},{1,5,3},{1,2,3}};
        int [][]c = new CalculadoraMatrices().sumaMatrices(a, b);
        if (c!=null)
        {
            for(int i=0; i<c.length; i++)
            {
                for(int j=0; j<c[0].length; j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
    static{
        System.loadLibrary("CalculadoraMatrices");
    }
    
    
}
