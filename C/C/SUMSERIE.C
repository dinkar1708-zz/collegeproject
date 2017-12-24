#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int p=1,num=1,sum=0,term;
	clrscr();
	printf("Series 1^1+3^2+5^3+7^4+.....\n");
	printf("Enter number of terms:-\n");
	scanf("%d",&term);
	while(term>=1)
	{
		sum+=pow(num,p);
		num=num+2;
		p++;
		term--;
	}
	printf("Sum of the Series=%d",sum);
	getch();
}