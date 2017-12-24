#include<stdio.h>
#include<conio.h>
void main()
{
	int num,a,b,c;
	clrscr();
	printf("Enter the 3 digit number:-");
	scanf("%d",&num);
	a=num/100;
	b=(num/10)%10;
	c=(num%100)%10;
	if((a*a*a+b*b*b+c*c*c)==num)
	printf("Armstrong number");
	else
	printf("Not a Armstrong number");
	getch();
}