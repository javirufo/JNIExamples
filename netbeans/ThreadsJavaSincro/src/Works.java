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
    
	private Vector _works;
	private boolean hayDato = false;
        //----------------------------------------//
        public Works(){
            hayDato = false;
            _works = new Vector();
        }
        //----------------------------------------//
	public synchronized Object get() { 
		while (hayDato == false) { 
			try { 
				// espera a que el productor coloque un valor 
				wait(); 
                        }                        
			catch (InterruptedException e) { } 
		} 
                hayDato = false; 
		// notificar que el valor ha sido consumido 
                notifyAll();                 
		return _works.remove(0);
	}
        //----------------------------------------//
	public synchronized void put(int valor) { 		                
                while (hayDato == true) { 
			try { 
				// espera a que se consuma el dato 
				wait(); 
			} catch (InterruptedException e) { } 
		}                   
		_works.add(new Integer(valor));
		hayDato = true; 
		// notificar que ya hay dato. 
		notifyAll(); 
	}
        //----------------------------------------//
}
