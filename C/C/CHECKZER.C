#include<stdio.h>
#include<conio.h>
void main()
{
	int num;
	clrscr();
	printf("Enter a number:-\n");
	scanf("%d",&num);
	if(num==0)
	printf("It is Zero.");
	else
	printf("It is not Zero.");
	getch();
}