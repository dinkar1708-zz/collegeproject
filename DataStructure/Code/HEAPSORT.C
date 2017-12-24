#include<stdio.h>
#include<conio.h>                                             f
void MAX_HEAPIFY(int a[],int i);
void BUILD_MAX_HEAP(int a[]);
int hsize,len;
void main()
{
	int a[5000];
	int i=1,t;
	char ch;
	clrscr();
	printf("\t\tWelcome to c program.\n");
	printf("To stop press 'n'\n");
	do
	{
		printf("Enter %d number:",i);
		scanf("%d",&a[i]);
		scanf("%c",&ch);
		i++;
	}while(ch!='n');
	len=i-2,hsize=i-2;
	printf("Before sorting.\n");
	for(i=1;i<=len;i++)
	printf("%d\t",a[i]);
	BUILD_MAX_HEAP(a);
       for(i=len;i>=2;i--)
	{
		t=a[1];
		a[1]=a[i];
		a[i]=t;
		hsize--;
		MAX_HEAPIFY(a,1);
	}
	printf("\nAfter sorting.\n");
	for(i=1;i<=len;i++)
	printf("%d\t",a[i]);
	getch();
}
void BUILD_MAX_HEAP(int a[])
{
	int i;
	hsize=len;
	for(i=len/2;i>=1;i--)
	{
		MAX_HEAPIFY(a,i);
	}
}
void MAX_HEAPIFY(int a[],int i)
{
	int l,r,largest,t;
	l=i*2;
	r=(i*2)+1;
	if(l<=hsize&&a[l]>a[i])
	largest=l;
	else
	largest=i;
	if(r<=hsize&&a[r]>a[largest])
	largest=r;
	if(largest!=i)
	{
		t=a[i];
		a[i]=a[largest];
		a[largest]=t;
		MAX_HEAPIFY(a,largest);
	}
}























