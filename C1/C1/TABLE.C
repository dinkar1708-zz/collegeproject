#include<stdio.h>
#include<conio.h>
void main()
{
	int num,i;
	clrscr();
	printf("Enter the number:-\n");
	scanf("%d",&num);
	printf("Table of the given number:-\n");
	for(i=1;i<=10;i++)
	{
		printf("%d*%d=%d\n",i,num,i*num);
	}
	getch();
}