#include <stdio.h>
#include "metodos.h"

JNIEXPORT void JNICALL Java_metodosclase_Main_LlamaImprime
  (JNIEnv * env, jobject obj)
  {
  	jclass clase = (*env)->FindClass(env, "metodosclase/Main");
  	if (clase==NULL)
  		return;
  	jmethodID metodoID = (*env)->GetStaticMethodID(env, clase, "Imprime", "(Ljava/lang/String;)V");
	if (metodoID == NULL)
		return;
	jstring cadenaJava = (*env)->NewStringUTF(env, "Hola caracola");
	(*env)->CallStaticVoidMethod(env, obj, metodoID, cadenaJava);  	
  }

