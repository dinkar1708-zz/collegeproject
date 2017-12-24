#include<stdio.h>
#include<conio.h>
void swapr(int,int);
void main()
{
	int i, j;
	clrscr();
	printf("Please Enter the First Number in A : ");
	scanf("%d",&i);
	printf("\nPlease Enter the Second Number in B : ");
	scanf("%d",&j);
	swapr(i,j); /* call by Value*/
	getch();
}

	/* call by value function*/
void swapr(int x,int y)
{
	int t;
	t=x;
	x=y;
	y=t;
	printf("A is now in B : %d",x);
	printf("B is now in A : %d",y);
}
