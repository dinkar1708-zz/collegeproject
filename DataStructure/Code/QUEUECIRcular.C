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
	puts("\n\t***Choice Menu for Circular Queue.****");
	printf("\n1.Push.\n2.Pop\n3.DisplayQueue\n4.Exit.\n");
}
void insert()
{
	int value;
	if(FRONT==(REAR+1)%MAX)
	{
		printf("OVERFLOW! Stack is full!\n");
		return;
	}
	else
	{
		puts("Enter the value to put in to queue:-\n");
		scanf("%d",&value);
		REAR=(REAR+1)%MAX;
		queue[REAR]=value;
		if(FRONT==-1)
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
	if(FRONT==REAR)
	{
		item=queue[FRONT];
		FRONT=(FRONT+1)%MAX;
		printf("Item %d deleted successfully.\n",item);
		FRONT=-1;REAR=-1;
		return;
	}
	else
	{
		item=queue[FRONT];
		FRONT=(FRONT+1)%MAX;
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
		for(i=FRONT;i<=REAR;i++)
		printf(":%d\t",queue[i]);
	}
}