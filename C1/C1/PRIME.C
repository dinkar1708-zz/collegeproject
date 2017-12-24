#include<stdio.h>
#include<conio.h>
void main()
{
	int range,i,j;
	clrscr();
	printf("Enter the range for prime number:-\n");
	scanf("%d",&range);
	printf("Prime numbers within the given range:-\n");
	for(i=2;i<range;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			break;
		}
		if(i==j)
		printf("%d\t",i);
	}
	getch();
}