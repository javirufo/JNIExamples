#include "metodos.h"

JNIEXPORT void JNICALL Java_metodosconstructores_Main_Constructores
  (JNIEnv *env, jclass clase)
  {
  	jmethodID constructorSimple = (*env)->GetMethodID(env, clase, "<init>", "()V");
  	if(constructorSimple==NULL)
  	{
  		printf("Metodo no encontrado\n");
  		return;
  	}
  	printf("Objeto1 a crear\n");
  	jobject objeto1 = (*env)->NewObject(env, clase, constructorSimple);
  	printf("Objeto1 creado\n");
  	jmethodID constructorComplejo = (*env)->GetMethodID(env, clase, "<init>", "(Ljava/lang/String;II)V");
  	if(constructorComplejo==NULL)
  	{
  		printf("Metodo no encontrado\n");
  		return;
  	}
  	printf("Objeto2 a crear\n");
  	jobject objeto2 = (*env)->NewObject(env, clase, constructorComplejo, (*env)->NewStringUTF(env, "HOLA"), 1, 2);
  	printf("Objeto2 creado\n");
	jmethodID Imprime = (*env)->GetMethodID(env, clase, "ImprimeValores", "()V");
  	if(Imprime==NULL)
  	{
  		printf("Metodo no encontrado\n");
  		return;
  	}	
	(*env)->CallVoidMethod(env, objeto1, Imprime);
	(*env)->CallVoidMethod(env, objeto2, Imprime);
  }
