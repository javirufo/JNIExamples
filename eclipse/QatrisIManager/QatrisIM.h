#ifndef QATRISIM_H_
#define QATRISIM_H_

#include <jni.h>
#define USER_CLASSPATH "."
#include <dlfcn.h>

typedef jint (JNICALL *FN)(JavaVM **pvm, void **penv, void *args);
jint EjecutaCreateJavaVM(LPCTSTR lpPathLibreria, JavaVM** pjvm, JNIEnv** penv, JavaVMInitArgs* pvm_args);
   
#endif /*QATRISIM_H_*/
