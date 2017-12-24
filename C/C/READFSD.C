#include<stdio.h>
#include<conio.h>
void main()
{

	FILE* fptr;
	int i;
	char ch;
	clrscr();
	printf("Reading text from DATA file and showing upper case character:-\n");
	if((fptr=fopen("DATA.txt","r"))==NULL)
	{
	   fprintf(stderr, "Cannot open file.\n");
	   exit(0);

	}
	else
	{
	  while(i!=EOF)
	  {
		i=getc(fptr);
		if(i>65&&i<91)
		putchar(i);
	  }
	}
	fclose(fptr);
	getch();
}