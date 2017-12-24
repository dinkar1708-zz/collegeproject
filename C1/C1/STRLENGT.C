#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[100];
	int len;
	clrscr();
	puts("Enter a string:-\n");
	scanf("%s",str);
	len=strlen(str);
	puts("The length of the string:-\n");
	printf("%d",len);
	getch();
}