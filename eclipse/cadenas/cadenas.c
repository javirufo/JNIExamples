#include "cadenas.h"

JNIEXPORT jstring JNICALL Java_cadenas_Main_tomaTexto
  (JNIEnv *env, jobject obj,  jstring mensaje)
  {
  	char texto[255];
  	const jbyte* mensaje_c = (*env)->GetStringUTFChars(env, mensaje, NULL);
  	printf("%s:", mensaje_c);
  	(*env)->ReleaseStringUTFChars(env, mensaje, mensaje_c);
  	scanf("%s", texto);
  	return (*env)->NewStringUTF(env, texto);
  }
