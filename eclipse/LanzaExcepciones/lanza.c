#include "lanza.h"

JNIEXPORT jint JNICALL Java_lanzaexcepciones_Main_cogeValor
  (JNIEnv *env , jclass cls, jintArray vector, jint pos)
  {
  	
  	jsize vectorLen = (*env)->GetArrayLength(env, vector);
  	if (pos>=vectorLen)
  	{
  		//Estoy fuera de rango, tengo que lanzar excepcion
  		jclass classExcepcion = (*env)->FindClass(env, "java/lang/ArrayIndexOutOfBoundsException");
  		jint resul = (*env)->ThrowNew(env, classExcepcion, "Excepcion en JNI. Posicion fuera de rango");
  		if (resul==0)
  			printf("Excepcion lanzada\n");
  	}
  	jint* vectorC = (*env)->GetIntArrayElements(env, vector, NULL);
  	jint retorno = vectorC[pos];  	
  	(*env)->ReleaseIntArrayElements(env, vector, vectorC, JNI_ABORT);
  	return retorno;
  }
