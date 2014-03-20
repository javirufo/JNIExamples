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
  	jfieldID campoID = (*env)->GetFieldID(env, clase, "cadena", "Ljava/lang/String;");
  	if (campoID==NULL)
  	{
  		printf("No se encuentra el campo\n");
  		return;
  	}
  	jstring cadena = (*env)->GetObjectField(env, obj, campoID);
  	const jbyte* cadenaC = (*env)->GetStringUTFChars(env, cadena, NULL);
  	(*env)->SetObjectField(env, obj, campoID, (*env)->NewStringUTF(env,  strcat(cadenaC, "HOLA")));  	     
	(*env)->ReleaseStringUTFChars(env, cadena, cadenaC);  	  
  }
  
  