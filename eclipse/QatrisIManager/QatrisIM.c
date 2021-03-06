#include "QatrisIM.h"

   int main(int argc, char* argv[]) {     
       
       JNIEnv *env;
       JavaVM *jvm;
       jint res;
       if(argc!=2)
       {
       		printf("Debe pasar la clase a ejecutar por parametro\n");
       		printf("Ejemplo: invocationinterface clase\n");
       		return(-1);
       }

		JavaVMInitArgs vm_args;       
		JavaVMOption options[2];
		options[0].optionString ="-Djava.class.path=./dist/QatrisImanager.jar;./dist/lib/*;./jre/lib/*";
		options[0].extraInfo = NULL;
		options[0].optionString ="-Djava.library.path=./dll";
		options[0].extraInfo = NULL;
		vm_args.version = JNI_VERSION_1_2;       
		vm_args.options = options;
	    vm_args.nOptions = 2;
	    vm_args.ignoreUnrecognized = JNI_FALSE;
       	// Create the Java VM 
       	res = JNI_CreateJavaVM(&jvm, (void**)&env, &vm_args);
       	if (res < 0) {
            fprintf(stderr, "Can't create Java VM\n");
            return(1);
       	}
		printf("Resultado de crear la vm %d\n", res);       
		jclass cls = (*env)->FindClass(env, argv[1]);       
		if (cls == NULL) {
			printf("No se encuentra la clase %s\n", argv[1]);
            goto destroy;
		}
       
		jmethodID mid = (*env)->GetStaticMethodID(env, cls, "main","([Ljava/lang/String;)V");
		if (mid == NULL) {
				printf("La clase no contiene metodo main\n");
				goto destroy;
		}
		
		jstring jstr = (*env)->NewStringUTF(env, " desde JNI!");
		if (jstr == NULL) {
			goto destroy;
		}
		jclass stringClass = (*env)->FindClass(env, "java/lang/String");
		jobjectArray args = (*env)->NewObjectArray(env, 1, stringClass, jstr);
		if (args == NULL) {
			goto destroy;
		}
		(*env)->CallStaticVoidMethod(env, cls, mid, args);
		
destroy:
			if ((*env)->ExceptionOccurred(env)) {
				//(*env)->ExceptionDescribe(env);
			}
			(*jvm)->DestroyJavaVM(jvm);
		return(0);
}



jint EjecutaCreateJavaVM(LPCTSTR lpPathLibreria, JavaVM** pjvm, JNIEnv** penv, JavaVMInitArgs* pvm_args){
	FN fn;
	HINSTANCE hVM = LoadLibrary(lpPathLibreria);
	if(hVM==0)
	{
		fprintf(stderr, "Error al cargar librerias\n");
		return -1;
	}
	fn = (FN)GetProcAddress(hVM, "Creacion m�quina JAVA\n");
	if (fn==NULL)
	{
		fprintf(stderr, "Error al cargar la m�quina virtual\n");
		return -1;
	}
	return fn(pjvm, (void**) penv, pvm_args);
}		

