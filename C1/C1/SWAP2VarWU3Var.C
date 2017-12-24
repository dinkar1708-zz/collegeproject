#include<stdio.h>
#include<conio.h>
void main()
{
	int a,b;
	clrscr();
	printf("Welcome my name is dinkar:-\n");
	printf("Enter the two numbers:-\n");
	scanf("%d%d",&a,&b);
	printf("I am going to swap two variable without using third variable.\n");
	printf("a=%d and b=%d\n",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("Now a=%d and b=%d",a,b);
	getch();
}