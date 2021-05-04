#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main(void){
	char *h = "Hello";
	for(int i = 0; i< 1000; i++){
	printf("%c", *(h+i));
}
}
