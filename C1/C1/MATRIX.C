#include<stdio.h>
#include<conio.h>
void main()
{
	int a[4][4]={{4,2,0,1},{3,1,2,5},{3,2,1,4},{5,2,6,7}};
	int b[4][4]={{2,1,3,2},{5,4,2,3},{1,4,0,2},{3,2,4,1}};
	int mul[4][4],add[4][4],atrans[4][4];
	int i,j,k,ii,jj,sum1[2][2],sum2[2][2];
	clrscr();
	printf("Matrix Operation\n");
	printf("Matrix Addition is:-\n");
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
			add[i][j]=a[i][j]+b[i][j];
		}
	}
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
		printf("%d\t",add[i][j]);
		}
		printf("\n");
	}
	printf("Multiplication of the Matrix is:-\n");
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
			mul[i][j]=0;
			for(k=0;k<4;k++)
			{
			mul[i][j]+=(a[i][k]*b[k][j]);
			}
		}
	}
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
		printf("%d\t",mul[i][j]);
		}
		printf("\n");
	}
	printf("First Matrix is:-\n");
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
		printf("%d\t",a[i][j]);
		}
		printf("\n");
	}
	printf("Transpose of the first matrix is:-\n");
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
		atrans[i][j]=a[j][i];
		}
	}
	for(i=0;i<4;i++)
	{
		for(j=0;j<4;j++)
		{
		printf("%d\t",atrans[i][j]);
		}
		printf("\n");
	}
	getch();
}