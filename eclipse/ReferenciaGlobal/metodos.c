#include <stdio.h>
#include "metodos.h"

JNIEXPORT void JNICALL Java_referenciaglobal_Main_LlamaImprime
  (JNIEnv * env, jobject obj)
  {
  	static jclass clase = NULL;
  	if (clase==NULL)
  	{
  		clase = (*env)->FindClass(env, "referenciaglobal/Main");
  		if (clase==NULL)
  		{
  			printf("No encuentro la clase");
	  		return;
  		}
  		clase = (jclass) (*env)->NewGlobalRef(env, clase);
  	}
  	else
  	{
  		printf("Uso la clase ya cargada estatica\n");
  	}
  	jmethodID metodoID = (*env)->GetStaticMethodID(env, clase, "Imprime", "(Ljava/lang/String;)V");
	if (metodoID == NULL)
		return;
	jstring cadenaJava = (*env)->NewStringUTF(env, "Hola caracola");
	(*env)->CallStaticVoidMethod(env, obj, metodoID, cadenaJava);  	
  }

