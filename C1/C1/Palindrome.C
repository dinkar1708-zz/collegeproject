#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int num,revn=0,p=0,temp,tdigit=0,originalnumber;
	clrscr();
	printf("Enter the number:-\n");
	scanf("%d",&num);
	temp=num;
	originalnumber=num;
	while(temp>0)
	{
		temp/=10;
		tdigit++;
	}
	while(num>0)
	{
		revn+=((num%10)*pow(10,tdigit-1));
		num/=10;
		p++;
		tdigit--;
	}
	printf("Reverse %d\n",revn);
	if(originalnumber==revn)
	printf("Palindrome.");
	else
	printf("Not palindrome.");
	getch();
}