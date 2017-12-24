#include<stdio.h>
#include<conio.h>
void main()
{
	int i,sum=0;
	float avg;
	clrscr();
	printf("Sum and average of first 10 natural number:-\n");
	for(i=1;i<=10;i++)
	{
		sum+=i;
	}
	avg=sum/10;
	printf("Sum=%d\n Average=%f",sum,avg);
	getch();
}