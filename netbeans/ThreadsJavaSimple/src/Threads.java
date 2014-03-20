/*
 * Threads.java
 *
 * Created on 22 de noviembre de 2006, 9:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.util.Vector;
/**
 *
 * @author javi
 */
public class Threads {
    
    /** Creates a new instance of Threads */
    public Threads() {
    }
    //----------------------------------------//
    public static void main(String []args){
        Vector trabajos = new Vector();
        Thread masterT = new Thread(new Master(trabajos));
        Thread workerT = new Thread(new Worker(trabajos));
        masterT.start();
        workerT.start();
    }
    //----------------------------------------//
}
