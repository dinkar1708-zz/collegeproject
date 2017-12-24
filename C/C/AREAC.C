#include<stdio.h>
#include<conio.h>
void main()
{
	float area,r;
	clrscr();
	printf("Enter the radius of the circle:-");
	scanf("%f",&r);
	area=3.14*r*r;
	printf("Area of the circle=%f",area);
	getch();
}