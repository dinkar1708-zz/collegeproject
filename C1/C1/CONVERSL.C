#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[100],lowerstr[100];
	clrscr();
	printf("Enter the string:-\n");
	gets(str);
	printf("String after converting in lower case:-\n");
	puts(strlwr(str));
	getch();
}