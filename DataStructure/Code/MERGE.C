#include<stdio.h>
#include<conio.h>

void MERGE_SORT(int a[],int p,int r);
void MERGE(int a[],int p,int q,int r);
void main()
{
	int a[5000],len,i=1,p,r;
	char ch='t';
	clrscr();
	printf("\t\tWelcome to the c program.\n\n");
	printf("To stop press 'n'\n");
	do
	{
		printf("Enter the elment: ");
		scanf("%d",&a[i]);
		scanf("%c",&ch);
		i++;
	}while(ch!='n');
	len=i-2;
	printf("The element of the array are: \n");
	for(i=1;i<=len;i++)
	printf("%d\t",a[i]);
	p=1,r=len;
	MERGE_SORT(a,p,r);
	printf("\nThe element of the array after merge sorting: \n");
	for(i=1;i<=len;i++)
	printf("%d\t",a[i]);
	getch();
}
void MERGE_SORT(int a[],int p,int r)
{
	int q;
	if(p<r)
	{
		q=(p+r)/2;
		MERGE_SORT(a,p,q);
		MERGE_SORT(a,q+1,r);
		MERGE(a,p,q,r);
	}
}

void MERGE(int a[],int p,int q,int r)
{
	int n1,n2,i,j,k;
	int L[500],R[500];
	n1=q-p+1,n2=r-q;
	for(i=1;i<=n1;i++)
	{
		L[i]=a[p+i-1];
	}
	for(j=1;j<=n2;j++)
	{
		R[j]=a[q+j];
	}

	L[n1+1]=32767;
	R[n2+1]=32767;
	i=1,j=1;
	for(k=p;k<=r;k++)
	{
		if(L[i]<=R[j])
		{
			a[k]=L[i];
			i++;
		}
		else
		{
			a[k]=R[j];
			j++;
		}
	}
}
