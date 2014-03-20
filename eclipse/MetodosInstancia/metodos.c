#include "metodos.h"

JNIEXPORT void JNICALL Java_metodosinstancia_Main_sumaC
  (JNIEnv *env,  jobject obj)
  {  	
  	jclass clase = (*env)->FindClass(env, "metodosinstancia/Main");
  	if (clase==NULL)
  		return;
  	jmethodID metodoID = (*env)->GetMethodID(env, clase, "suma", "(II)V");  	
  	if (metodoID==NULL)
  		return;
  	(*env)->CallVoidMethod(env, obj, metodoID, 10, 15);  	
  }
