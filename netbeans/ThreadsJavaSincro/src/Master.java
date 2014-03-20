/*
 * Master.java
 *
 * Created on 22 de noviembre de 2006, 9:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.util.Vector;
/**
 *
 * @author javi
 */
public class Master implements Runnable{
    private Works _works;
    private int _counter;
    /** Creates a new instance of Master */
    public Master(Works works) {
        _works = works;
        _counter = 0;
    }
   //----------------------------------------//
    private void insertaTrabajo(){
        _works.put(_counter);
        System.out.println("Master: Trabajo insertado "+_counter);
        _counter++;        
    }
    //----------------------------------------//
    public void run(){
        while(_counter>-1)
        {
            insertaTrabajo();            
            try{
                //Thread.sleep(500);
            }catch(Exception ex){
            }             
        }
        System.out.println("*****MASTER se retira");
    }
    //----------------------------------------//
}
