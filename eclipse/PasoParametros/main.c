#include <stdio.h>
#include <fcntl.h>

int main(int argc, char **argv){
	int i;
	printf("Tengo %d parametros\n", argc);
	printf("Sus valores son:\n");
	for(i=0; i<argc; i++)
	{
		printf("Parametro %d valor %s\n", i, argv[i]);
	}
	return 0;
}
