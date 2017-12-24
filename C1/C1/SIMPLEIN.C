#include<stdio.h>
#include<conio.h>
void main()
{
	float r,t,pamount,si;
	clrscr();
	printf("Enter the rate:-\n");
	scanf("%f",&r);
	printf("Enter the time:-\n");
	scanf("%f",&t);
	printf("Enter the principle amount:-\n");
	scanf("%f",&pamount);
	si=(pamount*r*t)/100;
	printf("Simple Interest=%f",si);
	getch();
}