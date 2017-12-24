#include<stdio.h>
#include<conio.h>
void main()
{
	float a,b;
	int ch;
	clrscr();
	printf("Enter the first number:-\n");
	scanf("%f",&a);
	printf("Enter the second number:-\n");
	scanf("%f",&b);
	printf("***Choice Menu***\n");
	printf("1.Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division\n");
	puts("Enter your choice:-\n");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:printf("Addition=%f",a+b);
		break;
		case 2:printf("Subtraction=%f",a-b);
		break;
		case 3:printf("Multiplication=%f",a*b);
		break;
		case 4:printf("division=%f",a/b);
		break;
		default:printf("Sory! Wrong Choice.");
	}
	getch();
}