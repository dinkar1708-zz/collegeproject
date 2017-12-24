#include<stdio.h>
#include<conio.h>
main()
{
	int i, j;
	clrscr();
	printf("Please Enter the First Number in A : ");
	scanf("%d",&i);
	printf("\nPlease Enter the Second Number in B : ");
	scanf("%d",&j);
	swapr(&i,&j); /* call by reference*/
	printf("A is now in B : %d",i);
	printf("B is now in A : %d",j);
	getch();
}

/* call by reference function*/
swapr(int *x, int *y)
{
	int t;
	t=*x;
	*x=*y;
	*y=t;
}
