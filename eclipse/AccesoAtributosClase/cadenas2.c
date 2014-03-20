#include "cadenas2.h"
#include <string.h>
#include <malloc.h>

JNIEXPORT void JNICALL Java_cadenas2_Main_ModificaCadena
  (JNIEnv *env, jobject obj)
  {
  	
  	jclass clase = (*env)->GetObjectClass(env, obj);
  	if (clase==NULL)
  	{
  		printf("No se encuentra clase\n");
  		return;
  	}  	
  	jfieldID campoID = (*env)->GetStaticFieldID(env, clase, "cadena", "Ljava/lang/String;");
  	if (campoID==NULL)
  	{
  		printf("No se encuentra el campo\n");
  		return;
  	}
  	jstring cadena = (*env)->GetStaticObjectField(env, obj, campoID);  	
  	const jbyte* cadenaC = (*env)->GetStringUTFChars(env, cadena, NULL);
  	jstring nuevaCadena = (*env)->NewStringUTF(env,  "HOLA");//strcat(cadenaC, "HOLA"));
  	(*env)->SetStaticObjectField(env, obj, campoID, nuevaCadena);  	     
	(*env)->ReleaseStringUTFChars(env, cadena, cadenaC);
	  	  
  }
  
  