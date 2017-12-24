//PROGRAM FOR BUBBLE SORT.


#include<stdio.h>
#include<conio.h>
int i,a[1000],size;

void INPUT(int array[],int len);
void BUBBLE(int array[],int len);

void main()
{
	clrscr();
	printf("\nEnter the size of the array\n\n");
	scanf("%d",&size);
	INPUT(a,size);//to input value in the array.
	BUBBLE(a,size);//to sort array.
	getch();
}
void INPUT(int array[],int len)
{
	printf("\nEnter the %d numbers\n",len);
	for(i=0;i<len;i++)
	scanf("%d",&array[i]);
}
void BUBBLE(int array[],int len)
{
	int j,t;
	for(i=1;i<len;i++)
	{
		for(j=0;j<len-i;j++)
		{
			if(array[j]>array[j+1])
			{
			t=array[j];
			array[j]=array[j+1];
			array[j+1]=t;
			}
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
33                                                                              
11                                                                              
99                                                                              
77                                                                              
44                                                                              
77                                                                              
66                                                                              
44                                                                              
55                                                                              
22                                                                              
                                                                                
The sorted array is:                                                            
11      22      33      44      44      55      66      77      77      99   
