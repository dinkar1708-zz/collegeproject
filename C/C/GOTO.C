#include<stdio.h>
#include<conio.h>
void main()
{
	int num;
	clrscr();
	Step1:
	printf("Enter a number:-\n");
	scanf("%d",&num);
	if(num<0)
	goto Step1;
	printf("It is greater than Zero.");
	getch();
}