#include "works.h"
JNIEXPORT jint JNICALL Java_threadsjavajni_Works_get
  (JNIEnv *env, jobject obj)
  {
  	jint valor = -1;
  	if ((*env)->MonitorEnter(env, obj)!=JNI_OK)
  		return -1;
  	//Estamos en seccion critica
  	jclass clase = (*env)->GetObjectClass(env, obj);
  	if(clase==NULL)
  	{
  	if ((*env)->MonitorExit(env, obj)!=JNI_OK)
  		return -1;
  	}
  	jfieldID campoID = (*env)->GetFieldID(env, clase, "_valor", "I");
  	if(campoID==NULL)
  	{
  	if ((*env)->MonitorExit(env, obj)!=JNI_OK)
  		return -1;
  	}
  	valor = (*env)->GetIntField(env, obj, campoID);
  	(*env)->SetIntField(env, obj, campoID, (jint) -1);
  	if ((*env)->MonitorExit(env, obj)!=JNI_OK)
  		return -1;
  	return valor;
  }

/*
 * Class:     threadsjavajni_Works
 * Method:    put
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_threadsjavajni_Works_put
  (JNIEnv *env, jobject obj, jint job)
  {
  	if ((*env)->MonitorEnter(env, obj)!=JNI_OK)
  		return;
  	//Estamos en seccion critica
  	//Estamos en seccion critica
  	jclass clase = (*env)->GetObjectClass(env, obj);
  	if(clase==NULL)
  	{
  	if ((*env)->MonitorExit(env, obj)!=JNI_OK)
  		return;
  	}
  	jfieldID campoID = (*env)->GetFieldID(env, clase, "_valor", "I");
  	if(campoID==NULL)
  	{
  	if ((*env)->MonitorExit(env, obj)!=JNI_OK)
  		return;
  	}
  	(*env)->SetIntField(env, obj, campoID, job);
  	
  	if ((*env)->MonitorExit(env, obj)!=JNI_OK)
  		return;  	
  }

