package threadsjavajni;
/*
 * Works.java
 *
 * Created on 22 de noviembre de 2006, 9:44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.util.Vector;
import java.io.*;
/**
 *
 * @author javi
 */
    public  class  Works{
    	int _valor;
        //----------------------------------------//
        public Works(){        
        }
        //----------------------------------------//
	public native int get();
        //----------------------------------------//
	public native void put(int valor);
        //----------------------------------------//
        static{
            System.loadLibrary("Works");            
        }
        //----------------------------------------//
}
