#include<stdio.h>
#include<conio.h>
#define MAX 4
void insert();
void del();
void choice();
void display();
int FRONT=-1,REAR=-1;
int queue[MAX];
void main()
{
	int i,ch;
	clrscr();
	printf("Note there is some drawback of Linear Queue! So I prefer circulr Queue.\n");
	do
	{       choice();
		printf("Enter your choice:-\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:insert();
			break;
			case 2:del();
			break;
			case 3:display();
			break;
			case 4:exit(0);
			default:printf("Sorry! Wrong Choice.\n");
		}

	}while(1);
}
void choice()
{
	puts("\t***Choice Menu****");
	printf("\n1.Push.\n2.Pop\n3.DisplayQueue\n4.Exit.\n");
}
void insert()
{
	int value;
	if(REAR==MAX-1)
	{
		printf("OVERFLOW! Stack is full!\n");
		return;
	}
	else
	{
		puts("Enter the value to put in to queue:-\n");
		scanf("%d",&value);
		queue[REAR++]=value;
		if(FRONT==-1&&REAR==-1)
		FRONT++;
		puts("Item Pushed successfully.\n");
	}
}
void del()
{
	int item;
	if(FRONT==-1&&REAR==-1)
	{
		puts("UNDERFLOW! Sorry! Queue is empty\n");
		return;
	}
	else if(FRONT==REAR)
	{
		FRONT=-1;REAR=-1;
		puts("UNDERFLOW! Sorry! Queue is empty\n");
		return;
	}

	else
	{
		item=queue[FRONT];
		FRONT++;
		printf("Item %d deleted successfully.\n",item);
	}
}
void display()
{
	int i;
	if(FRONT==-1&&REAR==-1)
	{
		printf("Queue is empty!\n");
		return;
	}
	else
	{
		puts("Content of the queue is:-\n");
		for(i=FRONT;i<REAR;i++)
		printf(":%d\t",queue[i]);
	}
}