#include<stdio.h>
#include<conio.h>
void main()
{
	int num=1;
	clrscr();
	printf("Displaying Ascii Character:-\n");
	printf("Value\tAscii value\n");
	while(num<256)
	{
		printf("%d\t%c",num,num);
		num++;
		printf("\n");
	}
	getch();
}