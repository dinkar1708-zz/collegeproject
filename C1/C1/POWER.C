#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int X,Y,p;
	clrscr();
	printf("To find X^y:-\n");
	printf("Enter the value of X:-\n");
	scanf("%d",&X);
	printf("Enter the value of Y:-\n");
	scanf("%d",&Y);
	p=pow(X,Y);
	printf("X to power Y:-  %d\n",p);
	getch();
}