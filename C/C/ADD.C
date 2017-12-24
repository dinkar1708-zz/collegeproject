#include<stdio.h>
#include<conio.h>
void main()
{
	int n1,n2,sum;
	clrscr();
	printf("Add two Numbers:-\n");
	puts("Enter the first number:-\n");
	scanf("%d",&n1);
	puts("Enter the second number:-\n");
	scanf("%d",&n2);
	sum=n1+n2;
	puts("Addition of the two numberis:-\n");
	printf("%d",sum);
	getch();
}