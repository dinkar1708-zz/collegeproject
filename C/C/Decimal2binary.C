#include<stdio.h>
#include<conio.h>
void main()
{
	long int num;
	int bin[200],i=0,len=0;
	clrscr();
	printf("Enter a number to calculate binary equivalent:-\n");
	scanf("%ld",&num);
	while(num>0)
	{
		bin[i]=num%2;
		num/=2;
		len++,i++;
	}
	printf("The Binary number is:-\n");
	for(i=len-1;i>=0;i--)
	printf("%d\t",bin[i]);
	getch();
}