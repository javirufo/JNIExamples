/*
 * Principal.java
 *
 * Created on 14 de noviembre de 2006, 11:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import calculo.Calculadora;
/**
 *
 * @author javi
 */
public class Principal {
    
    /** Creates a new instance of Principal */
    public Principal() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length!=3)
        {
            System.out.println("Error, solo se admiten tres parametros");
            return;
        }
        System.out.print("Operacion a evaluar ");
        for(int i=0; i<args.length; i++)
            System.out.print(args[i]);
        System.out.println();
        
        Calculadora calc = new Calculadora();
        char operacion = args[1].charAt(0);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        switch(operacion)
        {
            case '+':
                System.out.println("Suma: "+calc.suma(a, b));
                break;
            case '-':
                System.out.println("Resta: "+calc.resta(a, b));
                break;
            case '*':
                System.out.println("Producto: "+calc.producto(a, b));
                break;
            case '/':
                System.out.println("Division: "+calc.division(a, b));
                break;
            default:
                System.out.println("Operacion no permitida");                        
        }
    }

    
}
