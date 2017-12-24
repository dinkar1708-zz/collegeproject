#include<stdio.h>
#include<conio.h>
void main()
{
	int i;
	clrscr();
	printf("Showing do while loop\n");
	i=1;
	do
	{
	printf("%d",i);
	i++;
	}while(i<10);
	getch();
}