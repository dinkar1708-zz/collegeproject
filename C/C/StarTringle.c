#include<stdio.h>
#include<conio.h>
void main()
{

	int i,j,k=0,l=-1;
	char str[]={'A','B','C','D','E'};
	for(i=0;i<5;i++)
	{
	     for(j=4;j>i;j--)
	     printf(" ");
	     for(j=0;j<=i;j++)
	     printf("*");
	     k=0;
	     k=l;
	     for(j=0;j<i;j++)
	     printf("*");
	     printf("\n");
	     k=0;l++;
	}
	getch();
}