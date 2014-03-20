#include <stdio.h>
#include "libreriaJNI.h"


JNIEXPORT jint JNICALL Java_holamundojni_Main_sumavalores
  (JNIEnv *env, jobject obj, jint a, jint b)
  {
  	int c=0;
  	c = a+b;
  	return c;
  }
  