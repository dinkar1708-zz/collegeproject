                                                                         
#include<stdio.h>
#include<conio.h>

int i,a[1000],size;

void INPUT(int array[],int len);
void INSERTION(int array[],int len);

void main()
{
	clrscr();
	printf("\nEnter the size of the array:-\n\n");
	scanf("%d",&size);
	INPUT(a,size);//to input value in the array.
	INSERTION(a,size);//to sort array.
	getch();
}
void INPUT(int array[],int len)
{
	printf("\nEnter the %d numbers:-\n",len);
	for(i=0;i<len;i++)
	scanf("%d",&array[i]);
}
void INSERTION(int array[],int len)
{
	int j,key;
	for(i=1;i<len;i++)
	{
		key=a[i];
		j=i-1;
		while((a[j]>key)&&(j>=0))
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
	printf("\nThe sorted array is:-x\n");
	for(i=0;i<len;i++)
	printf("%d\t",array[i]);
}
  
OUTPUT:-

Enter the size of the array:-                                                   
                                                                                
5                                                                               
                                                                                
Enter the 5 numbers:-                                                           
44                                                                              
10                                                                              
30                                                                              
22                                                                              
60                                                                              
                                                                                
The sorted array is:-                                                           
10      22      30      44      60                                              
