#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b,c;
	float avg;
	clrscr();
	printf("Largest among three numbers:-\n");
	printf("Enter the first number:-\n");
	scanf("%d",&a);
	printf("Enter the second number:-\n");
	scanf("%d",&b);
	printf("Enter the third number:-\n");
	scanf("%d",&c);
	if(a>b)
	{
		if(a>c)
		printf("%d is the largest.",a);
	}
	else if(b>c)
	{
		if(b>a)
		printf("%d is the largest.",b);
	}
	else
	printf("%d is the largest.",c);
	getch();
}