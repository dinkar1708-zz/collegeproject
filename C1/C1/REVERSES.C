#include<stdio.h>
#include<conio.h>
void main()
{
	char str[100],rev[100];
	clrscr();
	printf("Enter the string:-\n");
	gets(str);
	printf("Reverse=%s",strrev(str));
	getch();
}