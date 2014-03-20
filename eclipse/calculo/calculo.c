#include "calculo.h"

/*
 * Class:     calculo_CalculadoraJNI
 * Method:    suma
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_calculo_CalculadoraJNI_suma
  (JNIEnv *env, jclass class, jint a, jint b)
  {
  	return a+b;
  }

/*
 * Class:     calculo_CalculadoraJNI
 * Method:    resta
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_calculo_CalculadoraJNI_resta  
(JNIEnv *env, jclass class, jint a, jint b)
  {
  	return a-b;
  }
  

/*
 * Class:     calculo_CalculadoraJNI
 * Method:    producto
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_calculo_CalculadoraJNI_producto
(JNIEnv *env, jclass class, jint a, jint b)
  {
  	return a*b;
  }


/*
 * Class:     calculo_CalculadoraJNI
 * Method:    division
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_calculo_CalculadoraJNI_division
(JNIEnv *env, jclass class, jint a, jint b)
  {
  	return a/b;
  }


