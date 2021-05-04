#include<stdio.h>
#include<stdint.h>

typedef uint8_t BYTE;

int main(int argc, char *argv[]){
	if(argc != 2){
		printf("Invalid");
		return 1;
	}

	FILE *file = fopen(argv[1], "r");
	if(file == NULL)
	{
		return 1;
	}

	BYTE bytes[3];
	fread(bytes, sizeof(BYTE), 3, file);
	
	if(bytes[0] == 0xff && bytes[1] == 0xd8 && bytes[2] == 0xff)
	{
		printf("JPG");
	}
	else
	{
		printf("Not JPG");
	}
}

