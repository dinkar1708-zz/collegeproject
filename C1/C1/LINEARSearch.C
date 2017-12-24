#include<stdio.h>
#include<conio.h>
void LINEAR(int a[],int len,int s);
void main()
{
	int ar[1000];
	int i=1,k,len,search;
	char ch;
	clrscr();
	printf("\t\tWelcome to c program.\n");
	printf("To stop press 'n'");
	do
	{
		printf("\nEnter %d number:",i);
		scanf("%d",&ar[i]);
		scanf("%c",&ch);
		i++;
	}while(ch!='n');
	len=i-1;
	printf("Enter the number to search.\t");
	scanf("%d",&search);
	LINEAR(ar,len,search);
	getch();
}
void LINEAR(int a[],int len,int s)
{
	int i,k=0,found[1000];
	for(i=1;i<len;i++)
	{
		if(a[i]==s)
		{
			found[k++]=i;
		}
	}
	if(k==0)
	{
		printf("Sorry! unsucessful search.");
		getch();
		exit(0);
	}
	else
	{
		printf("Sucessful search.\n");
		printf("The position of the elements.\n");
		for(i=0;i<k;i++)
		printf("%d\t",found[i]);
	}

}



