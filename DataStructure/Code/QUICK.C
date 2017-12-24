#include<stdio.h>
#include<conio.h>

void QUICK(int a[],int p,int r);
int PARTITION(int a[],int p,int r);
void main()
{
	int a[100];
	int p=1,r,i,size;
	clrscr();
	printf("Enter the size of the array.\n");
	scanf("%d",&size);
	printf("Enter the five numbers.\n");
	for(i=1;i<=size;i++)
	scanf("%d",&a[i]);
	r=size;

	QUICK(a,p,r);

	printf("After sorting.\n");
	for(i=1;i<=size;i++)
	printf("%d\t",a[i]);
	getch();
}
void QUICK(int a[],int p,int r)
{

	int q;
	if(p<r)
	{
		q=PARTITION(a,p,r);
		QUICK(a,p,q-1);
		QUICK(a,q+1,r);
	}
}
int PARTITION(int a[],int p,int r)
{
	int x,i,j,t;
	x=a[r];
	i=p-1;
	for(j=p;j<=r-1;j++)
	{
		if(a[j]<=x)
		{
			i++;
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
	t=a[i+1];
	a[i+1]=a[r];
	a[r]=t;
	return i+1;
}


