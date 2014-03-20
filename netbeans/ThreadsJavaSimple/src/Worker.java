/*
 * Worker.java
 *
 * Created on 22 de noviembre de 2006, 9:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.util.Vector;
/**
 *
 * @author javi
 */
public class Worker implements Runnable {
    
    private Vector _works;
    private boolean _fin;
    /** Creates a new instance of Worker */
    public Worker(Vector work) {
        _works = work;
        _fin = false;
        
    }
    //----------------------------------------//    
    private void cogeTrabajo(){
        try{
            int valor = ((Integer)_works.remove(0)).intValue();
            System.out.println("Trabajador: Cojo el trabajo "+valor);
        }catch(Exception ex)
        {
            _fin = true;
        }
    }
    //----------------------------------------//
    public void run(){
        while(!_fin)
        {
            cogeTrabajo();
            try{
                Thread.sleep(1000);
            }catch(Exception ex){
            }
        }
        System.out.println("El trabajador finaliza, no hay trabajos");
    }
    //----------------------------------------//
}
