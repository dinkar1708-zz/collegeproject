#include<stdio.h>
#include<conio.h>
void main()
{

	FILE* fptr;
	clrscr();
	printf("Crreating DATA file and storing some data:-\n");
	if((fptr=fopen("DATA.txt","w"))==NULL)
	{
	   fprintf(stderr, "Cannot create file.\n");
	   exit(0);

	}
	else
	{
		fprintf(fptr,"%s","Writing some data on file.Hello This is Dinkar Prasad Maurya from varanasi.This file is created.");
	}
	fclose(fptr);
	getch();
}
