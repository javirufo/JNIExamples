#include <stdio.h>
#include <stdlib.h>
#include "funciones.h"

int main(int argc, char **argv){
	int resultado;
	if (argc!=3)
	{
		printf("Este programa solo suma dos valores\n");
		return -1;
	}
	resultado = sumavalores(atoi(argv[1]), atoi(argv[2]));
	printf("El resultado es %d\n", resultado);
	return 0;
}

