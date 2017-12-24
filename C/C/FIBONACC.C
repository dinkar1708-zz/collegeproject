#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=1,k,sum=0;
	clrscr();
	printf("Series 0+1+1+2+3+5+8+13+21.....\n");
	while(i<5)
	{
		k=i+j;
		sum+=k;
		i=j;j=k;
	}
	printf("Sum of the Series=%d",sum+1);
	getch();
}