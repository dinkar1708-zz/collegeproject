#include<stdio.h>
#include<conio.h>
void main()
{
	int num,digitsum=0;
	clrscr();
	printf("Enter the number:-\n");
	scanf("%d",&num);
	while(num>0)
	{
		digitsum+=num%10;
		num/=10;
	}
	printf("The sum of the digit=%d",digitsum);
	getch();
}