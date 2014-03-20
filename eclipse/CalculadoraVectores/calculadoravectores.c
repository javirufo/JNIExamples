#include "calculadoravectores.h"

/*
 * Class:     calculadoravectores_CalculadoraVectores
 * Method:    sumaVectores
 * Signature: ([I[I)[I
 */
JNIEXPORT jintArray JNICALL Java_calculadoravectores_CalculadoraVectores_sumaVectores
  (JNIEnv *env, jobject obj, jintArray vectorA, jintArray vectorB)
{
	jintArray vectorC;
	jint* A;
	jint* B;
	jint* C;
	jsize index;
	jsize longitudA = (*env)->GetArrayLength(env, vectorA);
	jsize longitudB = (*env)->GetArrayLength(env, vectorB);
	if (longitudA != longitudB)
		return NULL;
	vectorC = (*env)->NewIntArray(env, longitudA);
	A = (jint*) (*env)->GetIntArrayElements(env, vectorA, NULL);
	B = (jint*) (*env)->GetIntArrayElements(env, vectorB, NULL);
	C = (jint*) (*env)->GetIntArrayElements(env, vectorC, NULL);
	for(index=0; index<longitudA; index++)
	{
		C[index] = A[index]+B[index];
	}
	(*env)->ReleaseIntArrayElements(env, vectorA, A, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorB, B, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorC, C, 0);//Copio el contenido y libero C
	return vectorC;
}
/*
 * Class:     calculadoravectores_CalculadoraVectores
 * Method:    restaVectores
 * Signature: ([I[I)[I
 */
JNIEXPORT jintArray JNICALL Java_calculadoravectores_CalculadoraVectores_restaVectores
  (JNIEnv *env, jobject obj, jintArray vectorA, jintArray vectorB)
  {
	jintArray vectorC;
	jint* A;
	jint* B;
	jint* C;
	jsize index;
	jsize longitudA = (*env)->GetArrayLength(env, vectorA);
	jsize longitudB = (*env)->GetArrayLength(env, vectorB);
	if (longitudA != longitudB)
		return NULL;
	vectorC = (*env)->NewIntArray(env, longitudA);
	A = (jint*) (*env)->GetIntArrayElements(env, vectorA, NULL);
	B = (jint*) (*env)->GetIntArrayElements(env, vectorB, NULL);
	C = (jint*) (*env)->GetIntArrayElements(env, vectorC, NULL);
	for(index=0; index<longitudA; index++)
	{
		C[index] = A[index]-B[index];
	}
	(*env)->ReleaseIntArrayElements(env, vectorA, A, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorB, B, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorC, C, 0);//Copio el contenido y libero C
	return vectorC;
  }
  

/*
 * Class:     calculadoravectores_CalculadoraVectores
 * Method:    multiplicaVectores
 * Signature: ([I[I)[I
 */
JNIEXPORT jintArray JNICALL Java_calculadoravectores_CalculadoraVectores_multiplicaVectores
  (JNIEnv *env, jobject obj, jintArray vectorA, jintArray vectorB)
  {
	jintArray vectorC;
	jint* A;
	jint* B;
	jint* C;
	jsize index;
	jsize longitudA = (*env)->GetArrayLength(env, vectorA);
	jsize longitudB = (*env)->GetArrayLength(env, vectorB);
	if (longitudA != longitudB)
		return NULL;
	vectorC = (*env)->NewIntArray(env, longitudA);
	A = (jint*) (*env)->GetIntArrayElements(env, vectorA, NULL);
	B = (jint*) (*env)->GetIntArrayElements(env, vectorB, NULL);
	C = (jint*) (*env)->GetIntArrayElements(env, vectorC, NULL);
	for(index=0; index<longitudA; index++)
	{
		C[index] = A[index]*B[index];
	}
	(*env)->ReleaseIntArrayElements(env, vectorA, A, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorB, B, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorC, C, 0);//Copio el contenido y libero C
	return vectorC;
  }

/*
 * Class:     calculadoravectores_CalculadoraVectores
 * Method:    divideVectores
 * Signature: ([I[I)[I
 */
JNIEXPORT jintArray JNICALL Java_calculadoravectores_CalculadoraVectores_divideVectores
  (JNIEnv *env, jobject obj, jintArray vectorA, jintArray vectorB)
  {
	jintArray vectorC;
	jint* A;
	jint* B;
	jint* C;
	jsize index;
	jsize longitudA = (*env)->GetArrayLength(env, vectorA);
	jsize longitudB = (*env)->GetArrayLength(env, vectorB);
	if (longitudA != longitudB)
		return NULL;
	vectorC = (*env)->NewIntArray(env, longitudA);
	A = (jint*) (*env)->GetIntArrayElements(env, vectorA, NULL);
	B = (jint*) (*env)->GetIntArrayElements(env, vectorB, NULL);
	C = (jint*) (*env)->GetIntArrayElements(env, vectorC, NULL);
	for(index=0; index<longitudA; index++)
	{
		C[index] = A[index]/B[index];
	}
	(*env)->ReleaseIntArrayElements(env, vectorA, A, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorB, B, JNI_ABORT);
	(*env)->ReleaseIntArrayElements(env, vectorC, C, 0);//Copio el contenido y libero C
	return vectorC;
  }



