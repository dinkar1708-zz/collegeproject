#include<stdio.h>
#include<conio.h>
int i,a[1000],size;

void INPUT(int array[],int len);
void SELECTION(int array[],int len);

void main()
{
	clrscr();
	printf("\nEnter the size of the array\n\n");
	scanf("%d",&size);
	INPUT(a,size);//to input value in the array.
	SELECTION(a,size);//to sort array.
	getch();
}
void INPUT(int array[],int len)
{
	printf("\nEnter the %d numbers\n",len);
	for(i=0;i<len;i++)
	scanf("%d",&array[i]);
}


void SELECTION(int array[],int len)
{
	int j,t,min,loc;
	for(i=0;i<len;i++)
	{
		min=a[i];
		loc=i;
		for(j=i+1;j<len;j++)
		{
			if(array[j]>=min)
			{
			min=array[j];
			loc=j;
			}
		}
		if(loc!=i)
		{
			t=array[i];
			array[i]=array[loc];
			array[loc]=t;
		}
	}
	printf("\nThe sorted array is:\n");
	for(i=0;i<len;i++)
	printf("%d\t",array[i]);
}
                                                                                
                                                                                
OUTPUT:-

Enter the size of the array                                                     
                                                                                
10                                                                              
                                                                                
Enter the 10 numbers                                                            
44                                                                              
0                                                                               
11                                                                              
22                                                                              
66                                                                              
11                                                                              
99                                                                              
44                                                                              
77                                                                              
88                                                                              
                                                                                
The sorted array is:                                                            
99      88      77      66      44      44      22      11      11      0       
