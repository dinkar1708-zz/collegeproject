#include<stdio.h>
#include<conio.h>
void BINARY(int value[],int l,int s);
struct ar
{
	int value[100];
	int index[100];
};struct ar a;
void main()
{
	int i=1,len,search,t,j;
	char ch;
	clrscr();
	printf("\t\tWelcome to c program.\n");
	printf("To stop press 'n'.\n");
	do
	{
		printf("Enter %d number:",i);
		scanf("%d",&a.value[i]);
		a.index[i]=i;
		scanf("%c",&ch);
		i++;
	}while(ch!='n');
	len=i-1;
	for(i=1;i<len-1;i++)
	{
		for(j=1;j<len-i;j++)
		{
			if(a.value[j]>a.value[j+1])
			{
				t=a.value[j];
				a.value[j]=a.value[j+1];
				a.value[j+1]=t;
			       /*	t=a.index[j];
				a.index[j]=a.index[j+1];
				a.index[j+1]=t;*/

			}
		}
	}
	for(i=1;i<len;i++)
	{
		printf("%d\t",a.value[i]);
	}
	printf("\nEnter the value of search.\t");
	scanf("%d",&search);
	BINARY(a.value,len,search);
	getch();
}
void BINARY(int value[],int l,int item)
{
	int beg=1,end=l,mid,loc=0;
	mid=(beg+end)/2;
	while(beg<end)
	{
		mid=(beg+end)/2;
		if(item<a.value[mid])
		end=mid;
		else
		beg=mid;
		if(a.value[mid]==item)
		{
			loc=mid;
			break;
		}
	}
	if(loc==0)
	printf("Item not found");
	else
	{
		printf("Item found.");
		printf("Position:%d",a.index[mid]);
	}
}




















