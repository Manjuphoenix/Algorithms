#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main(){
	FILE *file = fopen("phonebook.csv", "a");
	if(file == NULL)
	{
		return 1;
	}
	printf("Name:");
	char name[20];
	scanf("%s", name);
	printf("Phone:");
	char phone[10];
	scanf("%s", phone);

	fprintf(file, "%s,%s \n", name, phone);

	fclose(file);
}

