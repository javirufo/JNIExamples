#include "metodos.h"
JNIEXPORT void JNICALL Java_metodossuperclase_ClaseBase_metodoNativo
  (JNIEnv *env, jobject obj)
  {
  	jclass clase = (*env)->FindClass(env, "metodossuperclase/ClaseBase");  	  	
  	if (clase==NULL)
  	{
  		printf("No se encuentra la clase\n");
  		return;
  	}
  	jmethodID metodoID = (*env)->GetMethodID(env, clase, "Imprime", "()V");
  	if (metodoID==NULL)
  	{
  		printf("No se encuentra el metodo\n");
  		return;
  	}
  	(*env)->CallVoidMethod(env, obj, metodoID);
  	(*env)->CallNonvirtualVoidMethod(env, obj, clase, metodoID);
  }