#include "captura.h"
JNIEXPORT void JNICALL Java_capturaexcepciones_Main_noCapturaExcepcion
  (JNIEnv *env, jclass class)
  {
  	(*env)->FindClass(env, "paquito/chocolatero");
  	if ((*env)->ExceptionOccurred(env))
  	{
  		printf("Ha ocurrido una excepcion en JNI. No hacemos nada\n");
  	}
  }

/*
 * Class:     capturaexcepciones_Main
 * Method:    clearExcepcion
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_capturaexcepciones_Main_clearExcepcion
  (JNIEnv *env, jclass class)
  {
  	(*env)->FindClass(env, "paquito/chocolatero");
  	if ((*env)->ExceptionOccurred(env))
  	{
  		printf("Ha ocurrido una excepcion en JNI. Vamos a clear\n");
  		(*env)->ExceptionClear(env);  		
  	}
  }


/*
 * Class:     capturaexcepciones_Main
 * Method:    describeExcepcion
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_capturaexcepciones_Main_describeExcepcion
  (JNIEnv *env, jclass class)
  {  	  
  	(*env)->FindClass(env, "paquito/chocolatero");
  	if ((*env)->ExceptionOccurred(env))
  	{
  		printf("Ha ocurrido una excepcion en JNI. Vamos a describe:\n");
  		(*env)->ExceptionDescribe(env);  	
  		(*env)->ExceptionClear(env);	
  	}  	
  }
