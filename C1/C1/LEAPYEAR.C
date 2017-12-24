#include<stdio.h>
#include<conio.h>
void main()
{
	int year;
	clrscr();
	printf("Leap Year:-\n");
	printf("Enter the year:-\n");
	scanf("%d",&year);
	if(year%4==0)
	printf("Leap Year");
	else
	printf("Not a Leap Year.");
	getch();
}