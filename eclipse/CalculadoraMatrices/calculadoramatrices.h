#include <jni.h>
#ifndef CALCULADORAMATRICES_H_
#define CALCULADORAMATRICES_H_
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     calculadoramatrices_CalculadoraMatrices
 * Method:    sumaMatrices
 * Signature: ([[I[[I)[[I
 */
JNIEXPORT jobjectArray JNICALL Java_calculadoramatrices_CalculadoraMatrices_sumaMatrices
  (JNIEnv *, jobject, jobjectArray, jobjectArray);

#ifdef __cplusplus
}
#endif
#endif /*CALCULADORAMATRICES_H_*/
