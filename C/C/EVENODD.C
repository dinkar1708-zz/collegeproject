#include<stdio.h>
#include<conio.h>
void main()
{
	int num;
	clrscr();
	printf("Enter the number:-\n");
	scanf("%d",&num);
	if(num%2==0)
	printf("Even");
	else
	printf("Odd");
	getch();
}