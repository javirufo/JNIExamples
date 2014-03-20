#include "calculadoramatrices.h"
JNIEXPORT jobjectArray JNICALL Java_calculadoramatrices_CalculadoraMatrices_sumaMatrices
  (JNIEnv *env, jobject obj, jobjectArray matrizA, jobjectArray matrizB)
  {
  		jobjectArray matrizC;
  		jsize index;
  		jclass tipoMatriz;
  		jsize filas = (*env)->GetArrayLength(env, matrizA);
  		if (filas!=(*env)->GetArrayLength(env, matrizB))
  			return NULL;
  		tipoMatriz = (*env)->FindClass(env, "[I");
  		if(tipoMatriz==NULL)
  			return NULL;
  		matrizC = (*env)->NewObjectArray(env, filas, tipoMatriz, NULL);
  		if(matrizC==NULL)
  			return NULL;
		printf("Tengo %d filas\n", filas);
  		for(index=0; index<filas; index++)
  		{
  			printf("Proceso fila %d\n", index);
  			jsize col;
  			jint *A;
  			jint *B;
  			jint *C;  			
  			jintArray filaA = (jintArray) (*env)->GetObjectArrayElement(env, matrizA, index);  			
  			jintArray filaB = (jintArray) (*env)->GetObjectArrayElement(env, matrizB, index);  			
  			jsize columnas = (*env)->GetArrayLength(env, filaA);  			
  			jintArray filaC = (*env)->NewIntArray(env, columnas);  			
  			A = (*env)->GetIntArrayElements(env, filaA, NULL);  			
  			B = (*env)->GetIntArrayElements(env, filaB, NULL);  			
  			C = (*env)->GetIntArrayElements(env, filaC, NULL);  			  		
  			for(col=0; col<columnas; col++)
  			{
  				printf("%d + %d\n", A[col], B[col]);
  				C[col] = A[col]+B[col];
  			}
  			
  			(*env)->ReleaseIntArrayElements(env, filaA, A, JNI_ABORT);
  			(*env)->ReleaseIntArrayElements(env, filaB, B, JNI_ABORT);
  			(*env)->ReleaseIntArrayElements(env, filaC, C, 0);
  			(*env)->SetObjectArrayElement(env, matrizC, index, filaC);  				
  			(*env)->DeleteLocalRef(env, filaA);
  			(*env)->DeleteLocalRef(env, filaB);
  			(*env)->DeleteLocalRef(env, filaC);  			
  		}
  		
  		return matrizC;
  }


