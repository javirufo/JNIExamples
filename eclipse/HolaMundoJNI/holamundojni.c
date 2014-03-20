#include <stdio.h>
#include "holamundojni_Main.h"

JNIEXPORT void JNICALL Java_holamundojni_Main_HolaMundoJNI
  (JNIEnv *env, jobject obj)
  {
  	printf("Hola mundo a traves de jni!!!\n");	
  }
 
 